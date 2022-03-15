package fort.kleber.aprendendosoberfeatureviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import fort.kleber.aprendendosoberfeatureviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    //como não vai ser inicializado no construtor, coloco lateinit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //val tvHello = findViewById<TextView>(R.id.tvhello)

         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         binding.tvhello.text = "teste com viewBinding"

    }
}