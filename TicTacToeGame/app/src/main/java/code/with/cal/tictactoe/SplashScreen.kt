package code.with.cal.tictactoe

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIMEOUT: Long = 1000 // 1 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Menggunakan Handler untuk menangani penundaan
        Handler(Looper.getMainLooper()).postDelayed({
            try {
                val intent = Intent(baseContext, MainActivity::class.java)
                startActivity(intent)
                finish() // Menutup activity splash screen agar tidak dapat dikembalikan
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }, SPLASH_TIMEOUT)
    }
}
