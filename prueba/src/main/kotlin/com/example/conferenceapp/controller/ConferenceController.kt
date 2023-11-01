package com.example.conferenceapp.controller


import com.example.conferenceapp.model.Conference
import com.example.conferenceapp.service.ConferenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Conference")   //endpoint
class ConferenceController {
    @Autowired
    lateinit var conferenceService: ConferenceService

    @GetMapping
    fun list ():List <Conference>{
        return conferenceService.list()

    }
    @PostMapping
    fun save (@RequestBody conference: Conference): ResponseEntity<Conference> {
        return ResponseEntity(conferenceService.save(conference), HttpStatus.OK)
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): ResponseEntity<*>{
        return ResponseEntity(conferenceService.listById (id), HttpStatus.OK)
    }
}