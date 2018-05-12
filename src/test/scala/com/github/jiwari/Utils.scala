package com.github.jiwari

import io.gatling.core.Predef._
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
    keyExtractor(session.attributes.get(keyName))
  }

  def keyExtractor(keyOption: Option[Any]): String = {
    keyOption match {
      case Some(key) => key.toString
      case None => ""
    }
  }
}