package br.com.anaszymczak.encontrebelezanegra.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.anaszymczak.encontrebelezanegra.DetailsActivity
import br.com.anaszymczak.encontrebelezanegra.R

class FeedFragment : Fragment(R.layout.fragment_feed) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Exemplo: Configurar cliques diretamente no layout do feed
        val cardView = view.findViewById<View>(R.id.card_view_estabelecimento)
        cardView.setOnClickListener {
            openDetails(it)
        }
    }

    // Função que abre a DetailsActivity
    private fun openDetails(view: View) {
        val intent = Intent(requireContext(), DetailsActivity::class.java).apply {
            putExtra("NAME", "Salão Afro Beleza")
            putExtra("ADDRESS", "Rua da Beleza, 123, Centro")
            putExtra("PHONE", "997884456")
            putExtra("EMAIL", "contato@afrobeauty.com")
            putExtra("HOURS", "Seg-Sex: 9h-18h")
        }
        startActivity(intent)
    }
}