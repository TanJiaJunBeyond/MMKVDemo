package com.tanjiajun.mmkvdemo.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by TanJiaJun on 2020-01-18.
 */
@Parcelize
data class UserData(
    var name: String,
    var gender: String,
    var age: Int
) : Parcelable