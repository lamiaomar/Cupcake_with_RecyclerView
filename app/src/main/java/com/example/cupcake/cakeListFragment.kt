package com.example.cupcake

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cupcake.adapter.cakeAdapter
import com.example.cupcake.data.DataSource
import com.example.cupcake.databinding.FragmentCakeListBinding
import com.example.cupcake.model.Cake


class cakeListFragment : Fragment() {
    private var _binding: FragmentCakeListBinding? = null
    private val binding get() = _binding!!

    private lateinit var recyclerView: RecyclerView
    lateinit var dataset : List<Cake>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      dataset = DataSource().loadCake()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentCakeListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = binding.recyclerView
        recyclerView.adapter = cakeAdapter(this.requireContext() ,dataset )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}