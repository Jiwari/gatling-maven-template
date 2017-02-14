package config

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.ChainBuilder

object Utils {
  def printKey(key: String): ChainBuilder = {
    exec(session => {
      println("Printing key [" + key + "]: " + getKey(session, key))
      session
    })
  }

  def printSomething(value: String): ChainBuilder =  {
    exec(session => {
      println("Printing: " + value)
      session
    })
  }

  def getKey(session: Session, keyName: String): String = {
    return keyExtractor(session.attributes.get(keyName))
  }

  def keyExtractor(keyOption: Option[Any]): String = {
    return keyExtractor(keyOption, true)
  }

  def keyExtractor(keyOption: Option[Any], end: Boolean): String = {
    val key = keyOption.toString()
    if (key.contains("Some(")) {
      if (end)
        return key.substring(5).replace(")", "")
      else return key.substring(5).replace(")", ",")
    } else return "NULL"
  }
}