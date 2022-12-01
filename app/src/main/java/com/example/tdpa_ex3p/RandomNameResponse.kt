package com.example.tdpa_ex3p

import com.google.gson.annotations.SerializedName
import java.util.jar.Attributes.Name

data class RandomNameResponse(
    @SerializedName("results") val datos: List<Datos>
)

data class Datos(
    @SerializedName("name") val name: Nombre
)

data class Nombre(
    @SerializedName("first") val first: String,
    @SerializedName("last") val last: String,
)

