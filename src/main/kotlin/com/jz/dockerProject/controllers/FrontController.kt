package com.jz.dockerProject.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FrontController {
    @GetMapping
    fun front(): ResponseEntity<String>{
        return ResponseEntity.ok("hi there!")
    }
}