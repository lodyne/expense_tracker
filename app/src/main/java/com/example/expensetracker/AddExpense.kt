package com.example.expensetracker


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.expensetracker.viewmodel.BudgetViewModel
import com.example.expensetracker.viewmodel.CategoryViewModel
import com.example.expensetracker.viewmodel.ExpenseViewModel


@Composable
fun AddExpense(
    expenseViewModel: ExpenseViewModel = viewModel(),
    categoryViewModel : CategoryViewModel = viewModel(),
    budgetViewModel : BudgetViewModel = viewModel(),
    navController: NavController
){
    var name by remember { mutableStateOf("") }
    var amount by remember { mutableStateOf("") }

    val categories = categoryViewModel.categories
    val budgets = budgetViewModel.budgets

    var selectedCategory by remember { mutableStateOf("")}
    var selectedBudget by remember { mutableStateOf("")}


    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
    ){
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(25.dp),
            singleLine = false,
            label = {
                Text(
                    text = "Name",
                    textAlign = TextAlign.Center
                )
            },
            placeholder = {
                Text(
                    text = "Add name"
                )
            }

        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = amount,
            onValueChange = { amount = it },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(25.dp),
            singleLine = false,
            label = {
                Text(
                    text = "Amount",
                    textAlign = TextAlign.Center
                )
            },
            placeholder = {
                Text(
                    text = "Add amount"
                )
            }

        )

        Spacer(modifier = Modifier.height(12.dp))

        DropdownMenuBox(
            label = "Category",
            options = categories.map {it.name},
            selectedOption = selectedCategory,
            onOptionSelected = { selectedCategory = it }
        )

        Spacer(modifier = Modifier.height(12.dp))

        DropdownMenuBox(
            label = "Budget",
            options = budgets.map {it.name},
            selectedOption = selectedBudget,
            onOptionSelected = { selectedBudget = it }
        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                val categoryId = categories.find { it.name == selectedCategory }?.id
                val budgetId = budgets.find { it.name == selectedBudget}?.id

                if( name.isNotEmpty() && amount.isNotEmpty() && categoryId != null  && budgetId != null){
                    expenseViewModel.addExpense(
                        name = name,
                        amount = amount.toInt(),
                        categoryId = categoryId,
                        budgetId = budgetId
                    )
                }

                navController.navigate(Routes.Home.routes)
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 32.dp, end =32.dp)
        ) {
            Text(
                text = "Add Expense"
            )
        }
    }

}
