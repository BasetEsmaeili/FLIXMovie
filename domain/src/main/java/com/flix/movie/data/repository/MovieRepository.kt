package com.flix.movie.data.repository

import com.flix.movie.data.entities.Popular
import com.flix.movie.data.entities.TopRated
import com.flix.movie.data.entities.Trends
import com.flix.movie.data.entities.Upcoming
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    fun getTopRatedMovies(): Flow<TopRated>

    fun getPopularMovies(): Flow<Popular>

    fun getUpcomingMovies(): Flow<Upcoming>

    fun getTrendMovies(): Flow<Trends>

}