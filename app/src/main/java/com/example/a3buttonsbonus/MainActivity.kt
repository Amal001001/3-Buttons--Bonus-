package com.example.a3buttonsbonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etName:EditText
    lateinit var etId:EditText
    lateinit var etMood:EditText

    lateinit var bToast:Button
    lateinit var bTextView:Button
    lateinit var bAnotherActivity:Button

    lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etId = findViewById(R.id.etId)
        etMood = findViewById(R.id.etMood)

        bToast = findViewById(R.id.bToast)
        bTextView = findViewById(R.id.bTextView)
        bAnotherActivity = findViewById(R.id.bAnotherActivity)

        tv = findViewById(R.id.tv)

        bToast.setOnClickListener {
            if (etName.text.toString() != "" && etId.text.toString() != "" && etMood.text.toString() != "")
            Toast.makeText(this,"Your name is: ${etName.text}\nYour Id is: ${etId.text}\nYour current mood is: ${etMood.text}",Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this,"All the fields should be filled",Toast.LENGTH_LONG).show()
        }

        bTextView.setOnClickListener {
            if (etName.text.toString() != "" && etId.text.toString() != "" && etMood.text.toString() != "")
                tv.text = "Your name is: ${etName.text}\nYour Id is: ${etId.text}\nYour current mood is: ${etMood.text}"
            else
                Toast.makeText(this,"All the fields should be filled",Toast.LENGTH_LONG).show()
        }

        bAnotherActivity.setOnClickListener {
            if (etName.text.toString() != "" && etId.text.toString() != "" && etMood.text.toString() != ""){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("info", "Your name is: ${etName.text}\n" +
                    "Your Id is: ${etId.text}\n" +
                    "Your current mood is:\n${etMood.text}")
            startActivity(intent)
            }
            else Toast.makeText(this,"All the fields should be filled",Toast.LENGTH_LONG).show()
        }

    }

//    fun checkEt() : Boolean {
//        if (etName.text.toString() != "" && etId.text.toString() != "" && etMood.text.toString() != "")
//            return true
//        return true
//    }
}