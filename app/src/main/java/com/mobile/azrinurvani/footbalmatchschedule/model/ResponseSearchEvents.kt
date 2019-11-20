package com.mobile.azrinurvani.footbalmatchschedule.model


import com.google.gson.annotations.SerializedName


data class ResponseSearchEvents(

	@field:SerializedName("event")
	val event: List<EventItem?>? = null
)