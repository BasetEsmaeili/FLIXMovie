package com.flix.movie.view.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.whenStarted
import androidx.navigation.fragment.findNavController
import com.flix.movie.utils.NavigationCommand
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

abstract class BaseFragment<D : ViewDataBinding, V : BaseViewModel> : Fragment() {

    private lateinit var mDataBinding: D
    private lateinit var mViewModel: V

    @LayoutRes
    abstract fun getLayoutId(): Int

    abstract fun getBindingVariable(): Int

    abstract fun getViewModel(): V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = getViewModel()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mDataBinding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)
        mDataBinding.setVariable(getBindingVariable(), mViewModel)
        mDataBinding.executePendingBindings()
        return mDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            whenStarted {
                mViewModel.getNavigatorLiveData().collect { event ->
                    if (event.getValue() != null) {
                        val command = event.getValue()
                        when (command) {
                            is NavigationCommand.To -> {
                                findNavController().navigate(command.direction)
                            }
                            is NavigationCommand.Back -> {
                                findNavController().popBackStack()
                            }
                            is NavigationCommand.BackTo -> {
                                findNavController().popBackStack(command.destinationId, false)
                            }
                            is NavigationCommand.ToRoot -> {

                            }
                        }
                    }
                }
            }
        }
    }

    fun getRootView() = mDataBinding.root
}