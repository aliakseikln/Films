package com.example.films.moviedetails.utils


class Result<out T>(val status: Status, val data: T?, message: String?) {

    companion object {
        fun <T> success(data: T?): Result<T> {
            return Result(Status.SUCCESS, data, null)
        }

        fun <T> loading(data: T?): Result<T> {
            return Result(Status.LOADING, data, null)
        }

        fun <T> error(data: T?): Result<T> {
            return Result(Status.ERROR, data, null)
        }
    }
}

enum class Status {
    SUCCESS,
    LOADING,
    ERROR
}