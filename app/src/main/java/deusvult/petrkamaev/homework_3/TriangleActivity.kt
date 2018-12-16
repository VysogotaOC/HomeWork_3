package deusvult.petrkamaev.homework_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_triangle.*
import kotlin.math.roundToInt

class TriangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        makeAResultBTNTriangle.setOnClickListener {
            if(s1EditText.text.isNotEmpty() && s2EditText.text.isNotEmpty() && s3EditText.text.isNotEmpty()){
                var s1 = s1EditText.text.trim().toString().toDouble()
                var s2 = s2EditText.text.trim().toString().toDouble()
                var s3 = s3EditText.text.trim().toString().toDouble()
                if(s1 < (s2+s3) && s2 < (s1+s3) && s3 < (s1+s2)){
                    mainTextViewTriangle.text = "Square is ~ " + TriangleClass(s1, s2, s3).S().roundToInt() + "\n Perimeter is: " + TriangleClass(s1, s2, s3).P().toString()
                }else {
                    Snackbar.make(findViewById(android.R.id.content), "Triangle does not exist", Snackbar.LENGTH_SHORT).show()
                }
            }
        }
    }
}