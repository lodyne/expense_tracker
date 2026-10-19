package com.example.expensetracker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Expense(icon: Int, title: String, amount: String, day: String,iconColor: Color) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .size(80.dp)
            .padding(start = 24.dp, end = 24.dp, bottom = 12.dp)
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,

            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ){
                Icon(
                    painter = painterResource(icon),
                    contentDescription = title,
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape)
                        .background(iconColor)
                        .padding(6.dp),

                    )
                Spacer(modifier = Modifier.padding(6.dp))
                Text(
                    text = title,
                    textAlign = TextAlign.Center,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Column {
                Text(
                    text = amount,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = day,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
}

data class ExpenseData(
    val icon : Int,
    val title : String,
    val amount : String,
    val day : String,
    val iconColor: Color
)
@Composable
fun ExpenseList(){
    val expenses = listOf(
        ExpenseData(
            icon = R.drawable.baseline_food_bank_24,
            title = "Groceries",
            amount = "-$50.00",
            day = "Today",
            iconColor = Color.Green
        ),
        ExpenseData(
            icon = R.drawable.baseline_shopping_cart_24,
            title = "Shopping",
            amount = "-$120.00",
            day = "Yesterday",
            iconColor = Color.Red
        ),
        ExpenseData(
            icon = R.drawable.baseline_food_bank_24,
            title = "Dining Out",
            amount = "-$30.00",
            day = "Last Week",
            iconColor = Color.Magenta
        )
    )
    LazyColumn{
        items(expenses){ item ->
            Expense(
                item.icon,
                item.title,
                item.amount,
                item.day,
                item.iconColor
            )

        }

    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun ExpenseListPreview(){
    MaterialTheme{
        ExpenseList()
    }

}