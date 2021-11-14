package com.example.cupcake.data

import com.example.cupcake.R
import com.example.cupcake.model.Cake

class DataSource{
    fun loadCake (): List<Cake>{
        return listOf<Cake>(
            Cake(R.drawable.cupcake,R.string.cupCake,R.string.falvors_cupcake),
            Cake(R.drawable.ice1,R.string.IceCream , R.string.falvors_IceCream),
            Cake(R.drawable.donuts1,R.string.Donuts,R.string.falvors_Donuts),
            Cake(R.drawable.cake,R.string.Cake,R.string.falvors_Cake)
        )
    }


}
