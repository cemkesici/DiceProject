package com.cem.zaruygulamas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Viewleri tanımlar
        var diceImage: ImageView = findViewById(R.id.imageView)
        var diceRoll: Button = findViewById(R.id.button)

        //Tuşa basıma eylemini tanımlar
        diceRoll.setOnClickListener{


            //Random bir değer üretir
            var randomDice = (1..6).random()

            // Ekranın Alt tarafında PopUp açar
            Toast.makeText(this, "Zar Değeriniz $randomDice", Toast.LENGTH_SHORT).show()

            //Random üretilen değere göre ekrana bir görsel çıktısı verir
            when(randomDice){
                1-> diceImage.setImageResource(R.drawable.dice_1)
                2-> diceImage.setImageResource(R.drawable.dice_2)
                3-> diceImage.setImageResource(R.drawable.dice_3)
                4-> diceImage.setImageResource(R.drawable.dice_4)
                5-> diceImage.setImageResource(R.drawable.dice_5)
                6-> diceImage.setImageResource(R.drawable.dice_6)
            }

        }
    }
}