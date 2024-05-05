
package com.example.nivotest

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class resore : AppCompatActivity() {

    private lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firstlayout)


        var tab = findViewById<TabLayout>(R.id.Tab)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        var viewPager = findViewById<ViewPager2>(R.id.ViewPager)
        viewPager.adapter = viewPagerAdapter
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = viewPagerAdapter

        TabLayoutMediator(tab, viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Checklist 1"
                }
                1 -> {
                    tab.text = "Checklist 2"
                }
                2 -> {
                    tab.text = "Diagnostic"
                }
            }
        }.attach()


    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {



        when (item.itemId) {

            R.id.Conditii -> Intent(this, conditii::class.java).also {
                startActivity(it)
            }

            R.id.Notice -> Intent(this, nota::class.java).also {
                startActivity(it)
            }
        }
        return true
    }

}