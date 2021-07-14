package com.example.fragmentnvigatedemo

import android.os.Bundle
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fragmentnvigatedemo.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login, container, false)

        binding.btnLogin.setOnClickListener(){
            val userName :String = binding.tfName.text.toString()
            val pass     :String = binding.tfPassword.text.toString()

            if(userName == "abc" && pass == "123"){
                Navigation.findNavController(it).navigate(R.id.action_loginFragment_to_questionFragment)
            }else{

                Toast.makeText(context, "Invalid user name or password!", Toast.LENGTH_SHORT).show()
            }

        }

        return binding.root
    }


}