package com.example.columnsrows.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Caja(){
    Column(modifier = Modifier
            .height(145.dp)
            .width(200.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Caja 2",
            modifier = Modifier
                .background(Color.Red)
                .padding(15.dp)

        )
        Text(
            text = "Caja 5",
            modifier = Modifier
                .background(Color.Green)
                .padding(15.dp)
        )
        Text(
            text = "Caja 8",
            modifier = Modifier
                .background(Color.Magenta)
                .padding(15.dp)
        )

    }
    Row(modifier = Modifier
        .height(145.dp)
        .width(200.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top
    ){
        Text(
            text = "Caja 1",
            modifier = Modifier
                .background(Color.Yellow)
                .padding(15.dp)
        )

        Text(
            text = "Caja 3",
            modifier = Modifier
                .background(Color.Blue)
                .padding(15.dp)
        )
    }
    Row(modifier = Modifier
        .height(145.dp)
        .width(200.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Caja 4",
            modifier = Modifier
                .background(Color.Gray)
                .padding(15.dp)
        )

        Text(
            text = "Caja 6",
            modifier = Modifier
                .background(Color.DarkGray)
                .padding(15.dp)
        )
    }
    Row(modifier = Modifier
        .height(145.dp)
        .width(200.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(
            text = "Caja 7",
            modifier = Modifier
                .background(Color.Cyan)
                .padding(15.dp)
        )

        Text(
            text = "Caja 9",
            modifier = Modifier
                .background(Color.LightGray)
                .padding(15.dp)
        )
    }
}