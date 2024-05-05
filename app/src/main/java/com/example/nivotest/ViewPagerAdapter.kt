package com.example.nivotest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.nivotest.fragments.checklist1
import com.example.nivotest.fragments.checklist2
import com.example.nivotest.fragments.diagnostic

class ViewPagerAdapter(fm:FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle){
    override fun getItemCount(): Int=3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> {
                checklist1()
            }
            1 -> {
                checklist2()
            }
            2->{
                diagnostic()
            }
            else->{
                Fragment()
            }
        }
    }

}