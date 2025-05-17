package com.learning.toolbar

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.learning.toolbar.databinding.ActivityHomeBinding
import com.learning.toolbar.myUtil.showToast

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tbToolbar.tbLayout.apply {
            title = "Welcome!!!"
            setTitleTextColor(getColor(R.color.md_theme_onPrimary))
            inflateMenu(R.menu.menu_item)
            overflowIcon?.setColorFilter(getColor(R.color.md_theme_onPrimary), PorterDuff.Mode.SRC_ATOP)
            setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.menu_copy -> showToast("Copy Clicked")
                    R.id.menu_edit -> showToast("Edit Clicked")
                    R.id.menu_delete -> showToast("Delete Clicked")
                    R.id.menu_add -> showToast("Add Clicked")
                }
                true
            }
        }
        binding.apply {
            btAdd.setOnClickListener {
                startActivity(Intent(this@HomeActivity, AddStudentActivity::class.java))
            }
            btEnquiry.setOnClickListener {
                startActivity(Intent(this@HomeActivity, StudentEnquireActivity::class.java))
            }
        }
    }
}