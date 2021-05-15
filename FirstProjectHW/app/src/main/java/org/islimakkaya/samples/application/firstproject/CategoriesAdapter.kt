package org.islimakkaya.samples.application.firstproject

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import org.islimakkaya.samples.application.firstproject.databinding.CardDesignBinding

class CategoriesAdapter(var mContext: Context, var categoriesList: List<Categories>)
    : RecyclerView.Adapter<CategoriesAdapter.CardDesignHolder>() {
    inner class CardDesignHolder(categoryDesignBinding: CardDesignBinding)
        : RecyclerView.ViewHolder(categoryDesignBinding.root) {
            var cardDesign: CardDesignBinding

            init {
                this.cardDesign = categoryDesignBinding
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = CardDesignBinding.inflate(layoutInflater, parent, false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val category = categoriesList.get(position)

        holder.cardDesign.categoryObject = category

        holder.cardDesign.cardImage.setImageResource(
                mContext.resources.getIdentifier(category.category_image_name, "drawable", mContext.packageName))

        holder.cardDesign.verticalCard.setOnClickListener {
            val transition = HomePageFragmentDirections.toDetailPage(category)
            Navigation.findNavController(it).navigate(transition)
        }
    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }
}