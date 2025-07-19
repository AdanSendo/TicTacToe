package com.adansendo.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.play)
        var ops = findViewById<RadioGroup>(R.id.opGroup)
        val chk = findViewById<CheckBox>(R.id.turn)
        btn.setOnClickListener {
            val intent1 = Intent(this,Game::class.java)
            var selected = ops.checkedRadioButtonId;

            if(selected == R.id.op1)
               intent.putExtra("character",R.drawable.cross)
                else
                intent.putExtra("character",R.drawable.circle)

            intent1.putExtra("gofirst",chk.isSelected);
            startActivity(intent1)
        }
    }
}