package com.example.mobile_p9_tugas_bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.mobile_p9_tugas_bottomnav.databinding.FragmentSelectTicketBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SelectTicketFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SelectTicketFragment : Fragment() {
    private lateinit var binding: FragmentSelectTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSelectTicketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            val tv_selectedticket = binding.jenisTiket

            tv_selectedticket.setOnClickListener {
                val action = SelectTicketFragmentDirections.actionOrderTicketFragmentToChooseTicketFragment()
                findNavController().navigate(action)
            }

            val selectedTicketType = arguments?.getString("selectedTicketType")

            selectedTicketType?.let {
                tv_selectedticket.text = it
            }
        }
    }
}