package dev.jessehaniel.kotlin.spring.boot.mail

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringBootMailApplication

fun main(args: Array<String>) {
    runApplication<SpringBootMailApplication>(*args)
}

@Bean
fun init(service: NotificationService): CommandLineRunner {
    return CommandLineRunner {
        service.send(
                EmailRequest(
                        receiverEmail = "fake@mail.com",
                        subject = "Test application",
                        message = "This is an e-mail sent from my study project for Spring Boot Email API"
                )
        )
    }
}
