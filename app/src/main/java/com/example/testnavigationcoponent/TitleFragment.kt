package com.example.testnavigationcoponent

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_title.*


class TitleFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_title, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //this way
       /* goToSecondDestination.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_gameFragment)
        }*/

        //second way using KTX
  /*       goToSecondDestination.setOnClickListener {
         it.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
           }*/


        //third way using onclick listener of navigation component
        goToSecondDestination.setOnClickListener (
         Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )
        setHasOptionsMenu(true)


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu , menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item , view?.findNavController()!!) || super.onOptionsItemSelected(item)

    }

}