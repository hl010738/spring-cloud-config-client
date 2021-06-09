package com.springboot.config.client.controller

import com.springboot.config.client.config.ConfigClientConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConfigClientController {

    @Autowired
    lateinit var configClientConfig: ConfigClientConfig

    @RequestMapping(value = ["/hosts"])
    fun getHosts(): String? {
        return "${configClientConfig.redisHost}, ${configClientConfig.mysqlHost}, ${configClientConfig.mongoHost}"
    }
}
