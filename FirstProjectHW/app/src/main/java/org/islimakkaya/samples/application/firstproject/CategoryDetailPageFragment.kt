package org.islimakkaya.samples.application.firstproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import org.islimakkaya.samples.application.firstproject.databinding.FragmentCategoryDetailPageBinding

class CategoryDetailPageFragment : Fragment() {
    private lateinit var design: FragmentCategoryDetailPageBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?)
  : View? {
      design = DataBindingUtil.inflate(inflater, R.layout.fragment_category_detail_page, container, false)

      val bundle: CategoryDetailPageFragmentArgs by navArgs()

      val transmittedCategory = bundle.categoryObject

      design.detailPageImage.setImageResource(resources.getIdentifier(transmittedCategory.category_image_name, "drawable", requireContext().packageName))
      design.detailPageText.text = transmittedCategory.category_name

      return design.root
    }

}