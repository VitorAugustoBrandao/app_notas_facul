package com.example.notasfaculdade

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.resultado.*

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultado)

        val extras = intent.extras
        if (extras != null) {
            val m1 = extras.getDouble("m1")
            val b1 = extras.getDouble("b1")
            val m2 = extras.getDouble("m2")
            val b2 = extras.getDouble("b2")

            val nota_bimestre_1 = (m1*0.4) + (b1*0.6)
            val nota_bimestre_2 = (m2*0.4) + (b2*0.6)
            val nota_semestre  =  (m1*0.16) + (b1*0.24) + (m2*0.24) + (b2*0.36)

            nota_b1.text = "%.2f".format(nota_bimestre_1)
            nota_b2.text = "%.2f".format(nota_bimestre_2)
            nota_final_.text = "%.2f".format(nota_semestre)
        }
    }
}