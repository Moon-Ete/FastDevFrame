package com.moonete.dep.plugin

object Dependencies {
    private const val lifecycle_version = "2.3.0"
    private const val moshi_version = "1.11.0"
    private const val retrofit_version = "2.9.0"
    private const val coroutines_version = "1.3.9"
    private const val binding_collection_adapter2 = "4.0.0"
    private const val glide_version = "4.11.0"

    val DepMap = mapOf(
        "kotlin" to "org.jetbrains.kotlin:kotlin-stdlib:1.4.31",
        "coroutinesCore" to "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version",
        "coroutinesAndroid" to "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version",
        "androidxCore" to "androidx.core:core-ktx:1.3.2",
        "androidxAppcompat" to "androidx.appcompat:appcompat:1.2.0",
        "androidxConstraintlayout" to "androidx.constraintlayout:constraintlayout:2.0.1",
        "glide" to "com.github.bumptech.glide:glide:$glide_version",
        "androidxActivityKtx" to "androidx.activity:activity-ktx:1.1.0",
        "androidxViewModel" to "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version",
        "androidxLiveData" to "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version",
        "androidxLifecycle" to "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version",
        "androidxSavedState" to "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version",
        "androidxStartup" to "androidx.startup:startup-runtime:1.0.0-alpha02",
        "material" to "com.google.android.material:material:1.2.1",
        "hilt" to "com.google.dagger:hilt-android:2.28.3-alpha",
        "hiltCommon" to "androidx.hilt:hilt-common:1.0.0-alpha02",
        "hiltLifecycleViewModel" to "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02",
        "moshi" to "com.squareup.moshi:moshi-kotlin:$moshi_version",
        "retrofit" to "com.squareup.retrofit2:retrofit:$retrofit_version",
        "retrofitConverterMoshi" to "com.squareup.retrofit2:converter-moshi:$retrofit_version",
        "retrofitConverterGson" to "com.squareup.retrofit2:converter-gson:$retrofit_version",
        "httpLog" to "com.github.ihsanbal:LoggingInterceptor:3.1.0",
        "mmkv" to "com.tencent:mmkv-static:1.2.7",
        "adapter" to "me.tatarka.bindingcollectionadapter2:bindingcollectionadapter:$binding_collection_adapter2",
        "recyclerviewAdapter" to "me.tatarka.bindingcollectionadapter2:bindingcollectionadapter-recyclerview:$binding_collection_adapter2",
        "viewpager2Adapter" to "me.tatarka.bindingcollectionadapter2:bindingcollectionadapter-viewpager2:$binding_collection_adapter2",
        "liveEventBus" to "com.jeremyliao:live-event-bus-x:1.7.3",
    )

    val AptMap = mapOf(
        "hiltDi" to "com.google.dagger:hilt-android-compiler:2.28.3-alpha",
        "hiltAndroidx" to "androidx.hilt:hilt-compiler:1.0.0-alpha02",
        "dataBindingApt" to "com.android.databinding:compiler:3.5.0",
        "moshiCodegen" to "com.squareup.moshi:moshi-kotlin-codegen:$moshi_version",
        "glideApt" to "com.github.bumptech.glide:compiler:$glide_version"
    )
}

