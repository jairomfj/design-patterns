package br.com.patterns.adapter

open class LegacyUserRepository {

    open fun list() {
        println("Listing all users from legacy repository")
    }

}