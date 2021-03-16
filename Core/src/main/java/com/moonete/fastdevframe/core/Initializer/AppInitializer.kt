package com.moonete.fastdevframe.core.Initializer

import android.content.Context
import androidx.startup.Initializer
import com.jeremyliao.liveeventbus.LiveEventBus
import com.moonete.fastdevframe.core.BuildConfig
import com.moonete.fastdevframe.core.utils.LogUtil
import com.tencent.mmkv.MMKV

/**
 * @Author: Moon-Ete
 * @CreateDate: 2021/3/14 17:58
 */
class AppInitializer: Initializer<Unit> {

    override fun create(context: Context) {
        LogUtil.init(BuildConfig.DEBUG)
        MMKV.initialize(context)
        LiveEventBus
            .config()
            .autoClear(true)
            .enableLogger(true)
            .setContext(context)
            .lifecycleObserverAlwaysActive(true);
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}