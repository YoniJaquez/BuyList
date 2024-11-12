package com.example.buylist.componentes

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buylist.R

@Composable
@Preview
fun CampoTextoBusquedaPreview(){
    Column {
        CampoTextoBusqueda(onBuscar = {}, text = "")
        CampoTextoBusqueda(text = "")

    }

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoTextoBusqueda(
    onBuscar: (() -> Unit)? = null,
    text: String
){

    Column(
        modifier = Modifier
        .fillMaxWidth()

    ) {
        //recibir funcion de busqueda y que pueda ser nulo
        //si la funcion NO es null, mostrar el boton de busqueda
//        OutlinedTextField(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(2.dp),
//            value = "",
//            onValueChange ={},
//            label = { Text(text = "Nombre Listado") },
//
//            colors = TextFieldDefaults.outlinedTextFieldColors(
//                focusedBorderColor = Color(0xff6200ee),
//                unfocusedBorderColor =Color(0xff6200ee)
//            )
//
//
//        )







        OutlinedTextField(
           modifier = Modifier
               .fillMaxWidth()
               .padding(2.dp),
           value = "",
           onValueChange ={},
            label = { Text(text = text) },
            trailingIcon = {
                if (onBuscar != null) {
                    Icon(
                        modifier = Modifier.clickable { onBuscar() },
                        tint = Color.Gray,
                        painter = painterResource(R.drawable.ic_buscar),
                        contentDescription = null
                    )
                }
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xff6200ee),
                unfocusedBorderColor =Color(0xff6200ee)
            )
       )
    }
}