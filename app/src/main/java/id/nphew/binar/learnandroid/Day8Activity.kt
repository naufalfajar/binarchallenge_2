package id.nphew.binar.learnandroid

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Day8Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_8)
        openActivityOne()
        openActivityTwo()
    }

    private fun openActivityOne(){
        val buttonOne = findViewById<Button>(R.id.button1)
        buttonOne.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun openActivityTwo(){
        val buttonTwo = findViewById<Button>(R.id.button2)
        buttonTwo.setOnClickListener(){
            val intent = Intent(this, Tokopedia::class.java)
            startActivity(intent)
        }
    }

}