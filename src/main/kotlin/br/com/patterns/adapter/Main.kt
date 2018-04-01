package br.com.patterns.adapter

fun main(args: Array<String>) {
    val legacyUserRepository = LegacyUserRepository()
    legacyUserRepository.list()

    val newUserRepository = NewUserRepository()
    newUserRepository.list()

    val userRepositoryAdapter = UserRepositoryAdapter(newUserRepository)
    userRepositoryAdapter.list()
}