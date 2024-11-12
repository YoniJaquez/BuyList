package com.example.buylist.componentes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
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

@Composable
@Preview
fun ItemListadoPreview(){
    ItemListado()

}
@Composable
fun ItemListado(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(10.dp))
            .border(width = 1.dp, color = Color(0xFFe2e2e2), shape = RoundedCornerShape(10.dp))
            .padding(10.dp, 5.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
        ColorItemSelectable(color = Colores.color1)


        BasicTextField(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(10.dp, 5.dp)
                .weight(1f),

            value = "Nombre Listado",
            onValueChange = {},
            textStyle = TextStyle(color = Color(0xFF858585))
        )
        Icon(
            tint = Color.Gray,
            painter = painterResource(R.drawable.ic_right), contentDescription = null)

    }

}

@Composable
fun ColorItemSelectable(
    color: ColorLista,
    selectedColor: ColorLista ?= null,
    onSelected: ((ColorLista) -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    val colorSeleccionadoFondo = if(selectedColor == color) Colores.colorSeleccion.relleno else Color.Transparent
    val colorSeleccionadoBorde = if(color == selectedColor) Colores.colorSeleccion.borde else Color.Transparent

    Box(
        modifier = Modifier.padding(2.dp),
        contentAlignment = Alignment.Center
    ) {
        Box(modifier = modifier
            .background(color = colorSeleccionadoFondo, shape= RoundedCornerShape(90.dp))
            .border(width = 1.dp, color = colorSeleccionadoBorde, shape = RoundedCornerShape(90.dp))
            .padding(4.dp)
        ){
            Box(modifier = modifier
                .background(color = color.relleno, shape= RoundedCornerShape(90.dp))
                .border(width = 1.dp, color = color.borde, shape = RoundedCornerShape(90.dp))
                .padding(15.dp)
                .clickable {
                    if(onSelected != null){
                        onSelected.invoke(color)
                    }
                }
            ){

            }
        }
    }

}
