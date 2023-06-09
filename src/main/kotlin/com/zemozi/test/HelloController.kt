package com.zemozi.test

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    val logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping("/hello")
    fun hello(): String {
        logger.trace("TRACE line")
        logger.debug("DEBUG line")

        logger.info("INFO line")
        logger.warn("WARN line")
        logger.error("ERROR line")

        logger.info("INFO {} {}", 1, "abc")
        try {
            val x = 1 / 0
        } catch (e: Throwable) {
            logger.error("ERR failed to compute x", e)
        }

        return "Hello World!"
    }
}