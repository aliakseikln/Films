package com.example.films.moviedetails.ui.details

import com.example.films.moviedetails.data.moviedetails.MovieDetails
import com.example.films.moviedetails.remote.MovieInterface
import com.example.films.moviedetails.utils.Constants
import com.example.films.moviedetails.utils.Result
import com.example.films.moviedetails.utils.Status

class MovieDetailsRepository(private val movieInterface: MovieInterface) {

    suspend fun getMovieDetails(imdbId: String): Result<MovieDetails> {

        return try {
            val response = movieInterface.getMovieDetails(imdbId, Constants.API_KEY)
            if (response.isSuccessful) {
                Result(Status.SUCCESS, response.body(), null)
            } else {
                Result(Status.ERROR, null, null)
            }
        } catch (e: Exception) {
            Result(Status.ERROR, null, null)
        }
    }
}