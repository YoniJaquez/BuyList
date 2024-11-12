package com.example.buylist.componentes

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buylist.R

@Composable
@Preview
fun BarraNavegacionPreview(){
    BarraNavegacion()

}
@Composable
fun BarraNavegacion(){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xff6200ee)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (modifier = Modifier.padding(8.dp)) {

            Icon(

                painter = painterResource(R.drawable.ic_back ),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(25.dp)
                    .clickable {  }

            )

            Text(text = "Listado",
                color = Color.White,
                style = TextStyle(
                    fontSize = 25.sp
                ),
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center
            )
            Icon(
                painter = painterResource(R.drawable.ic_menu ),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(25.dp)
                    .clickable {  }
            )
        }
        Divider()
        Row(modifier = Modifier.padding(5.dp, 0.dp)) {
            itemBarra(titulo = "Compra" ,R.drawable.ic_cart, onClick = {  })
            Spacer(modifier = Modifier.weight(.5f))
            itemBarra(titulo = "Listado" ,R.drawable.ic_list, onClick = {  })
            Spacer(modifier = Modifier.weight(.5f))
            itemBarra(titulo = "Productos" ,R.drawable.ic_boxes, onClick = {  })
        }




    }

}
@Composable
fun itemBarra(
    titulo: String,
    @DrawableRes icon: Int,
    onClick: () -> Unit
){
    Column(
        modifier = Modifier
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(

            painter = painterResource(icon),
            contentDescription = null,
            tint = Color.White,
            modifier = Modifier
                .size(25.dp)
        )
        Text(text = titulo,
            color = Color.White,
            style = TextStyle(
                fontSize = 15.sp
            )
        )
    }
}