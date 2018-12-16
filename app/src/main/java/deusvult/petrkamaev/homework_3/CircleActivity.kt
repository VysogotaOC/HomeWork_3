package deusvult.petrkamaev.homework_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_circle.*
import kotlin.math.roundToInt

class CircleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        makeAResultBTNCircle.setOnClickListener {
            if(radiusEditText.text.isNotEmpty()){
                var Radius = radiusEditText.text.trim().toString().toInt()
                mainTextViewCircle.text = "Square is ~ " + CircleR(Radius).S().roundToInt() + "\n Perimeter is ~ " + CircleR(Radius).P().roundToInt()
            }
        }
    }
}