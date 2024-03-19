package com.translangapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity




class translateActivity : AppCompatActivity() {

    private lateinit var fromLanguageSpinner: Spinner
    private lateinit var toLanguageSpinner: Spinner
    private lateinit var inputEditText: EditText
    private lateinit var outputEditText: EditText
    private lateinit var translateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translate)

        fromLanguageSpinner = findViewById<Spinner>(R.id.fromLanguageSpinner)
        toLanguageSpinner = findViewById<Spinner>(R.id.toLanguageSpinner)
        inputEditText = findViewById<EditText>(R.id.inputEditText)
        outputEditText = findViewById<EditText>(R.id.outputEditText)
        translateButton = findViewById<Button>(R.id.translateButton)

        // Setting up language spinners
        val languages = arrayOf("English", "French", "Spanish") // Add more languages as needed
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        fromLanguageSpinner.adapter = adapter
        toLanguageSpinner.adapter = adapter

        // Set click listener for translate button
        translateButton.setOnClickListener {
            translateText()
        }
    }

    private fun translateText() {
        // Fetch selected languages and input text
        val fromLang = fromLanguageSpinner.selectedItem.toString()
        val toLang = toLanguageSpinner.selectedItem.toString()
        val inputText = inputEditText.text.toString()

        // Here you would perform the translation logic, you can use APIs like Google Translate or similar

        // For demonstration purpose, let's just set the output text as the input text
        outputEditText.setText(inputText)
    }
}