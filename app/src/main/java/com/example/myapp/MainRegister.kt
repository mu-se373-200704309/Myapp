package com.example.myapp

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.databinding.ActivityMainRegisterBinding

class MainRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding = ActivityMainRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
     binding.btnSave.setOnClickListener {
         var  User_Information = binding.CreateUserName.text.toString()
         var  User_Password = binding.CreatePassword.text.toString()
         var SharedPreferences =this.getSharedPreferences("Informations", MODE_PRIVATE)
         var editor = SharedPreferences.edit()
         editor.putString("user","$User_Information").apply()
         editor.putString("password","$User_Password").apply()
         Toast.makeText(applicationContext ,"Succsesful", Toast.LENGTH_LONG).show()
         binding.CreateUserName.text.clear()
         binding.CreatePassword.text.clear()

     }

        binding.btnHome.setOnClickListener{
         intent = Intent(applicationContext,MainActivity::class.java)
         startActivity(intent)
     }
    }
}