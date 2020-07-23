package com.powem.net.kafka

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component


@Component
class KafkaMessageListenerBean {
    @KafkaListener(topics = ["test", "test2"])
    fun processMessage(content: String?) {
        println("New message received: Message content --> $content")
    }
}