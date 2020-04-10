package com.mellenwood.covidtracker.presentation.main

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mellenwood.covidtracker.R
import com.mellenwood.covidtracker.data.CovidStatRepositoryImpl
import com.mellenwood.covidtracker.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View {
//        return inflater.inflate(R.layout.main_fragment, container, false)
//    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = MainViewModel(CovidStatRepositoryImpl())

        val binding : MainFragmentBinding = DataBindingUtil.setContentView(activity as Activity, R.layout.main_fragment)
        binding.lifecycleOwner = activity
        binding.viewmodel = viewModel


        viewModel.getGlobalSummary()


    }

}
