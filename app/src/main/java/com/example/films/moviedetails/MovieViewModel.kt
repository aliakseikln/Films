package com.example.films.moviedetails

import androidx.lifecycle.*
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import androidx.paging.liveData
import com.example.films.moviedetails.data.moviedetails.MovieDetails
import com.example.films.moviedetails.remote.MovieInterface
import com.example.films.moviedetails.ui.details.MovieDetailsRepository
import com.example.films.moviedetails.ui.movie.MoviePaging
import com.example.films.moviedetails.utils.Events
import com.example.films.moviedetails.utils.Result
import com.example.films.moviedetails.utils.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieViewModel @Inject constructor(
    private val movieInterface: MovieInterface,
    private val repository: MovieDetailsRepository
) : ViewModel() {

    private val query = MutableLiveData<String>()
    private val _movieDetails = MutableLiveData<Events<Result<MovieDetails>>>()
    val movieDetails: LiveData<Events<Result<MovieDetails>>> = _movieDetails

    val list = query.switchMap { query ->
        Pager(PagingConfig(pageSize = 10)) {
            MoviePaging(query, movieInterface)
        }.liveData.cachedIn(viewModelScope)
    }

    fun setQuery(s: String) {
        query.postValue(s)
    }

    fun getMovieDetails(imdbId: String) = viewModelScope.launch {
        _movieDetails.postValue(Events(Result(Status.LOADING, null, null)))
        _movieDetails.postValue(Events(repository.getMovieDetails(imdbId)))
    }
}