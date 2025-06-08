package com.learning.toolbar

import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.learning.toolbar.databinding.ActivityHomeBinding
import com.learning.toolbar.myUtil.applyToolbar
import com.learning.toolbar.myUtil.showToast

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        setupButtonListeners()
    }

    private fun setupToolbar() = with(binding.tbToolbar.tbLayout) {
        applyToolbar(isHome = true, title = "Welcome!!!") {
            finish()
        }

        inflateMenu(R.menu.menu_item)

        overflowIcon?.setColorFilter(
            ContextCompat.getColor(context, R.color.md_theme_onPrimary),
            PorterDuff.Mode.SRC_ATOP
        )

        setOnMenuItemClickListener { menuItem ->
            handleMenuClick(menuItem)
            true
        }
    }


    private fun setupButtonListeners() = with(binding) {
        btAdd.setOnClickListener {
            navigateTo(AddStudentActivity::class.java)
        }
        btEnquiry.setOnClickListener {
            navigateTo(StudentEnquireActivity::class.java)
        }
    }

    private fun handleMenuClick(menuItem: MenuItem) {
        when (menuItem.itemId) {
            R.id.menu_copy -> showToast("Copy Clicked")
            R.id.menu_edit -> showToast("Edit Clicked")
            R.id.menu_delete -> showToast("Delete Clicked")
            R.id.menu_add -> showToast("Add Clicked")
        }
    }

    private fun navigateTo(destination: Class<*>) {
        startActivity(Intent(this, destination))
    }

}
