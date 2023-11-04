package com.mrrsoftware.whatmovie.presentation.adapters

/**
 * Created by Welbert on 03/11/2023
 */


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mrrsoftware.whatmovie.R
import com.mrrsoftware.whatmovie.presentation.domain.SimpleMovie

class MoviesAdapter(private val context: Context, private val moviesList: List<SimpleMovie>) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = moviesList[position]

        holder.txtTitle.text = movie.title
        holder.txtDescription.text = movie.description
        holder.txtPossibilidade.text = movie.probabilidade
        // Substitua R.drawable.titanic_poster pelo ID da imagem real associada a cada filme
        holder.imageView.setImageResource(R.drawable.titanic_poster) // Ajuste para carregar a imagem correta

        // Utilize Picasso ou Glide para carregar imagens a partir de URLs, se necessário
        // Picasso.get().load(movie.imageUrl).into(holder.imageView)
        // Glide.with(context).load(movie.imageUrl).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
        val txtDescription: TextView = itemView.findViewById(R.id.txtDescription)
        val txtPossibilidade: TextView = itemView.findViewById(R.id.txtPossibilidade)
    }
}
