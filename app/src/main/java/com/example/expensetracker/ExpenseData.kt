package com.example.expensetracker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.navigation.NavController
import com.example.expensetracker.viewmodel.ExpenseViewModel

@Composable
fun ExpenseData(expenseViewModel: ExpenseViewModel, navController: NavController) {

    val expenses = expenseViewModel.expenses
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(expenses) { expense ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(80.dp)
                    .padding(start = 24.dp, end = 24.dp, bottom = 12.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)

                ) {


                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.baseline_food_bank_24),
                            contentDescription = "",
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(Color.Green)
                                .padding(6.dp),

                            )
                        Spacer(modifier = Modifier.padding(6.dp))
                        if (expense != null) {
                            Text(
                                text = expense.name,
                                textAlign = TextAlign.Center,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Column {
                        if (expense != null) {
                            Text(
                                text = expense.amount.toString(),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = expense.category.name,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Light
                            )
                        }
                    }
                }
            }
        }
    }
}


