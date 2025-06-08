package com.learning.toolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learning.toolbar.databinding.ActivityAddStudentBinding
import com.learning.toolbar.myUtil.applyToolbar

class AddStudentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tbToolbar.tbLayout.applyToolbar(title = "Add Student") {
            finish()
        }
    }
}