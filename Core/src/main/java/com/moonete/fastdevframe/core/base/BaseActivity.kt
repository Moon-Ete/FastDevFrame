package com.moonete.fastdevframe.core.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
/**
 * @Author: Moon-Ete
 * @CreateDate: 2021/3/14 17:40
 */
abstract class BaseActivity : AppCompatActivity() {

    protected inline fun <reified T : ViewDataBinding> bindLayout(
        @LayoutRes resId: Int
    ): Lazy<T> = lazy {
        DataBindingUtil.setContentView<T>(this, resId).apply {
            lifecycleOwner = this@BaseActivity
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        startObserve()
    }

    abstract fun initView()

    abstract fun startObserve()

}