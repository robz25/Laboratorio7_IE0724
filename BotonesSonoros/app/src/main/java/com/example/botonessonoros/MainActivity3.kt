package com.example.botonessonoros

import android.content.Intent
import android.graphics.Color
import android.media.MediaPlayer
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.IOException


//var mMediaPlayer: MediaPlayer? = null
//var global?

val textoPuntuacion = null
//var mMediaPlayer: MediaPlayer? = null

var contadorNivel: Int = 0
var countHandler = 0
var contadorJuego = 0 //verificar botones presionados con arreglo
var arregloDeBotones = arrayOf<Int>()
var demoPatron = false

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)



        // Actualizar puntaje en view
        //como hago para que se actulicen siempre y no solo al crear?


        val boton1 = findViewById<Button>(R.id.button1)
        val boton2 = findViewById<Button>(R.id.button2)
        val boton3 = findViewById<Button>(R.id.button3)
        val boton4 = findViewById<Button>(R.id.button4)
        val boton5 = findViewById<Button>(R.id.button5)
        val boton6 = findViewById<Button>(R.id.button6)

      //  val botonReinicio = findViewById<Image>(R.id.reinicio)

        //boton1.backgroundTint="#E91E63"

/*        boton1.performClick()
        boton1.performClick()
        boton1.performClick()
        boton1.performClick()*/

        //contadorNivel = 5

/*

        fun append(arr: Array<Int>, element: Int): Array<Int> {//https://www.techiedelight.com/add-new-element-array-kotlin/
            val list: MutableList<Int> = arr.toMutableList()
            list.add(element)
            return list.toTypedArray()
        }

        for (i in 1..5) {

            var x: Int = 0
            var arregloDeBotones = arrayOf<Int>()

            while (x < i){
                var numeroDeBoton = (1..6).random()
                arregloDeBotones = append(arregloDeBotones, numeroDeBoton)
                x++
            }
            for (j in arregloDeBotones.indices) {

                when (arregloDeBotones[j]) {
                    1 -> Handler().postDelayed(Runnable { boton1.performClick() }, 1000)
                    2 -> Handler().postDelayed(Runnable { boton2.performClick() }, 1000)
                    3 -> Handler().postDelayed(Runnable { boton3.performClick() }, 1000)
                    4 -> Handler().postDelayed(Runnable { boton4.performClick() }, 1000)
                    5 -> Handler().postDelayed(Runnable { boton5.performClick() }, 1000)
                    6 -> Handler().postDelayed(Runnable { boton6.performClick() }, 1000)
                    else -> { // Note the block
                        print("x no es 1 o 2")
                    }
                }
            }

        }*/
/*


        Handler().postDelayed(Runnable { boton1.performClick() }, 4000)//presional bootn automaticamente
*/
        //tocaToca()

        val botSalir = findViewById<Button>(R.id.botonSalir)

        botSalir.setOnClickListener{
            //eliminar aqui todas las variables o reiniciarlas
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        //botonReinicio.performClick()//no sirve
        //patron(v: View)
    }
/*
    val b1 = findViewById<Button>(R.id.button1)
    val b2 = findViewById<Button>(R.id.button2)
    val b3 = findViewById<Button>(R.id.button3)
    val b4 = findViewById<Button>(R.id.button4)
    val b5 = findViewById<Button>(R.id.button5)
    val b6 = findViewById<Button>(R.id.button6)
*/
    /*
    fun tocaToca() {
        Handler().postDelayed(Runnable { b2.performClick() }, 500)//presional bootn automaticamente
        Handler().postDelayed(Runnable { b3.performClick() }, 1000)//presional bootn automaticamente
        Handler().postDelayed(Runnable { b4.performClick() }, 2500)//presional bootn automaticamente
        Handler().postDelayed(Runnable { b5.performClick() }, 2800)//presional bootn automaticamente
        Handler().postDelayed(Runnable { b6.performClick() }, 3100)//presional bootn automaticamente
    }*/
//    internal
  /*  class ExecuteAsyncTask : AsyncTask<Any?, Void?, String?>() {
        //
        protected override fun doInBackground(vararg task_idx: Any): String {

            //
            val param = task_idx[0] as String

            //
            //Log.d(TAG, "xxx - iter value started task idx: $param")

            // stop
            try {
                Thread.sleep(5000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

            //
           // Log.d(TAG, "xxx - iter value done $param")
            return " done for task idx: $param"
        }

        //
        protected override fun onPostExecute(result: String) {
           // Log.d(TAG, "xxx - task executed update ui controls: $result")
        }
    }*/

    //@SuppressLint("StaticFieldLeak")
    class AsyncTaskExample(private var activity: MainActivity?) : AsyncTask<String, String, String>() {

        /*override fun onPreExecute() {
            super.onPreExecute()
            activity?.MyprogressBar?.visibility = View.VISIBLE
        }  */

        override fun doInBackground(vararg p0: String?): String {



            var result = ""
            try {
             /*   when (p0.toInt()) {
                    1 -> Handler().postDelayed(Runnable { boton1.performClick() }, 1000)
                    2 -> Handler().postDelayed(Runnable { boton2.performClick() }, 1000)
                    3 -> Handler().postDelayed(Runnable { boton3.performClick() }, 1000)
                    4 -> Handler().postDelayed(Runnable { boton4.performClick() }, 1000)
                    5 -> Handler().postDelayed(Runnable { boton5.performClick() }, 1000)
                    6 -> Handler().postDelayed(Runnable { boton6.performClick() }, 1000)
                    else -> { // Note the block
                        print("x no es 1 o 2")
                    }
                }*/


            } catch (ex: Exception) {
                Log.d("", "Error in doInBackground " + ex.message)
            }
            return result
        }

    }

    val handler = Handler()


    val runnable: Runnable = object : Runnable {

        override fun run() {
            //puntos = 999//borrar luego
            //variables de View
            //val textoPuntuacion = findViewById<TextView>(R.id.puntuacion)
           // textoPuntuacion.text = puntos.toString()

            val boton1 = findViewById<Button>(R.id.button1)
            val boton2 = findViewById<Button>(R.id.button2)
            val boton3 = findViewById<Button>(R.id.button3)
            val boton4 = findViewById<Button>(R.id.button4)
            val boton5 = findViewById<Button>(R.id.button5)
            val boton6 = findViewById<Button>(R.id.button6)
            // need to do tasks on the UI thread
            if(countHandler < contadorNivel) {
                when (arregloDeBotones[countHandler]) {//aca esta el problema, en accesar al arreglo
                    //when (2) {
                    1 -> {
                        Handler().postDelayed(Runnable { boton1.performClick() }, 1000)
                        //Thread.sleep(1000);
                    }
                    2 -> {
                        Handler().postDelayed(Runnable { boton2.performClick() }, 1000)
                        //Thread.sleep(1000);
                    }
                    3 -> {
                        Handler().postDelayed(Runnable { boton3.performClick() }, 1000)
                        //                      Thread.sleep(1000);
                    }
                    4 -> {
                        Handler().postDelayed(Runnable { boton4.performClick() }, 1000)
                        //Thread.sleep(1000);
                    }
                    5 -> {
                        Handler().postDelayed(Runnable { boton5.performClick() }, 1000)
                        //Thread.sleep(1000);
                    }
                    6 -> {
                        Handler().postDelayed(Runnable { boton6.performClick() }, 1000)
                        //Thread.sleep(1000);
                    }
                    else -> { // innecesario
                        Handler().postDelayed(Runnable { }, 1000)
                        //print("x no es 1 o 2")
                    }
                }
            }else{
                Handler().postDelayed(Runnable { }, 1000)
            }

            //Log.d(TAG, "Run test count: $count")
            if (countHandler++ <= contadorNivel) {// hay que ponerle -1 par que no cuente uno mas??? por que??
                handler.postDelayed(this, 1000)
                //puntos = 999//borrar luego
                //variables de View
                //val textoPuntuacion = findViewById<TextView>(R.id.puntuacion)
                //textoPuntuacion.text = countHandler.toString()
                //countHandler++
            //}else if (countHandler++ == contadorNivel){
             //   handler.postDelayed(this, 1000)

                }else{//al terminar arreglo habilito nuevametne los botones
                    countHandler-=3//para que quede en la posicion actual del arreglo
                    // si contadorNivel = x, handler se llama x + 2 veces dentro de sí
                    // pero countHandler aumenta cada entrada por lo cual aumenta x + 3 veces
                    // recordar que la primera vez que entra el handler se llama de afuera
                    boton1.isEnabled = true
                    boton2.isEnabled = true
                    boton3.isEnabled = true
                    boton4.isEnabled = true
                    boton5.isEnabled = true
                    boton6.isEnabled = true
                    demoPatron = false
                }
        }
    }

    fun append(arr: Array<Int>, element: Int): Array<Int> {//https://www.techiedelight.com/add-new-element-array-kotlin/
        val list: MutableList<Int> = arr.toMutableList()
        list.add(element)
        return list.toTypedArray()
    }

    fun patron(view: View?){//? nos permite poner null para cuando quiero llamar patron aca dentro

        ++contadorNivel //aumentar nivel para aumentar tamaño de arreglo en una unidad

        val boton1 = findViewById<Button>(R.id.button1)
        val boton2 = findViewById<Button>(R.id.button2)
        val boton3 = findViewById<Button>(R.id.button3)
        val boton4 = findViewById<Button>(R.id.button4)
        val boton5 = findViewById<Button>(R.id.button5)
        val boton6 = findViewById<Button>(R.id.button6)

        //var ifCounter: Int = 0
        //if(ifCounter++ < 5){
        var i: Int = 0
        while (i < contadorNivel){
        //for (i in 1..5) {

            var x: Int = 0
            //arregloDeBotones = arrayOf<Int>()//lo declaro arriba como global
            //necesito reinicar el arreglo de alguna forma aqui

            //while (x < i){
                var numeroDeBoton = (1..6).random()
                arregloDeBotones = append(arregloDeBotones, numeroDeBoton)
                x++
            //}

            //var ifCounter: Int = 0
            //if(ifCounter++ < i){
/*
            for (j in arregloDeBotones.indices) {

                when (arregloDeBotones[j]) {
                    1 -> {Handler().postDelayed(Runnable { boton1.performClick() }, 1000)
                        //Thread.sleep(1000);
                    }
                    2 -> {Handler().postDelayed(Runnable { boton2.performClick() }, 1000)
//                        Thread.sleep(1000);
                    }
                    3 -> {Handler().postDelayed(Runnable { boton3.performClick() }, 1000)
                        //                      Thread.sleep(1000);
                    }
                    4 -> {Handler().postDelayed(Runnable { boton4.performClick() }, 1000)
                        //Thread.sleep(1000);
                    }
                    5 -> {Handler().postDelayed(Runnable { boton5.performClick() }, 1000)
                        //Thread.sleep(1000);
                    }
                    6 -> {Handler().postDelayed(Runnable { boton6.performClick() }, 1000)
                        //Thread.sleep(1000);
                    }
                    else -> { // Note the block
                        print("x no es 1 o 2")
                    }
                }

            }*/
            i++
        }
        boton1.isEnabled = false
        boton2.isEnabled = false
        boton3.isEnabled = false
        boton4.isEnabled = false
        boton5.isEnabled = false
        boton6.isEnabled = false
        demoPatron = true//ignorir the last element if repeated? or always

        //contadorNivel++
        countHandler = 0//reinicar cuenta para handler cada vez que corra, va a inicidar desde la
        //primera posicion para ir aumentando la secuencia.
        //hacer diferentes modos de juego, uno loco con diferentes secuencias, basta con no ponerle 0
        //uno con velocidad mas rapida
        //uno con velocidad que vaya aumentando cada 10 puntos y sonido también debe ser más rápido
        handler.post(runnable);//lamar a handlers por primera vez
        //handler se llama y el codigo sigue
        contadorJuego = 0 //reiniciar contador  de verificacion tras inicio de nuevo demo
        //contadorNivel++ //aumentar el contador de nivel cada vez que se llame a generar el patron se cae

    }

    var puntos: Int = 0

    fun reiniciarVariables(){//al finalizar el juego
        puntos = 0
        contadorJuego = 0
        countHandler = 0
        contadorNivel = 0
        arregloDeBotones = arrayOf<Int>()
    }



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

    fun playSound1(view: View){

        val boton1 = findViewById<Button>(R.id.button1)
        if(demoPatron){
            Handler().postDelayed(Runnable { boton1.setBackgroundColor(Color.parseColor("#95ef17")) }, 1000)
        }else if (contadorNivel > 0 && arregloDeBotones[contadorJuego] == 1){
            puntos++
            ++contadorJuego//no importa que aumente si es posicion final, igual en patron() se borra
            if(contadorJuego >= contadorNivel) {//fin de secuencia exitoso
                Handler().postDelayed(Runnable { patron(null) }, 1500)
            }

        }else {
            reiniciarVariables()
            //reinicio de variables
            //y
            //fin de juego
        }
        //puntos++//borrar luego
        //variables de View
        val textoPuntuacion = findViewById<TextView>(R.id.puntuacion)
        textoPuntuacion.text = puntos.toString()
        //val b1 = findViewById<Button>(R.id.button1)
        //b1.backgroundTint="#E91E63"
        //app:backgroundTint="#E91E63"
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
        if(demoPatron) {
            boton1.setBackgroundColor(Color.parseColor("#b7ffb9"))
        }
    }

    fun playSound2(view: View){
        val boton2 = findViewById<Button>(R.id.button2)
        if(demoPatron){
            Handler().postDelayed(Runnable { boton2.setBackgroundColor(Color.parseColor("#E91E63")) }, 1000)
        }else if (contadorNivel > 0 && arregloDeBotones[contadorJuego] == 2){
            ++contadorJuego
            puntos++
            if(contadorJuego >= contadorNivel) {//fin de secuencia exitoso
                Handler().postDelayed(Runnable { patron(null) }, 1500)
            }
        }else {
            reiniciarVariables()
            //reinicio de variables
            //y
            //fin de juego
        }/*else {
            for (int i = 0; i < 1; i++){
                if (tracker[i] == 0) {
                    //show error message and return;
                } else {
                    tracker[1] = 1;
                    return;
                }
            }
        }*/
       // puntos++//borrar luego
        //variables de View
        val textoPuntuacion = findViewById<TextView>(R.id.puntuacion)
        textoPuntuacion.text = puntos.toString()
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
        if(demoPatron){
            boton2.setBackgroundColor(Color.parseColor("#ffb4cd"))
        }
    }

    fun playSound3(view: View){
        val boton3 = findViewById<Button>(R.id.button3)
        if(demoPatron){
            Handler().postDelayed(Runnable { boton3.setBackgroundColor(Color.parseColor("#FFEB3B")) }, 1000)
        }else if (contadorNivel > 0 && arregloDeBotones[contadorJuego] == 3){
            ++contadorJuego
            puntos++
            if(contadorJuego >= contadorNivel) {//fin de secuencia exitoso
                Handler().postDelayed(Runnable { patron(null) }, 1500)
            }
        }else {
            reiniciarVariables()
            //reinicio de variables
            //y
            //fin de juego
        }
       // puntos++//borrar luego
        //variables de View
        val textoPuntuacion = findViewById<TextView>(R.id.puntuacion)
        textoPuntuacion.text = puntos.toString()
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
        if(demoPatron){
            boton3.setBackgroundColor(Color.parseColor("#fff9c0"))
        }
    }

    fun playSound4(view: View){
        val boton4 = findViewById<Button>(R.id.button4)
        if(demoPatron){
            Handler().postDelayed(Runnable { boton4.setBackgroundColor(Color.parseColor("#3F51B5")) }, 1000)
        }else if (contadorNivel > 0 && arregloDeBotones[contadorJuego] == 4){
            ++contadorJuego
            puntos++
            if(contadorJuego >= contadorNivel) {//fin de secuencia exitoso
                Handler().postDelayed(Runnable { patron(null) }, 1500)
            }
        }else {
            reiniciarVariables()
            //reinicio de variables
            //y
            //fin de juego
        }
        //boton4.setBackgroundColor(Color.parseColor("#f7fefc"));
        //boton4.setBackgroundColor(0xff09c0)//primer byte es transparencia
      //  puntos++//borrar luego
        //variables de View
        val textoPuntuacion = findViewById<TextView>(R.id.puntuacion)
        textoPuntuacion.text = puntos.toString()
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
        if(demoPatron){
            boton4.setBackgroundColor(Color.parseColor("#adb8f6"))
        }
        //boton4.setBackgroundColor(0xffffff)//no sirve lo deja transparente
    }

    fun playSound5(view: View){
        val boton5 = findViewById<Button>(R.id.button5)
        if(demoPatron){
            Handler().postDelayed(Runnable { boton5.setBackgroundColor(Color.parseColor("#FF5722")) }, 1000)
        }else if (contadorNivel > 0 && arregloDeBotones[contadorJuego] == 5){
            ++contadorJuego
            puntos++
            if(contadorJuego >= contadorNivel) {//fin de secuencia exitoso
                Handler().postDelayed(Runnable { patron(null) }, 1500)
            }
        }else {
            reiniciarVariables()
            //reinicio de variables
            //y
            //fin de juego
        }
        //puntos++//borrar luego
        //variables de View
        val textoPuntuacion = findViewById<TextView>(R.id.puntuacion)
        textoPuntuacion.text = puntos.toString()
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
        if(demoPatron){
            boton5.setBackgroundColor(Color.parseColor("#fabaa6"))
        }
    }

    fun playSound6(view: View){
        val boton6 = findViewById<Button>(R.id.button6)
        if(demoPatron){
            Handler().postDelayed(Runnable { boton6.setBackgroundColor(Color.parseColor("#00BCD4")) }, 1000)
        }
        else if (contadorNivel > 0 && arregloDeBotones[contadorJuego] == 6){
            ++contadorJuego
            puntos++
            if(contadorJuego >= contadorNivel) {//fin de secuencia exitoso
                Handler().postDelayed(Runnable { patron(null) }, 1500)
            }
        }else {
            reiniciarVariables()
            //reinicio de variables
            //y
            //fin de juego
        }
       // puntos++//borrar luego
        //variables de View
        val textoPuntuacion = findViewById<TextView>(R.id.puntuacion)
        textoPuntuacion.text = puntos.toString()
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
        if(demoPatron){
            boton6.setBackgroundColor(Color.parseColor("#bcf1f8"))
        }
    }
}