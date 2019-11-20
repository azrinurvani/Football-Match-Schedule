package com.mobile.azrinurvani.footbalmatchschedule.model


import com.google.gson.annotations.SerializedName

data class ResponseDetailLiga(

	@field:SerializedName("leagues")
	val leagues: List<LeaguesItem?>? = null
)