package com.mobile.azrinurvani.footbalmatchschedule.network

import java.net.URL

class ApiRequest {

    fun doRequest(url:String):String{
        return URL(url).readText()
    }
}