
package com.flix.movie.common

class SingleEvent<out T>(private val content: T) {
    private var isEmitted = false
    fun getValue(): T? {
        return if (isEmitted)
            null
        else {
            isEmitted = true
            content
        }
    }
}
