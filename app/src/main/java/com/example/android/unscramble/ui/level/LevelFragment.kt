package com.example.android.unscramble.ui.level

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android.unscramble.R
import com.example.android.unscramble.databinding.FragmentLevelBinding
import com.example.android.unscramble.ui.game.Levels


class LevelFragment : Fragment() {

    private var _binding: FragmentLevelBinding? = null

    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentLevelBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnA1.setOnClickListener {
            val selectedLevel = Levels.A1
            val action = LevelFragmentDirections.actionLevelFragmentToGameFragment(selectedLevel)
            this.findNavController().navigate(action)
        }

        binding.btnA2.setOnClickListener {
            val selectedLevel = Levels.A2
            val action = LevelFragmentDirections.actionLevelFragmentToGameFragment(selectedLevel)
            this.findNavController().navigate(action)
        }

        binding.btnB1.setOnClickListener {
            val selectedLevel = Levels.B1
            val action = LevelFragmentDirections.actionLevelFragmentToGameFragment(selectedLevel)
            this.findNavController().navigate(action)
        }

        binding.btnB2.setOnClickListener {
            val selectedLevel = Levels.B2
            val action = LevelFragmentDirections.actionLevelFragmentToGameFragment(selectedLevel)
            this.findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}