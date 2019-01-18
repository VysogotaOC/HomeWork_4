package deusvult.petrkamaev.homework_4



import android.content.Context
import android.content.Intent
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class CustomAdapter(val langList: ArrayList<Languages>, val context:Context): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.list_layout, p0, false)
        return ViewHolder(v)



    }

    override fun getItemCount(): Int {
        return langList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val lang: Languages = langList[p1]

        p0.textViewName.text = "Название: " + lang.lang_name
        p0.textViewAuthor.text = "Автор: " + lang.author
        p0.textViewYear.text = "Год: " + lang.year
        p0.textViewParadigm.text = "Парадигма: " + lang.paradigm
        p0.textViewTiobe.text = "TIOBE: " + lang.tiobe
        p0.imageViewLogo.setImageBitmap(lang.logo)
        p0.card.setOnClickListener{
            val intent = Intent(context, WebActivity::class.java)
            intent.putExtra("link", lang.link)
            p0.itemView.context.startActivity(intent)
        }
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val textViewName = itemView.findViewById(R.id.lang_name) as TextView
        val textViewAuthor = itemView.findViewById(R.id.authors) as TextView
        val textViewYear = itemView.findViewById(R.id.release) as TextView
        val textViewParadigm = itemView.findViewById(R.id.paradigm) as TextView
        val textViewTiobe = itemView.findViewById(R.id.tiobe) as TextView
        val imageViewLogo = itemView.findViewById(R.id.lang_image_id) as ImageView
        val card = itemView.findViewById(R.id.cardView) as CardView

    }
}