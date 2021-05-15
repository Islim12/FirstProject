package org.islimakkaya.samples.application.firstproject

import java.io.Serializable

data class Categories(var category_id:Int,
                      var category_name:String,
                      var category_image_name:String): Serializable {
}