package com.example.conferenceapp.repository

import com.example.conferenceapp.model.Conference
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ConferenceRepository : JpaRepository<Conference, Long?> {

    fun findById (id: Long?): Conference?

}