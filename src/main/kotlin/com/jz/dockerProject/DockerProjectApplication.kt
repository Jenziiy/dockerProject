package com.jz.dockerProject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerProjectApplication

fun main(args: Array<String>) {
	runApplication<DockerProjectApplication>(*args)
}
