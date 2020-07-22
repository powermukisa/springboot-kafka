package co.tala.api.kafka.consumer

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import org.apache.logging.log4j.kotlin.logger
import org.springframework.stereotype.Service

@Component
//@Service
class KafkaConsumer {
    private val logger = logger()

    @KafkaListener(topics = ["NewTopic"], groupId = "group_id", autoStartup = "true", containerFactory = "kafkaListenerContainerFactory")
//    @KafkaListener(topics = ["NewTopic"], autoStartup = "true")
    fun consume(message: String) {
        logger.info { "Received Message in group g=================" }
        logger.info { "Received Message in group group_id------: $message" }
        println("Received Message in group group_id: $message")
    }
}
