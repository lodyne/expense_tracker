package com.example.expensetracker


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Transaction(){
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()

    ){
        Text(
            text = "Transactions",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,


            )
        Spacer(modifier = Modifier.padding(24.dp))
        Text(
            text = "View All",
            fontSize = 16.sp,
            fontWeight = FontWeight.Light,


            )
    }

}

@Preview(
    showSystemUi = true
)
@Composable
fun TransactionPreview(modifier : Modifier = Modifier){
    Transaction()
}