package com.example.testnavigationcoponent

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_game.*




class GameFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }


    @SuppressLint("UseRequireInsteadOfGet")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        //get argument
        var arg = GameFragmentArgs.fromBundle(arguments!!)
        question.text = arg.question

        gameDone.setOnClickListener{

            if(answer.text.toString() == "A"){
                // usual use
//                it.findNavController().navigate(R.id.action_gameFragment_to_gameWonFragment)
                // use safe args
                it.findNavController().navigate(GameFragmentDirections.actionGameFragmentToGameWonFragment())

            }else {
                //usual use
//                it.findNavController().navigate(R.id.action_gameFragment_to_gamerOverFragment2)
                // use safe args
                it.findNavController().navigate(GameFragmentDirections.actionGameFragmentToGamerOverFragment2())
            }
        }

    }


}