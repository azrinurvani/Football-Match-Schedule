package com.mobile.azrinurvani.footbalmatchschedule.model


import com.google.gson.annotations.SerializedName

data class ResponseDetailPertandingan(

	@field:SerializedName("events")
	val events: List<EventsItem?>? = null
)