package com.example.contextmenu

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(img_android)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menu?.setHeaderTitle("contextMenu")
        menuInflater.inflate(R.menu.contextmenu, menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    @SuppressLint("NewApi")
    override fun onContextItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.item1 -> {
                Toast.makeText(this, "item1", Toast.LENGTH_LONG).show()
            }
            R.id.item2 -> Toast.makeText(this, "item2", Toast.LENGTH_LONG).show()
        }
        return true
    }

}
