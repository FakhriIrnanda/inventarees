package com.example.pengelolanbarangjurusanfakhri.api

import com.example.pengelolanbarangjurusanfakhri.ResponseDetail1
import com.example.pengelolanbarangjurusanfakhri.ResponseDetail2
import com.example.pengelolanbarangjurusanfakhri.ResponseDetail3
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("barang/1")
    fun getdetail1 () : Call<ResponseDetail1>

    @GET("barang/2")
    fun getdetail2 () : Call<ResponseDetail2>

    @GET("barang/3")
    fun getdetail3 () : Call<ResponseDetail3>

}
