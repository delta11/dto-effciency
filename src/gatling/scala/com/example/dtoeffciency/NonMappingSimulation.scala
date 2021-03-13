package com.example.dtoeffciency

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class NonMappingSimulation extends Simulation {

  val httpProtocol = http.baseUrl("http://localhost:8080")

  val scn = scenario("NonMappingSimulation")
    .repeat(1000) {
      exec(
        http("home").get("/non-mapping")
          .check(status.is(200))
      )
    }

  setUp(
    scn.inject(atOnceUsers(100))
  ).protocols(httpProtocol)
}
