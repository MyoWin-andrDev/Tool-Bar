package com.learning.toolbar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.learning.toolbar.databinding.ActivityAddStudentBinding

class AddStudentActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAddStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tbToolbar.tbLayout.apply {
            title = "Add Student"
            setTitleTextColor(getColor(R.color.md_theme_onPrimary))
            setNavigationIcon(R.drawable.ic_back)
            setNavigationIconTint(getColor(R.color.md_theme_onPrimary))
            setNavigationOnClickListener { onBackPressed() }
        }
    }
}