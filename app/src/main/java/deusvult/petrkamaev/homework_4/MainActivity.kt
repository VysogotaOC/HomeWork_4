package deusvult.petrkamaev.homework_4

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SearchView
import android.util.Log
import android.view.Menu
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val languages = ArrayList<Languages>()


        var javabm: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.java)
        var cbm: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.c)
        var pythonbm: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.python)
        var cplusplus: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.cplusplus)
        var vbbm: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.visualbasic)
        var javascriptbm: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.javascript)
        var csharpbm: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.csharp)
        var phpbm: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.php)
        var sqlbm: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.sql)
        var objcbm: Bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.objc)

        languages.add(Languages("Java",
            "James Gosling",
            "1995",
            "Multi-paradigm: object-oriented (class-based), structured, imperative, generic, reflective, concurrent",
            "16.904",
             javabm,
            "https://en.wikipedia.org/wiki/Java_(programming_language)"))
        languages.add(Languages("C",
            "Dennis Ritchie",
            "1972",
            "Imperative (procedural), structured",
            "13.337",
             cbm,
            "https://en.wikipedia.org/wiki/C_(programming_language)"))
        languages.add(Languages("Python",
            "Guido van Rossum",
            "1990",
            "Multi-paradigm: functional, imperative, object-oriented, reflective",
            "8.294",
             pythonbm,
            "https://en.wikipedia.org/wiki/Python_(programming_language)"))
        languages.add(Languages("C++",
            "Bjarne Stroustrup",
            "1985",
            "Multi-paradigm: procedural, functional, object-oriented, generic",
            "8.158",
             cplusplus,
            "https://en.wikipedia.org/wiki/C%2B%2B"))
        languages.add(Languages("Visual Basic",
            "Microsoft",
            "2001",
            "Structured, imperative, object-oriented, declarative, generic, reflective and event-driven",
            "6.459",
             vbbm,
            "https://en.wikipedia.org/wiki/Visual_Basic_.NET"))
        languages.add(Languages("JavaScript",
            "Brendan Eich",
            "1995",
            "Multi-paradigm: event-driven,[1] functional, imperative, object-oriented (prototype-based)",
            "3.302",
             javascriptbm,
            "https://en.wikipedia.org/wiki/JavaScript"))
        languages.add(Languages("C Sharp",
            "Microsoft",
            "2000",
            "Structured, imperative, object-oriented, event-driven, task-driven, functional, generic, reflective, concurrent",
            "3.284",
             csharpbm,
            "https://en.wikipedia.org/wiki/C_Sharp_(programming_language)"))
        languages.add(Languages("PHP",
            "Rasmus Lerdorf",
            "1995",
            "Imperative, functional, object-oriented, procedural, reflective",
            "2.68",
             phpbm,
            "https://en.wikipedia.org/wiki/PHP"))
        languages.add(Languages("SQL",
            "Donald D. Chamberlin, Raymond F. Boyce",
            "1974",
            "Multi-paradigm: declarative",
            "2.277",
             sqlbm,
            "https://en.wikipedia.org/wiki/SQL"))
        languages.add(Languages("Objective-C",
            "Tom Love and Brad Cox",
            "1984",
            "Reflective, class-based object-oriented",
            "1.781",
             objcbm,
            "https://en.wikipedia.org/wiki/Objective-C\""))
        val adapter = CustomAdapter(languages, this)
        recyclerView.adapter = adapter
    }
}
