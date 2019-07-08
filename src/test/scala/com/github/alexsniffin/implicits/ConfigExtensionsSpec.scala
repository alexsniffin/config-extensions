package com.github.alexsniffin.implicits

import com.github.alexsniffin.implicits.ConfigExtensions.OptionalConfig
import com.typesafe.config.{Config, ConfigFactory}
import org.scalatest.{FlatSpec, GivenWhenThen}

class ConfigExtensionsSpec extends FlatSpec with GivenWhenThen {
  info("Running OptionalConfigSpec")

  "getOptionalBoolean" should "return Some" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional boolean from a valid field")
    val result: Option[Boolean] = config.getOptionalBoolean("test.booleanField")

    Then("the result should be defined")
    assert(result.isDefined)
  }

  "getOptionalBoolean" should "return None" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional boolean from a invalid field")
    val result: Option[Boolean] = config.getOptionalBoolean("test.booleanField1")

    Then("the result should be None")
    assert(result.isEmpty)
  }

  "getOptionalString" should "return Some" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional string from a valid field")
    val result: Option[String] = config.getOptionalString("test.stringField")

    Then("the result should be defined")
    assert(result.isDefined)
  }

  "getOptionalString" should "return None" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional string from a invalid field")
    val result: Option[String] = config.getOptionalString("test.stringField1")

    Then("the result should be None")
    assert(result.isEmpty)
  }

  "getOptionalInt" should "return Some" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional Int from a valid field")
    val result: Option[Int] = config.getOptionalInt("test.intField")

    Then("the result should be defined")
    assert(result.isDefined)
  }

  "getOptionalInt" should "return None" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional Int from a invalid field")
    val result: Option[Int] = config.getOptionalInt("test.intField1")

    Then("the result should be None")
    assert(result.isEmpty)
  }

  "getOptionalLong" should "return Some" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional Long from a valid field")
    val result: Option[Long] = config.getOptionalLong("test.longField")

    Then("the result should be defined")
    assert(result.isDefined)
  }

  "getOptionalLong" should "return None" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional Long from a invalid field")
    val result: Option[Long] = config.getOptionalLong("test.longField1")

    Then("the result should be None")
    assert(result.isEmpty)
  }

  "getOptionalDouble" should "return Some" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional Double from a valid field")
    val result: Option[Double] = config.getOptionalDouble("test.doubleField")

    Then("the result should be defined")
    assert(result.isDefined)
  }

  "getOptionalDouble" should "return None" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional Double from a invalid field")
    val result: Option[Double] = config.getOptionalDouble("test.doubleField1")

    Then("the result should be None")
    assert(result.isEmpty)
  }

  "getOptionalConfig" should "return Some" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional Config from a valid field")
    val result: Option[Config] = config.getOptionalConfig("test")

    Then("the result should be defined")
    assert(result.isDefined)
  }

  "getOptionalConfig" should "return None" in new ConfigExtensionsFixture {
    Given("a config fixture")
    When("get optional Config from a invalid field")
    val result: Option[Config] = config.getOptionalConfig("test1")

    Then("the result should be None")
    assert(result.isEmpty)
  }

  trait ConfigExtensionsFixture {

    val config: Config = ConfigFactory.parseString(
      """
        |test {
        |  booleanField = true
        |  intField = 0
        |  doubleField = 0.0
        |  longField = 0
        |  stringField = ""
        |}
      """.stripMargin)

  }

}
