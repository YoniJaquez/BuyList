package com.example.buylist.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buylist.R


@Composable
@Preview
fun ItemBusquedaPreview(){
    ItemBusqueda()

}
@Composable
fun  ItemBusqueda(){
    Row(
        verticalAlignment  = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)

    ) {
        Image(
            modifier = Modifier
                .size(100.dp)
                .clip(shape = CircleShape)
                .padding(10.dp)
                .border(width = 2.dp, color = Color(0xffACA5A5), shape = RoundedCornerShape(90.dp))
                .background(
                    color = Color(0xffE2E2E2)
                )

            ,
            contentScale = ContentScale.Crop,
            painter = painterResource(R.drawable.aceitejoya ) ,
            contentDescription =""
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier.padding(5.dp).weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Despensa",
                color = Color.White,
                style = TextStyle(
                  fontSize = 16.sp
                ),
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xffACA5A5),
                        shape = RoundedCornerShape(15.dp)
                    )
                    .background(color = Color(0xffCD0000), shape = RoundedCornerShape(90.dp))
                    .padding(5.dp)

            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Aceites",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp
                ),
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = Color(0xffACA5A5),
                        shape = RoundedCornerShape(90.dp)
                    )
                    .background(color = Color(0xff8800CD), shape = RoundedCornerShape(90.dp))
                    .padding(5.dp)

            )
        }
        Spacer(modifier = Modifier.width(16.dp))

        Text(text = "Aceite - La Joya",
            color = Color.Gray,
            style = TextStyle(

                fontSize = 15.sp
            ),
            modifier = Modifier.weight(1f)

        )

    }

}