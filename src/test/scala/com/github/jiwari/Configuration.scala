package com.github.jiwari

import com.typesafe.config.{Config, ConfigFactory}

object Configuration {
  
  val config: Config = ConfigFactory.load()
  
  val login: String = config.getString("myapp.user")
  val password: String = config.getString("myapp.password")
  val url: String = config.getString("myapp.url")

}
