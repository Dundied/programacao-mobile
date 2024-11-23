package br.com.anaszymczak.encontrebelezanegra

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Tempo de espera para simular o carregamento
        Handler().postDelayed({
            // Após o tempo de carregamento, inicia a MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Finaliza a SplashActivity para que o usuário não possa voltar para ela
        }, 3000)  // 3000 milissegundos = 3 segundos
    }
}
