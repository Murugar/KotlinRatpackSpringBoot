package com.iqmsoft.message

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

open interface MessageService {
  fun makesMeHappy(): String
}

@Configuration
open class MessageServiceConfig {

  @Bean
  open fun messageService(): MessageService {
    return object : MessageService {
      override fun makesMeHappy() = "This is a test"
    }
  }
}

