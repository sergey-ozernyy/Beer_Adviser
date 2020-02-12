package com.hfad.beeradviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setOnClickListener.find_beer{onClickFindBeer()}
        
    }
    fun onClickFindBeer() {
        val color:Spinner = findViewById(R.id.color)
        val findColor:String = color.getItemSelected().toString
        brends.text = resources.getText(R.strings.findColor)
    }
}
