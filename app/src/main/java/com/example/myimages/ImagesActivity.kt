package com.example.myimages

import android.app.WallpaperManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import java.lang.Exception

class ImagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images)
        val imgView = findViewById<ImageView>(R.id.imageView)
        val btn = findViewById<Button>(R.id.button)
        val imageUrl = intent.getStringExtra("imageUrl")


        Glide.with(this)
            .load(imageUrl)
            .placeholder(R.drawable.ic_launcher_background)

            .centerCrop()
            .into(imgView)

        val wallpaperManager = WallpaperManager.getInstance(applicationContext)

        btn.setOnClickListener {
            try {
                wallpaperManager.setResource(imageUrl!!.toInt())
                Toast.makeText(this, "success!!!", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }


    }
}