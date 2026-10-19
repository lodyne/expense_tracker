package com.example.expensetracker


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.expensetracker.viewmodel.ExpenseViewModel

@Composable
fun MainScreen(expenseViewModel: ExpenseViewModel, navController: NavController){
    LaunchedEffect(Unit) {
        expenseViewModel.loadExpenses()
    }
    Column{
        Balance()
//
        Spacer(modifier = Modifier.padding(16.dp))
//
//        Transaction()
//
//        ExpenseList()

//        AddExpense()

        ExpenseData(expenseViewModel = expenseViewModel,navController = navController)




    }

}

@Preview(
    showSystemUi = true
)
@Composable
fun MainScreenPreview(){
//    MainScreen()
}