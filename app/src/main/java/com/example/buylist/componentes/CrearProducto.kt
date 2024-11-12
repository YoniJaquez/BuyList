package com.example.buylist.componentes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
@Preview
fun CrearProductoPreview(){
    CrearProducto()

}
@Composable
fun CrearProducto(


){
    var editarCampos by remember { mutableStateOf(true) }
    var nombre by remember { mutableStateOf("") }
    var categoria by remember { mutableStateOf("") }
    var fecha by remember { mutableStateOf("") }
    var subCategoria by remember { mutableStateOf("") }
    var precio by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {
        TextItem(titulo = "Nombre", text = " ") {}
        TextItem(titulo = "Fecha", text = " ") {}
        TextItem(titulo = "Nombre", text = " ") {}
        TextItem(titulo = "Nombre", text = " ") {}

        Button(onClick = { editarCampos = false },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xff6200ee)),
            shape = RoundedCornerShape(10.dp)

        ) {
            Text(text = "Guardar",
                modifier = Modifier
            )
        }

    }

}






@Composable
fun TextItem(
    titulo : String,
    text: String,
    cambioValor: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, 5.dp)

    ) {

        Text( modifier = Modifier.padding(5.dp),
            text = titulo,
            fontSize = 15.sp,
            style = TextStyle(
                fontWeight = FontWeight.Bold)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(10.dp))
                .border(width = 1.dp, color = Color(0xff6200ee), shape = RoundedCornerShape(10.dp))
                .padding(10.dp, 5.dp)

        ) {
            BasicTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(10.dp, 5.dp),
                value = text,
                onValueChange = { cambioValor(it) }
            ){
                Text(text = text)
            }
        }
    }
}