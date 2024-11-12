package com.example.buylist.componentes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buylist.R


@Composable
@Preview
fun ItemListadoCantidadPreview(){
    ItemListadoCantidad(
        disminuirClick = {},
        aumentarClick = {}
    )

}
@Composable
fun  ItemListadoCantidad(
    disminuirClick: () -> Unit,
    aumentarClick: () -> Unit
){
    var cantidad by remember { mutableStateOf(1) }
    Row(
        verticalAlignment  = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(2.dp)

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
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Text(text = "Despensa",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 14.sp
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
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Aceites",
                    color = Color.White,
                    style = TextStyle(
                        fontSize = 14.sp
                    ),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xffACA5A5),
                            shape = RoundedCornerShape(15.dp)
                        )
                        .background(color = Color(0xff8800CD), shape = RoundedCornerShape(90.dp))
                        .padding(5.dp)

                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Aceite - La Joya",
            color = Color.Gray,
                style = TextStyle(

                    fontSize = 18.sp
                )
            )

        }
        Spacer(modifier = Modifier.width(16.dp))

        Column() {
            Text(text = "Cantidad",
                modifier = Modifier.fillMaxWidth(),
                color = Color.Gray,
                textAlign = TextAlign.Center,
                style = TextStyle(

                    fontSize = 15.sp
                )
            )
            Row(
                modifier = Modifier.fillMaxWidth().padding(2.dp, 0.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_substract), "",
                    modifier = Modifier
                        .clickable {
                            disminuirClick()
                            if(cantidad > 1){
                                cantidad--
                            }
                        }
                )

                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(1f)
                    ,
                    text = cantidad.toString(),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                )

                Image(
                    painter = painterResource(R.drawable.ic_add), "",
                    modifier = Modifier
                        .clickable {
                            aumentarClick()
                            cantidad++
                        }

                )
            }
        }



    }
//    Column(
//        modifier = Modifier
//            .padding(5.dp)
//            .border(1.dp, Color.DarkGray, RoundedCornerShape(35.dp))
//            .padding(5.dp)
//    ) {
//        Text(
//            modifier = Modifier,
//
//            text = "Cantidad",
//            style = TextStyle(
//                fontWeight = FontWeight.Bold,
//                fontSize = 18.sp
//            )
//        )
//        Row(
//            modifier = Modifier,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            Image(
//                painter = painterResource(R.drawable.ic_substract), "",
//                modifier = Modifier
//
//            )
//
//            Spacer(modifier = Modifier.weight(1f))
//            Image(
//                painter = painterResource(R.drawable.ic_add), "",
//                modifier = Modifier
//
//            )
//        }
//
//
//    }
}