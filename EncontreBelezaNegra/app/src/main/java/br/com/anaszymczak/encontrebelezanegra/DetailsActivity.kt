package br.com.anaszymczak.encontrebelezanegra

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.anaszymczak.encontrebelezanegra.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    // Binding para acessar os elementos do layout
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configurando o binding
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Exemplo: recebendo dados passados pelo Intent
        val establishmentName = intent.getStringExtra("NAME") ?: "Estabelecimento"
        val establishmentAddress = intent.getStringExtra("ADDRESS") ?: "Endereço não informado"
        val establishmentPhone = intent.getStringExtra("PHONE") ?: "Telefone não disponível"
        val establishmentEmail = intent.getStringExtra("EMAIL") ?: "Email não disponível"
        val establishmentHours = intent.getStringExtra("HOURS") ?: "Horário não disponível"

        // Configurando os textos no layout
        binding.tvName.text = establishmentName
        binding.tvAddress.text = establishmentAddress
        binding.tvPhone.text = establishmentPhone
        binding.tvEmail.text = establishmentEmail
        binding.tvHours.text = establishmentHours

        // Configurando cliques para ações
        binding.tvPhone.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$establishmentPhone")
            }
            startActivity(dialIntent)
        }

        binding.tvEmail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$establishmentEmail")
            }
            startActivity(Intent.createChooser(emailIntent, "Enviar email"))
        }
    }
}