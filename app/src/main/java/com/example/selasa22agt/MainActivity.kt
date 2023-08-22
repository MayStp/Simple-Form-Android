package com.example.selasa22agt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.selasa22agt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            test1.setOnClickListener {
                Toast.makeText(this@MainActivity, "Hola "+pickNama.text, Toast.LENGTH_LONG).show()
            }
//            pickNama.setOnClickListener {
//                Toast.makeText(this@MainActivity, "Hola", Toast.LENGTH_LONG).show()
//            }
        }
    }
}