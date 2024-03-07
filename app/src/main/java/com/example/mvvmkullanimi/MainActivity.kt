package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding= ActivityMainBinding.inflate(layoutInflater)
       binding=DataBindingUtil.setContentView(this,R.layout.activity_main   )

        binding.textViewSonuc.text="0"
        binding.buttonToplama.setOnClickListener{
           val alinanSayi1= binding.editTextTextSayi1.text.toString()
            val alinanSayi2=binding.editTextTextSayi2.text.toString()

            val sayi1 = alinanSayi1.toInt()
            val sayi2 = alinanSayi2.toInt()

            val toplam = sayi1+sayi2
            binding.textViewSonuc.text=toplam.toString()
        }
        binding.buttonCarpma.setOnClickListener{
            val alinanSayi1C= binding.editTextTextSayi1.text.toString()
            val alinanSayi2C=binding.editTextTextSayi2.text.toString()

            val sayi1C = alinanSayi1C.toInt()
            val sayi2C = alinanSayi2C.toInt()

            val carpma = sayi1C*sayi2C
            binding.textViewSonuc.text=carpma.toString()

        }



    }
}