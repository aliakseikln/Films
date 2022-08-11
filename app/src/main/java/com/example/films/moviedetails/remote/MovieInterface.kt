package com.example.films.moviedetails.remote

import com.example.films.moviedetails.data.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieInterface {

    @GET()
    suspend fun getAllMovies(
        @Query("s") string: String,
        @Query("page") page: Int,
        @Query("apiKey") apiKey: String
    ): Response<MovieResponse>

}