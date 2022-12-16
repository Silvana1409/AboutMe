package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    private val myName : MyName = MyName("Aleks")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //findViewById<Button>(R.id.done_bu).setOnClickListener{addNickname(it)}
        binding.doneBu.setOnClickListener{addNickname(it)}
        binding.myName = myName
    }

    private fun addNickname(view:View){
//       val editText = findViewById<EditText>(R.id.nickname_edit)
//        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
//
//        nicknameTextView.text = editText.text
//        editText.visibility = View.GONE
//        view.visibility = View.GONE
//        nicknameTextView.visibility = View.VISIBLE
//
//        // Hide the keyboard.
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.hideSoftInputFromWindow(view.windowToken, 0)
        binding.apply {
            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()

           // creation du classe myName alors arriba porloqseremplaza
            // nicknameText.text = binding.nicknameEdit.text
            //nicknameText.visibility = View.VISIBLE
           // invalidateAll()
            nicknameEdit.visibility =View.GONE
            doneBu.visibility = View.GONE


        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)


    }



}
