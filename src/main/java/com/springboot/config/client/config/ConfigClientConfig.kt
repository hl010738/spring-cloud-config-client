package com.springboot.config.client.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.Configuration

@Configuration
@RefreshScope
class ConfigClientConfig {

    @Value("\${redis.host}")
    lateinit var redisHost: String

    @Value("\${mysql.host}")
    lateinit var mysqlHost: String

    @Value("\${mongo.host}")
    lateinit var mongoHost: String

}
