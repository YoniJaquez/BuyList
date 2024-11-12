package com.example.buylist.ui.screen.ListadosIniciales

import android.content.ClipData.Item
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buylist.ColorLista
import com.example.buylist.R
import com.example.buylist.componentes.BarraNavegacion
import com.example.buylist.componentes.CampoTextoBusqueda
import com.example.buylist.componentes.ColorItemSelectable
import com.example.buylist.componentes.ItemListadoCantidad
import com.example.buylist.constantes.Colores


@Composable
@Preview
fun NuevosListadosPreview(){
    NuevosListados()

}

@Composable

fun NuevosListados(){
    var selectedColor: ColorLista? by remember { mutableStateOf(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        CampoTextoBusqueda(text = "Nombre Listado")
        Spacer(modifier = Modifier.height(10.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(8)
        ) {
            item{
                ColorItemSelectable(
                    color = Colores.color1,
                    selectedColor = selectedColor,
                    onSelected = { parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color2,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color3,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color4,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color5,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color6,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color7,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color8,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color9,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color10,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color11,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color12,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color13,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color14,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color15,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
            item{
                ColorItemSelectable(
                    color = Colores.color16,
                    selectedColor = selectedColor,
                    onSelected = {parametro -> selectedColor = parametro}
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
//        Column( modifier = Modifier
//            .fillMaxWidth()
//            .border(width = 2.dp, color = Color(0xffACA5A5), shape = RoundedCornerShape(0.dp))
//
//        ) {
//            Row(
//            ) {
//                ColorItemSelectable(modifier = Modifier
//                    .weight(1f)
//                    .padding(2.dp, 0.dp), color = Colores.color1)
//                ColorItemSelectable(modifier = Modifier
//                    .weight(1f)
//                    .padding(2.dp, 0.dp), color = Colores.color1)
//                ColorItemSelectable(modifier = Modifier
//                    .weight(1f)
//                    .padding(2.dp, 0.dp), color = Colores.color1)
//                ColorItemSelectable(modifier = Modifier
//                    .weight(1f)
//                    .padding(2.dp, 0.dp), color = Colores.color1)
//                ColorItemSelectable(modifier = Modifier
//                    .weight(1f)
//                    .padding(2.dp, 0.dp), color = Colores.color1)
//                ColorItemSelectable(modifier = Modifier
//                    .weight(1f)
//                    .padding(2.dp, 0.dp), color = Colores.color1)
//                ColorItemSelectable(modifier = Modifier
//                    .weight(1f)
//                    .padding(2.dp, 0.dp), color = Colores.color1)
//                ColorItemSelectable(modifier = Modifier
//                    .weight(1f)
//                    .padding(2.dp, 0.dp), color = Colores.color1)
//            }
//            Row(
//
//            ) {
//                ColorItemSelectable(color = Colores.color1)
//                ColorItemSelectable(color = Colores.color1)
//                ColorItemSelectable(color = Colores.color1)
//                ColorItemSelectable(color = Colores.color1)
//                ColorItemSelectable(color = Colores.color1)
//                ColorItemSelectable(color = Colores.color1)
//                ColorItemSelectable(color = Colores.color1)
//                ColorItemSelectable(color = Colores.color1)
//            }
//
//
//
//
//        }
//        listadosColores
        CampoTextoBusqueda(onBuscar = {}, text = "Buscar Listado")
        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            item{
                Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                ) {
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }
                    ItemListadoCantidad(disminuirClick = { }) { }

                }
            }

        }
        Button(onClick = {  },
            modifier = Modifier.padding(5.dp),
            shape = RoundedCornerShape(0.dp)
            ,
            colors = ButtonDefaults.buttonColors( Color(0xff6200ee))
        ){

            Icon(
                painter = painterResource(R.drawable.ic_save),
                contentDescription = null )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                modifier = Modifier.padding(0.dp),
                text = "Guardar",
                style = TextStyle(
                    fontSize = 16.sp
                )
            )

        }
        BarraNavegacion()

    }


}