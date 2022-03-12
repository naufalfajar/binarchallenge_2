package id.nphew.binar.learnandroid

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Tokopedia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tokopedia)
        inifungsi()
        carabuat()
    }
    private fun inifungsi(){
        Log.e("inifungsi","""
            Folder Assets ini sangat berguna sekali pada projek Android Studio kalian. 
            Terlebih lagi jika kalian membuat project yang besar, karena fungsi dari folder 
            ini sangat berbeda dengan folder yang lain. 
            Kalau kita ingin menyimpan file .raw, .mp3, .mov maka folder yang digunakan adalah folder raw.  
        """.trimIndent())

    }
    private fun carabuat(){
        Log.d("carabuat","""
            Buka Android Studio, klik kanan pada app project
            lalu pilih New -> Folder -> Asset Folder
        """.trimIndent())
    }
}