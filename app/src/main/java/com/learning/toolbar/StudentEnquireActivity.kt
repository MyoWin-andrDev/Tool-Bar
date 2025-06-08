package com.learning.toolbar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.learning.toolbar.databinding.ActivityStudentEnquireBinding
import com.learning.toolbar.myUtil.applyToolbar

class StudentEnquireActivity : AppCompatActivity() {
    private lateinit var binding : ActivityStudentEnquireBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentEnquireBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tbToolbar.tbLayout.applyToolbar(title = "Enquiry Student") {
            finish()
        }
    }
}