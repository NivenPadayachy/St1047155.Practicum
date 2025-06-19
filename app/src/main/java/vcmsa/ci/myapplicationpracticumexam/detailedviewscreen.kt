import android.widget.Toast
import vcmsa.ci.myapplicationpracticumexam.Buttonadd

private val <Song> Song.rating: Unit
    get() {
        TODO("Not yet implemented")
    }

class detailedviewscreen<Song, Bundle> : AppCompatActivity() {
    private lateinit var songs: List<Song>

    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate     (savedInstanceState)
        setContentView(R.layout.viewScreen)

        songs = intent.getSerializableExtra("songs") as List<Song>
        val songListTextView: TextView = findViewById(R.id.songListTextView)
        val buttonAverage: Buttonaverage = findViewById(R.id.buttonAverage)
        val buttonRuturn: buttonReturn = findViewById(R.id.buttonReturn)

        displaySongs(songListTextView)

        buttonAverage.setOnClickListener {
            val averageRating = calculateAverageRating()
            Toast.makeText(this, "Average Rating: $averageRating", Toast.LENGTH_SHORT).show()
        }

        val buttonReturn = null
        buttonReturn.setOnClickListener {
            finish()
        }
    }

    private fun displaySongs(textView: TextView) {
        val songDetails = songs.joinToString("\n") { "${it.title} by ${it.artist} - Rating: ${it.rating}" }
        textView.text = songDetails
    }

    private fun calculateAverageRating(): Double {
        return if (songs.isNotEmpty()) {
            songs.sumOf { it.rating } / songs.size.toDouble()
        } else {
            0.0
        }
    }
}

private fun Nothing?.setOnClickListener(function: () -> Unit) {
            TODO("Not yet implemented")
}

    }

}
