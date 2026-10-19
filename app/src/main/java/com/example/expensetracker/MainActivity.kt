package com.example.expensetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.expensetracker.ui.theme.ExpenseTrackerTheme
import com.example.expensetracker.viewmodel.CategoryViewModel
import com.example.expensetracker.viewmodel.ExpenseViewModel
import com.example.expensetracker.viewmodel.PostViewModel

class MainActivity : ComponentActivity() {
//    private val viewModel : PostViewModel by viewModels()
//    private val viewModel : CategoryViewModel by viewModels()
    private val expenseViewModel: ExpenseViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            ExpenseTrackerTheme {
                Scaffold(
                    floatingActionButton = {
                        FloatingExpenseButton(navController = navController)
                    },
                    content = { paddingValues ->
                        Box(modifier = Modifier.padding(paddingValues)) {

                            NavGraph(
                                expenseViewModel = expenseViewModel,
                                navController = navController
                            )
//                            PostScreen(viewModel = viewModel)
//                            CategoryScreen(viewModel=viewModel)
                        }
                    },)
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExpenseTrackerTheme {
        Greeting("Android")
    }
}