package com.galih.retrofit_galih_15.api

import com.galih.retrofit_galih_15.model.IndonesiaResponse
import com.galih.retrofit_galih_15.modeldata.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>

}













