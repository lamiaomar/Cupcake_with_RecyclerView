package com.example.cupcake.adapter

import android.content.ClipData
import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.cupcake.model.Cake

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.cupcake.R
import com.example.cupcake.StartFragment
import com.example.cupcake.cakeListFragment

class cakeAdapter (
    private val context : Context ,
    private val dataset : List<Cake>
        ) : RecyclerView.Adapter<cakeAdapter.cakeViewHolder>(){

            class cakeViewHolder(internal val view : View) : RecyclerView.ViewHolder(view){
                val nameText : TextView = view.findViewById(R.id.item_title)
                val typeText : TextView = view.findViewById(R.id.type)
                val imageView : ImageView = view.findViewById(R.id.item_image)
                val buttonView : Button = view.findViewById(R.id.button)
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cakeViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.cake_item,parent,false)
        return cakeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: cakeViewHolder, position: Int) {
        val item = dataset[position]
        holder.nameText.text = context.resources.getString(item.cakeName)
        holder.typeText.text = context.resources.getString(item.Description)
        holder.imageView.setImageResource(item.sweetImage)

        holder.buttonView.setOnClickListener(){
               view ->
           holder.view.findNavController().navigate(R.id.action_cakeListFragment_to_startFragment)

   }
    }

    override fun getItemCount(): Int = dataset.size
}