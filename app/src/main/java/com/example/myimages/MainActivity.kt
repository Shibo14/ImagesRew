package com.example.myimages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myimages.ImagesAdapter.OnItemClickListener

class MainActivity : AppCompatActivity(), ImagesAdapter.OnItemClickListener {
    lateinit var mList: ArrayList<DataImages>
    lateinit var imgAdapter: ImagesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rewWallpaper = findViewById<RecyclerView>(R.id.rewWallpaper)
        mList = ArrayList()
        listData()
        imgAdapter = ImagesAdapter(mList, this)
        val myLiner = GridLayoutManager(this, 2)

        rewWallpaper.apply {
            adapter = imgAdapter
            layoutManager = myLiner
        }


    }

    override fun onItemClick(data: DataImages) {
        // Rasmga bosganda amal bajariladigan kodni yozing
        // data ma'lumotini foydalanish mumkin

        val intent = Intent(this, ImagesActivity::class.java)
        intent.putExtra("imageUrl", data.imagesUrl)
        startActivity(intent)


    }

    private fun listData() {

        mList.add(DataImages("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pexels.com%2Fsearch%2Fmobile%2520wallpaper%2F&psig=AOvVaw3Vo-fAT-WQ-uOOpK7lhZQH&ust=1691486803527000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCLizisOdyoADFQAAAAAdAAAAABAE"))
        mList.add(DataImages("https://www.pexels.com/photo/lighthouse-during-golden-hour-1535162/"))
        mList.add(DataImages("https://unsplash.com/photos/WsJhsoaIbzI"))
        mList.add(DataImages("https://unsplash.com/photos/KBXkv3ZNAGE"))
        mList.add(DataImages("https://unsplash.com/photos/EelDDauQRNw"))
        mList.add(DataImages("https://unsplash.com/photos/AnMGE0_ebEo"))
        mList.add(DataImages("https://unsplash.com/photos/WsJhsoaIbzI"))
        mList.add(DataImages("https://unsplash.com/photos/KBXkv3ZNAGE"))

//        mList.add(DataImages(R.drawable.ic_launcher_background))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_background))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))
//        mList.add(DataImages(R.drawable.ic_launcher_foreground))

//        mList.add(DataImages(R.drawable.alex))
//        mList.add(DataImages(R.drawable.andre))
//        mList.add(DataImages(R.drawable.pexels))
//        mList.add(DataImages(R.drawable.pexels1))
//        mList.add(DataImages(R.drawable.pexels2))
//        mList.add(DataImages(R.drawable.jon))
//        mList.add(DataImages(R.drawable.pexels_k))
//        mList.add(DataImages(R.drawable.kevin))
//        mList.add(DataImages(R.drawable.lerone))
    }
}