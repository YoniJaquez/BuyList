package com.example.buylist.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buylist.R
import com.example.buylist.constantes.Colores


@Composable
@Preview
fun CrearCategoriaPreview(){
    CrearCategoria(onEditar = {}, onBorrar = {}, onClickSubCategoria = {})

}
@Composable
fun  CrearCategoria(
    onClickSubCategoria : () -> Unit,
    onBorrar : () -> Unit,
    onEditar : () -> Unit

){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(10.dp))
            .border(width = 1.dp, color = Color(0xFFe2e2e2), shape = RoundedCornerShape(10.dp))
            .padding(10.dp, 5.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {


        Text(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(10.dp, 5.dp)
                .weight(1f),
                fontSize = 16.sp,
            text = "Nombre categoria",
            //textStyle = TextStyle(color = Color(0xFF858585))
        )
        Row (

        ){
            Icon(
                modifier = Modifier.clickable { onClickSubCategoria() },
                tint = Color(0xffFF0DC500),
                painter = painterResource(R.drawable.ic_plus), contentDescription = null
            )
            Spacer(modifier = Modifier.width(16.dp))

            Icon(
                modifier = Modifier
                    .size(25.dp)
                    .clickable { onEditar() },
                tint = Color(0xffFFCDA400),
                painter = painterResource(R.drawable.pen), contentDescription = null
            )
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                modifier = Modifier
                    .size(25.dp)
                    .clickable { onBorrar() },
                tint = Color.Red,
                painter = painterResource(R.drawable.trash), contentDescription = null
            )


        }

    }


}
