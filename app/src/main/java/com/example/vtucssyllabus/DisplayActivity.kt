package com.example.vtucssyllabus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.github.barteksc.pdfviewer.PDFView

class DisplayActivity : AppCompatActivity() {
    private lateinit var pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        val text = intent.getStringExtra(EXTRA_MESSAGE)
        pdfView = findViewById(R.id.pdfView)
        when(text)
        {
            "Operating System"->{
                pdfView.fromAsset("Operating System Syllabus.pdf")
                    .load()
            }
            "Computer Graphics"->{
                pdfView.fromAsset("Computer Graphics Syllabus.pdf")
                    .load()
            }
            "Compiler Design"->{
                pdfView.fromAsset("System Software and Compiler Design Syllabus.pdf")
                    .load()
            }
            "Cryptography and Network Security"->{
                pdfView.fromAsset("Cryptography and Network Security Syllabus.pdf")
                    .load()
            }
            "Python Application Programming"->{
                pdfView.fromAsset("Python Application Programming.pdf")
                    .load()
            }
            "Operations Research"->{
                pdfView.fromAsset("Operations Research Syllabus.pdf")
                    .load()
            }
            else ->{
                Toast.makeText(applicationContext,"No syllabus found",Toast.LENGTH_SHORT).show()}
        }

    }
}