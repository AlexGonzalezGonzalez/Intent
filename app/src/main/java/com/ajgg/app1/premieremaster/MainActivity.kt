package com.ajgg.app1.premieremaster


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor


class MainActivity : AppCompatActivity() {

    var horizontal : Boolean =false;
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //listener del boton del primer activity
        id_boton.setOnClickListener {
            //Si el TextView con el id_horizontal esta en el layout pone horizontal a true
            if(id_horizontal!=null){
                horizontal=true
            }
            //Si la pantalla esta en horizontal crea una nueva activity
            //Si no lo esta cambia el texto del boton a `vertical´
            if(horizontal){
                //val intent = Intent(this, Activity2::class.java).apply {
                //    putExtra("id", 5)
                //}
                //startActivity(intent)
                startActivity(intentFor<Activity2>("id" to 5))

            }else{
                id_boton.setText("VERTICAL")
            }


        }
    }

}
