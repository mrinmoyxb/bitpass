package com.example.passwordmanager.View.PassWordGenerator.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.passwordmanager.R
import com.example.passwordmanager.ViewModel.PasswordGenerator.PasswordGeneratorViewModel

@Composable
fun CopyButton(viewModel: PasswordGeneratorViewModel){
    Card(
        modifier = Modifier
            .height(100.dp)
            .width(100.dp)
            .clickable {},
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.supporting_color3), shape = RoundedCornerShape(20.dp))
                .clickable(onClick = { }),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(id = R.drawable.copy_icon),
                contentDescription = "refresh",
                modifier = Modifier.size(50.dp))
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DisplayRefreshButton(){
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(colorResource(id = R.color.background_color))
//            .padding(10.dp)
//    ) {
//        //RefreshButton()
//    }
//}