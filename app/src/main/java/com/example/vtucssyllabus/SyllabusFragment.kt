package com.example.vtucssyllabus

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.vtucssyllabus.databinding.FragmentSyllabusBinding

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
class SyllabusFragment : Fragment() {
    private lateinit var binding: FragmentSyllabusBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_syllabus,container,false)
        binding.syllabusOS.setOnClickListener{
            val text = binding.syllabusOS.text.toString()
            openSyllabus(text)
        }
        binding.syllabusCD.setOnClickListener{
            val text =  binding.syllabusCD.text.toString()
            openSyllabus(text)
        }
        binding.syllabusCG.setOnClickListener{
            val text =  binding.syllabusCG.text.toString()
            openSyllabus(text)
        }
        binding.syllabusCNSC.setOnClickListener{
            val text =  binding.syllabusCNSC.text.toString()
            openSyllabus(text)
        }
        binding.syllabusPAP.setOnClickListener{
            val text =  binding.syllabusPAP.text.toString()
            openSyllabus(text)
        }
        binding.syllabusOR.setOnClickListener{
            val text =  binding.syllabusOR.text.toString()
            openSyllabus(text)
        }
        setHasOptionsMenu(true)
        return binding.root
    }
    private fun openSyllabus(text:String)
    {
        val intent = Intent(activity,DisplayActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE,text)
        startActivity(intent)
    }

}