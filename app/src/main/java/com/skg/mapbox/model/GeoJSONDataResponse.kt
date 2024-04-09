package com.skg.mapbox.model

data class GeoJSONData(
    val type: String,
    val features: List<Feature>
)

data class Feature(
    val type: String,
    val id: Int,
    val geometry: Geometry,
    val properties: Properties
)

data class Geometry(
    val type: String,
    val coordinates: List<Double>
)

data class Properties(
    val OBJECTID: Int,
    val ID: Int,
    val TIPO: String,
    val N_RUTAS: Int,
    val ADMINISTRA: String,
    val UBICACION: String,
    val FOTOS: String,
    val ESTADO_DE_SENAL: String?,
    val ESTADO_DE_DEMARCA: String?,
    val ESTADO_DE_CASETA: String?,
    val TIPO_CASETA: String?,
    val DANOS: String?,
    val OBSERVACIONES: String?
)
