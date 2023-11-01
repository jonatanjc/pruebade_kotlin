package com.example.conferenceapp.service

import com.example.conferenceapp.model.Assistant
import com.example.conferenceapp.repository.AssistantRepository
import com.example.conferenceapp.repository.ConferenceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class AssistantService {
    @Autowired
    lateinit var assistantRepository: AssistantRepository

    @Autowired
    lateinit var conferenceRepository: ConferenceRepository

    fun list ():List<Assistant>{
        return assistantRepository.findAll()
    }
    fun save(assistant: Assistant): Assistant {
        try {
            conferenceRepository.findById(assistant.conferenceid)
                ?: throw Exception("Id del conference no encontrado")
            return assistantRepository.save(assistant)
        } catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex)
        }
    }
    fun listById (id:Long?): Assistant?{
        return assistantRepository.findById(id)
    }
}