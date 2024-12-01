package br.com.anaszymczak.encontrebelezanegra.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.anaszymczak.encontrebelezanegra.R
import br.com.anaszymczak.encontrebelezanegra.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    // Criação do objeto ViewBinding
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inicializando o binding
        binding = FragmentProfileBinding.inflate(inflater, container, false)

        // Exemplo: Definindo valores no perfil
        binding.tvUserName.text = "Nome do Usuário"
        binding.tvUserEmail.text = "usuario@exemplo.com"
        binding.tvUserPhone.text = "(11) 98765-4321"

        // Definindo a foto do perfil, você pode usar um ImageView ou outro componente para exibir a foto
//        binding.ivProfileImage.setImageResource(R.drawable.ic_profile_picture)

        return binding.root
    }
}