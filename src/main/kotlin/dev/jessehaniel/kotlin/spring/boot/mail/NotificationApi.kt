package dev.jessehaniel.kotlin.spring.boot.mail

open class Request

data class EmailRequest(var receiverEmail: String, var subject: String?, var message: String?) : Request()

interface NotificationService {
    fun send(request: Request)
}

interface EmailNotificationService : NotificationService {
    fun send(emailRequest: EmailRequest)
}
