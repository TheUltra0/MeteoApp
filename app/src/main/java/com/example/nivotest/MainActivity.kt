package com.example.nivotest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var button=findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            Intent(this, resore::class.java).also {
                startActivity(it)
            }
        }

        cardView55.setOnClickListener {
            var url = "https://www.anena.org/";
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }

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
