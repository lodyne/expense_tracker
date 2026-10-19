package com.example.expensetracker

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.expensetracker.viewmodel.ExpenseViewModel

@Composable
fun NavGraph(expenseViewModel: ExpenseViewModel, navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.Home.routes
    ){
        composable(Routes.Home.routes){ MainScreen(expenseViewModel=expenseViewModel,navController = navController)}
        composable(Routes.Expense.routes){ AddExpense(expenseViewModel = expenseViewModel, navController = navController) }
        composable(Routes.ExpenseData.routes) { ExpenseData(expenseViewModel = expenseViewModel, navController = navController) }
    }

}
