package config

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import config._

object Http {
  val httpProtocol = http
    .baseURL(Configuration.url)
    .disableFollowRedirect
    .inferHtmlResources()
    .acceptHeader("application/json, text/plain, */*")
    .acceptEncodingHeader("gzip, deflate, sdch")
    .acceptLanguageHeader("pt-BR,pt;q=0.8,en-US;q=0.6,en;q=0.4")
    .userAgentHeader("Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.116 Safari/537.36")
}