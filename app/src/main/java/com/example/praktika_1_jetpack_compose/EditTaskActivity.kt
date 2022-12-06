package com.example.praktika_1_jetpack_compose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktika_1_jetpack_compose.ui.theme.Green200
import com.example.praktika_1_jetpack_compose.ui.theme.Green700
import com.example.praktika_1_jetpack_compose.ui.theme.Praktika_1_Jetpack_ComposeTheme
import com.example.praktika_1_jetpack_compose.ui.theme.Red700

class EditTaskActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Praktika_1_Jetpack_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Green700
                ) {
                    Greeting6()
                }
            }
        }
    }
}

@Composable
fun Greeting6() {
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Изменить задачу", fontSize = 24.sp,color= Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

    }
    Box(contentAlignment = Alignment.TopEnd )
    {
        val context = LocalContext.current
        IconButton(onClick = {context.startActivity(Intent(context,MainActivity::class.java))}) {
            Image(painter= painterResource(R.drawable.backbutton),
                contentDescription="Avatar",
                modifier = Modifier
                    .padding(0.dp, 14.dp, 13.dp, 0.dp)
                    .size(56.dp)
                    .clip(CircleShape))
        }
    }

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(0.dp, 116.dp, 0.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var text by remember {
            mutableStateOf("Заголовок задачи")
        }
        var text2 by remember {
            mutableStateOf("16:30")
        }
        var text3 by remember {
            mutableStateOf("14.01.2021")
        }
        var text4 by remember {
            mutableStateOf("Описание задачи")
        }
        Box(modifier = Modifier
            .background(Green700)
            .clip(RoundedCornerShape(15.dp))) {
            OutlinedTextField(
                value = text, onValueChange = {},
                modifier = Modifier
                    .size(312.dp, 50.dp)
                    .background(White)
                    .clip(RoundedCornerShape(15))
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row() {
            Box(modifier = Modifier
                .background(Green700)
                .clip(RoundedCornerShape(15.dp))) {
                OutlinedTextField(value = text2, onValueChange = {},
                    modifier = Modifier
                        .size(148.dp, 50.dp)
                        .background(White)
                        .clip(RoundedCornerShape(15)),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.maskgroup),
                            contentDescription = "Clock",
                            modifier = Modifier.size(16.dp)
                        )
                    })
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box(modifier = Modifier
                .background(Green700)
                .clip(RoundedCornerShape(15.dp))) {
                OutlinedTextField(value = text3, onValueChange = {},
                    modifier = Modifier
                        .size(148.dp, 50.dp)
                        .background(White)
                        .clip(RoundedCornerShape(15)),
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.maskgroup_sec),
                            contentDescription = "Clock",
                            modifier = Modifier.size(16.dp)
                        )
                    })
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        Box(modifier = Modifier
            .background(Green700)
            .clip(RoundedCornerShape(15.dp))) {
            OutlinedTextField(
                value = text4, onValueChange = {},
                modifier = Modifier
                    .size(312.dp, 96.dp)
                    .background(White)
                    .clip(RoundedCornerShape(15))
            )
        }
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {

        Button(onClick = {},modifier = Modifier
            .width(324.dp)
            .height(48.dp)
            .clip(RoundedCornerShape(15.dp)),colors = ButtonDefaults.buttonColors(Red700)
        )
        {
            Text("Удалить задачу", fontSize = 18.sp, color =  Color.White)
        }
        Spacer(modifier = Modifier.height(16.dp));
        Button(onClick = {},modifier = Modifier
            .padding(0.dp, 0.dp, 0.dp, 24.dp,)
            .width(324.dp)
            .height(48.dp)
            .clip(RoundedCornerShape(15.dp)),colors = ButtonDefaults.buttonColors(Green200)

        )
        {
            Text("Записать задачу", fontSize = 18.sp, color =  Color.White)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview6() {
    Praktika_1_Jetpack_ComposeTheme {
        Greeting6()
    }
}