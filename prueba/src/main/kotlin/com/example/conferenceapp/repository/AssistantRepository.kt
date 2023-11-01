package com.example.conferenceapp.repository

import com.example.conferenceapp.model.Assistant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AssistantRepository : JpaRepository<Assistant, Long?> {

    fun findById (id: Long?): Assistant?


}