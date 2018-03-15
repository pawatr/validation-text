package com.example.odd.myfirstlibrary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.odd.validationtext.ValidationText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener {
            if (!edtEmail.text.toString().isEmpty()) {
                val result = ValidationText(this).validEmail(edtEmail.text.toString())
                if (result) {
                    Toast.makeText(this@MainActivity, "it is email", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this@MainActivity, "it isn't email", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
