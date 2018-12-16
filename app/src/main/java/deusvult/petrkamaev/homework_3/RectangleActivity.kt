package deusvult.petrkamaev.homework_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rectangle.*

class RectangleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        makeAResultBTN.setOnClickListener {
            if(widthEditText.text.isNotEmpty() && lengthEditText.text.isNotEmpty()){
                var width = widthEditText.text.trim().toString().toInt()
                var length = lengthEditText.text.trim().toString().toInt()
                mainTextView.text = "Square is: " + RectangleWL(width, length).S().toString() + "\n Perimeter is: " + RectangleWL(width, length).P().toString()
            }else if(x1Text.text.isNotEmpty() && y1Text.text.isNotEmpty() && x2Text.text.isNotEmpty() && y2Text.text.isNotEmpty()){
                var x1 = x1Text.text.trim().toString().toInt()
                var y1 = y1Text.text.trim().toString().toInt()
                var x2 = x2Text.text.trim().toString().toInt()
                var y2 = y2Text.text.trim().toString().toInt()
                mainTextView.text = "Square is: " + RectangleCOOR(x1, y1, x2, y2).S().toString() + "\n Perimeter is: " + RectangleCOOR(x1, y1, x2, y2).P().toString()
            }
        }
    }
}