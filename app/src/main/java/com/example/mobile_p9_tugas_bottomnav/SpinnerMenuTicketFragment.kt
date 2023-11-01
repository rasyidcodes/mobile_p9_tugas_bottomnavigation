package com.example.mobile_p9_tugas_bottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController

import com.example.mobile_p9_tugas_bottomnav.databinding.FragmentSpinnerTicketBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SpinnerMenuTicketFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SpinnerMenuTicketFragment : Fragment() {
    private lateinit var binding: FragmentSpinnerTicketBinding
    private lateinit var spinner: Spinner
    private lateinit var buyButton: AppCompatButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpinnerTicketBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        spinner = binding.spinnerJenisTiket

        val adapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.jenis_tiket,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        buyButton = binding.spnmenuBtnBuy2
        buyButton.setOnClickListener {
            val selectedTicketType = spinner.selectedItem.toString()

            findNavController().navigateUp()
        }
    }
}