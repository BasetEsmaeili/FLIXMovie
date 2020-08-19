package com.flix.movie.data.entities

data class Movie(
    val posterPath: String?,
    val adult:Boolean,
    val overview:String,
    val releaseDate:String,
    val genreIds:List<Int>,
    val id:Int,
    val originalTitle:String,
    val originalLanguage:String,
    val title:String,
    val backdropPath:String?,
    val popularity:Double,
    val voteCount:Int,
    val video:Boolean,
    val voteAverage:Double
)