package com.example.expensetracker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
fun Balance(){
    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .size(250.dp)
                .padding(start= 24.dp,top = 50.dp,end=24.dp),
            shape = RoundedCornerShape(25.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer
            )
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 36.dp)
            ) {
                Text(
                    text = "Total Balance",
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(
                    text = "$ 10000.00",
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    fontSize = 36.sp
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)

                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_south_24),
                            contentDescription = "Income Icon",
                            modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .background(Color.LightGray)
                                .padding(4.dp),

                            tint = Color.Green
                        )
                        Spacer(modifier = Modifier.padding(4.dp))

                        Column{
                            Text(
                                text = "Income",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = "$ 15000.00",
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_north_24),
                            contentDescription = "Income Icon",
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(24.dp)
                                .background(Color.LightGray)
                                .padding(4.dp),
                            tint = Color.Red

                        )

                        Spacer(modifier = Modifier.padding(4.dp))

                        Column{
                            Text(
                                text = "Expenses",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.SemiBold

                            )
                            Text(
                                text = "$ 5000.00",
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun BalancePreview(){
    Balance()
}