package config

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder
import com.typesafe.config.ConfigFactory

object Configuration {
  
  val config= ConfigFactory.load();
  
  val login: String = config.getString("myapp.user")
  val senha: String = config.getString("myapp.password")
  val url: String = config.getString("myapp.url")

}
