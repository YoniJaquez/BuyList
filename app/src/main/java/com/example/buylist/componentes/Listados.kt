package com.example.buylist.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buylist.ColorLista
import com.example.buylist.R
import com.example.buylist.constantes.Colores
import com.example.buylist.ui.ListadoClass


@Composable
@Preview
fun ListadosPreview(){
   Listados()

}

@Composable

fun Listados(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            item(){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    ListadoItem(listadoclass = ListadoClass("Listado Base", color = Colores.color1))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color2))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color3))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color4))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color5))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color6))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color7))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color8))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color9))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color10))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color11))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color12))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color13))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color14))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color15))
                    ListadoItem(listadoclass = ListadoClass("Nombre Listado",color = Colores.color16))

                }
            }

        }
        Box(modifier = Modifier.fillMaxWidth().padding(16.dp)){
            IconButton(
                onClick = {  },
                modifier = Modifier
                    .padding(0.dp)
                    .width(35.dp)
                    .align(Alignment.BottomEnd)
                    .background(color = Color(0xff6200ee), shape = RoundedCornerShape(50.dp))

            ) {
                Icon(
                    tint = Color.White,
                    painter = painterResource(R.drawable.ic_plus),
                    contentDescription = null
                )
            }
        }

        BarraNavegacion()
    }


}

@Composable
fun ListadoItem(
    listadoclass: ListadoClass,
    ){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(10.dp))
            .border(width = 1.dp, color = Color(0xFFe2e2e2), shape = RoundedCornerShape(10.dp))
            .padding(10.dp, 5.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
        ColorItemSelectable(color = listadoclass.color)


        BasicTextField(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(10.dp, 5.dp)
                .weight(1f),

            value = listadoclass.titulo,
            onValueChange = {},
            textStyle = TextStyle(color = Color(0xFF858585))
        )
        Icon(
            tint = Color.Gray,
            painter = painterResource(R.drawable.ic_right), contentDescription = null)

    }

}

