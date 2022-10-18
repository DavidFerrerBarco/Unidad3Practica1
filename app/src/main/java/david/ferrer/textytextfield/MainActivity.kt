package david.ferrer.textytextfield

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextLayoutInput
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import david.ferrer.textytextfield.ui.theme.TextYTextFieldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextYTextFieldTheme {
                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.padding(20.dp))
                    MyTextEjemplo()
                    Spacer(modifier = Modifier.padding(20.dp))
                    TextEjemplo()
                    Spacer(modifier = Modifier.padding(20.dp))
                    MyTextEjemplo2()
                    Spacer(modifier = Modifier.padding(20.dp))
                    TextEjemplo2()
                    Spacer(modifier = Modifier.padding(20.dp))
                    MyTextEjemplo3()
                }
            }

        }
    }
}


@Composable
fun MyTextEjemplo(){
    val textState = remember{ mutableStateOf(TextFieldValue()) }
    TextField(
        value = textState.value,
        onValueChange = {textState.value = it},
        modifier = Modifier
            .height(50.dp)
            .width(300.dp)
            .clip(CircleShape)
            .border(1.dp, Color.Red, CircleShape)
            .background(Color.LightGray, CircleShape)
            .rotate(180F)

    )
}

@Composable
fun TextEjemplo(){
    Text(
        text = "HOLA",
        fontWeight = FontWeight.SemiBold,
        fontSize = 30.sp,
        color = Color.Magenta,
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun MyTextEjemplo2(){
    val textState = remember{ mutableStateOf(TextFieldValue()) }
    TextField(
        value = textState.value,
        onValueChange = {textState.value = it},
        modifier = Modifier
            .height(70.dp)
            .width(200.dp)
            .clip(RectangleShape)
            .border(2.dp, Color.Black, RectangleShape)
            .background(Color.Green, RectangleShape)

    )
}

@Composable
fun TextEjemplo2(){
    Text(
        text = "NUEVO TEXTO",
        fontWeight = FontWeight.Thin,
        fontSize = 15.sp,
        color = Color.Blue,
        modifier = Modifier
            .background(Color.Yellow)
            .rotate(5F)
            .fillMaxWidth(),
        textAlign = TextAlign.Start
    )
}

@Composable
fun MyTextEjemplo3(){
    val textState = remember{ mutableStateOf(TextFieldValue()) }
    TextField(
        value = textState.value,
        onValueChange = {textState.value = it},
        modifier = Modifier
            .height(90.dp)
            .width(150.dp)
            .padding(10.dp)
            .border(2.dp, Color.Black, CircleShape)
            .background(Color.Red, RectangleShape)
            .shadow(10.dp, RectangleShape, true)
    )
}
