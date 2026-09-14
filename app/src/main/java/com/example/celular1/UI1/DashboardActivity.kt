package com.example.celular1.UI1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.celular1.R
class DashboardActivity: ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val tvinicio = findViewById<TextView>(R.id.tvWelcome)
        val btnsalir = findViewById<Button>(R.id.btnLogout)

        val username = intent.getStringExtra("USERNAME") ?: "Usuario"
        tvinicio.text = "Hola, $username"

        btnsalir.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}