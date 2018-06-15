package br.com.patterns.template

abstract class Game {

    fun play() {
        initialize()
        startPlay()
        endPlay()
    }

    protected abstract fun initialize()
    protected abstract fun startPlay()
    protected abstract fun endPlay()

}