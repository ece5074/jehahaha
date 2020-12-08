package com.project.reservation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.project.reservation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        //메인 화면 세팅
        init()

        application.setTheme(R.style.Theme_Reservation)
        setContentView(view)
    }

    fun init() {
        //bottomNavView의 Listener 생성
        binding.bottomNavView.setOnNavigationItemSelectedListener(this)
        //Default Selected Item 지정
        binding.bottomNavView.selectedItemId = R.id.nav_home
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.nav_home->{
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, HomeFragment()).commit()
                return true
            }
            R.id.nav_search->{
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, SearchFragment()).commit()
                return true
            }
            R.id.nav_pick->{
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, CalendarFragment()).commit()
                return true
            }
            R.id.nav_account->{
                supportFragmentManager.beginTransaction().replace(R.id.frameLayout, AccountFragment()).commit()
                return true
            }
        }
        return false
    }
}