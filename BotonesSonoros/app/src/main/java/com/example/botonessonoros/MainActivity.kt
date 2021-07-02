package com.example.botonessonoros

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
var mMediaPlayer: MediaPlayer? = null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botInicio = findViewById<Button>(R.id.jugarBoton)

        botInicio.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

     }




    /** Called when the user taps the inicio button */
    fun iniciarVerde(view: View) {
        //val editText = findViewById<EditText>(R.id.editText)
        //val message = editText.text.toString()
        val intent = Intent(this, verde::class.java).apply {
        //    putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }


    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
/*
    // 2. Pause playback
    fun pauseSound(view: View) {
        if (mMediaPlayer != null && mMediaPlayer!!.isPlaying) mMediaPlayer!!.pause()
    }

    // 3. {optional} Stops playback
    fun stopSound(view: View) {
        if (mMediaPlayer != null) {
            mMediaPlayer!!.stop()
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    // 4. Closes the MediaPlayer when the app is closed
    override fun onStop() {
        super.onStop()
        if (mMediaPlayer != null) {
            mMediaPlayer!!.release()
            mMediaPlayer = null
        }
    }

    fun play_sound_1(view: View){
        //if (mMediaPlayer == null) {
        var mMediaPlayer: MediaPlayer? = null
        try {
            mMediaPlayer = MediaPlayer.create(this, R.raw.a)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
        } catch (e: IOException){
            mMediaPlayer = null
            mMediaPlayer?.release()
        }
        //} else mMediaPlayer!!.start()
    }

    fun playSound2(view: View){
        // if (mMediaPlayer == null) {
        var mMediaPlayer: MediaPlayer? = null
        try {
            mMediaPlayer = MediaPlayer.create(this, R.raw.b)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
        } catch (e: IOException){
            mMediaPlayer = null
            mMediaPlayer?.release()
    }
        //  } else mMediaPlayer!!.start()
    }

    fun playSound3(view: View){
        //  if (mMediaPlayer == null) {
        var mMediaPlayer: MediaPlayer? = null
        try {
            mMediaPlayer = MediaPlayer.create(this, R.raw.c)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
        } catch (e: IOException){
            mMediaPlayer = null
            mMediaPlayer?.release()
    }
        //   } else mMediaPlayer!!.start()
    }

    fun playSound4(view: View){
        //  if (mMediaPlayer == null) {
        var mMediaPlayer: MediaPlayer? = null
        try {
            mMediaPlayer = MediaPlayer.create(this, R.raw.d)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
        } catch (e: IOException){
            mMediaPlayer = null
            mMediaPlayer?.release()
    }
        //  } else mMediaPlayer!!.start()
    }

    fun playSound5(view: View){
        //  if (mMediaPlayer == null) {
        var mMediaPlayer: MediaPlayer? = null
        try {
            mMediaPlayer = MediaPlayer.create(this, R.raw.e)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
        } catch (e: IOException){
            mMediaPlayer = null
            mMediaPlayer?.release()
    }
        //  } else mMediaPlayer!!.start()
    }

    fun playSound6(view: View){
        //   if (mMediaPlayer == null) {
        var mMediaPlayer: MediaPlayer? = null
        try {
            mMediaPlayer = MediaPlayer.create(this, R.raw.f)
            mMediaPlayer!!.isLooping = false
            mMediaPlayer!!.start()
        } catch (e: IOException){
            mMediaPlayer = null
            mMediaPlayer?.release()
    }
        //   } else mMediaPlayer!!.start()
    }*/

}