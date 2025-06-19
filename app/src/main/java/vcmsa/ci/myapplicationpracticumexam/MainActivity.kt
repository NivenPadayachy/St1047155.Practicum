package vcmsa.ci.myapplicationpracticumexam

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import detailedviewscreen

private fun Nothing?.setOnClickListener(function: () -> Unit) {
        TODO("Not yet implemented")
}

class MainActivity<ButtonSecond> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(/* view = */ findViewById(R.id.buttonExit)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val buttonadd: Buttonadd = findViewById(R.id.buttonadd)
            val buttonSecond: ButtonSecond = findViewById(R.id.buttonSecond)
            val : buttonExit = androidx.compose.foundation.layout.Box {
                findViewById(R.id.buttonExit)
            }

            buttonadd.setOnClickListener {
                Buttonadd()
            }

            var viewSongsButton = null
            viewSongsButton.setOnClickListener {
                val intent = Intent(this, detailedviewscreen::class.java)
                intent.putExtra("songs", ArrayList(songs))
                startActivity(intent)
            }

            var buttonExit = null
            buttonExit.setOnClickListener(::finish)
        }

        private fun addSongToPlaylist() {
            val dialog = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.activity_main, null)
            dialog.setView(dialogView)

            val titleInput:EditText = dialogView.findViewById(R.id.titleInput)
            val artistInput: EditText = dialogView.findViewById(R.id.artistInput)
            val ratingInput: EditText = dialogView.findViewById(R.id.ratingInput)
            val commentsInput: EditText= dialogView.findViewById(R.id.commentsInput)

            dialog.setPositiveButton("Add") { _, _ ->
                val title = titleInput.text.toString()
                val artist = artistInput.text.toString()
                val rating = ratingInput.text.toString().toInt()
                val comments = commentsInput.text.toString()
                val songs
                songs.add(Song(title, artist, rating, comments))
            }
            dialog.setNegativeButton("Cancel", null)
            dialog.show()
        }
    }
       }

class Buttonadd {
    fun setOnClickListener(function: () -> Buttonadd) {

    }

}
}
}