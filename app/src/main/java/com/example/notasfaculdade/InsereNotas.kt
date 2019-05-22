package com.example.notasfaculdade

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.notas_insere.*

class InsereNotas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notas_insere)

        rectangle.setOnClickListener {
            val m1Value = m1.text.toString()
            val b1Value = b1.text.toString()
            val m2Value = m2.text.toString()
            val b2Value = b2.text.toString()
            var error = false

            if (m1Value.isEmpty()) {
                m1.error = "Obrigatorio!"
                error = true
            }

            if (b1Value.isEmpty()) {
                b1.error = "Obrigatorio!"
                error = true
            }

            if (m2Value.isEmpty()) {
                m2.error = "Obrigatorio!"
                error = true
            }

            if (b2Value.isEmpty()) {
                b2.error = "Obrigatorio!"
                error = true
            }

            if (!error) {
                val intent = Intent(this, Resultado::class.java)
                intent.putExtra("m1", m1Value.toDouble())
                intent.putExtra("b1", b1Value.toDouble())
                intent.putExtra("m2", m2Value.toDouble())
                intent.putExtra("b2", b2Value.toDouble())

                startActivity(intent)
            }
        }
    }
}