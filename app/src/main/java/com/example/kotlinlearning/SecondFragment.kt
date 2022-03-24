package com.example.kotlinlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class SecondFragment : Fragment() {

var mytestData=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            mytestData=SecondFragmentArgs.fromBundle(it).testData
            // for debugging and test purposes
            print(mytestData)
        }

        val button=view.findViewById<Button>(R.id.secondFragment_button)
        button.setOnClickListener {
            val action=SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            
            Navigation.findNavController(it).navigate(action)

        }
    }
}