package br.com.patterns.adapter

class UserRepositoryAdapter(private val newUserRepository: NewUserRepository) : LegacyUserRepository() {

    override fun list() {
        newUserRepository.list()
    }

}