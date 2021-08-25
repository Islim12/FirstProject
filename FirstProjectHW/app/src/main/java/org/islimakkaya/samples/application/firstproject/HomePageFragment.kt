package org.islimakkaya.samples.application.firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.fragment_home_page.view.*
import org.islimakkaya.samples.application.firstproject.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {
    private lateinit var design: FragmentHomePageBinding
    private lateinit var adapter: CategoriesAdapter
    private lateinit var categoriesList: ArrayList<Categories>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?)
    : View? {
        design = DataBindingUtil.inflate(inflater, R.layout.fragment_home_page, container, false)
        design.homePageRecyclerList.layoutManager = StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL)

        val c1 = Categories(1, "İslim", "name")
        val c2 = Categories(2, "New Products", "new_product")
        val c3 = Categories(3, "Water", "water")
        val c4 = Categories(4, "Fruits & Vegetables", "fav")
        val c5 = Categories(5, "Bakery", "bakery")
        val c6 = Categories(6, "Snacks", "snacks")
        val c7 = Categories(7, "Ice Cream", "ice_cream")
        val c8 = Categories(8, "Food", "food")
        val c9 = Categories(9, "Drink", "drink")
        val c10 = Categories(10, "Fit & Form", "fit")
        val c11 = Categories(11, "Dairy Products", "dairy")
        val c12 = Categories(12, "Staple Food", "staple_food")
        val c13 = Categories(13, "Personal Care", "pcp")
        val c14 = Categories(14, "Home Care", "hcp")
        val c15 = Categories(15, "Home & Life", "hal")
        val c16 = Categories(16, "Technology", "tech")
        val c17 = Categories(17, "For Pets", "pets")
        val c18 = Categories(18, "For Babies", "baby")
        val c19 = Categories(19, "Toys", "toys")
        val c20 = Categories(20, "Clothes", "clothes")

        categoriesList = ArrayList()

        categoriesList.add(c1)
        categoriesList.add(c2)
        categoriesList.add(c3)
        categoriesList.add(c4)
        categoriesList.add(c5)
        categoriesList.add(c6)
        categoriesList.add(c7)
        categoriesList.add(c8)
        categoriesList.add(c9)
        categoriesList.add(c10)
        categoriesList.add(c11)
        categoriesList.add(c12)
        categoriesList.add(c13)
        categoriesList.add(c14)
        categoriesList.add(c15)
        categoriesList.add(c16)
        categoriesList.add(c17)
        categoriesList.add(c18)
        categoriesList.add(c19)
        categoriesList.add(c20)

        adapter = CategoriesAdapter(requireContext(), categoriesList)
        design.homePageRecyclerList.adapter = adapter

        return design.root
    }


}