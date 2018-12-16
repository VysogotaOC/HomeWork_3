package deusvult.petrkamaev.homework_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var options = arrayOf("Rectangle", "Circle", "Triangle")

        spinner.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        resultBTN.setOnClickListener {
            if(spinner.selectedItem.toString() == "Rectangle"){
                val intent = Intent(this, RectangleActivity::class.java)
                intent.putExtra("type", spinner.selectedItem.toString())
                startActivity(intent)
            }
            if(spinner.selectedItem.toString() == "Circle"){
                val intent = Intent(this, CircleActivity::class.java)
                intent.putExtra("type", spinner.selectedItem.toString())
                startActivity(intent)
            }
            if(spinner.selectedItem.toString() == "Triangle"){
                val intent = Intent(this, TriangleActivity::class.java)
                intent.putExtra("type", spinner.selectedItem.toString())
                startActivity(intent)
            }
        }
    }
}