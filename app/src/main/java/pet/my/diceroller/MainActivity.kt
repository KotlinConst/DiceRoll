package pet.my.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pet.my.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainButton = binding.mainButton

        mainButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice(){
        val mainImage = binding.mainImage

        val randomNumbers = (1..6).random()
        val randomDice = when (randomNumbers) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        mainImage.setImageResource(randomDice)
    }
}