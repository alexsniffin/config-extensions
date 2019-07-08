package com.github.alexsniffin.implicits

import com.typesafe.config.Config

object ConfigExtensions {

  implicit class OptionalConfig(val underlying: Config) extends AnyVal {

    def getOptionalBoolean(path: String): Option[Boolean] = if (underlying.hasPath(path)) {
      Some(underlying.getBoolean(path))
    } else {
      None
    }

    def getOptionalString(path: String): Option[String] = if (underlying.hasPath(path)) {
      Some(underlying.getString(path))
    } else {
      None
    }

    def getOptionalInt(path: String): Option[Int] = if (underlying.hasPath(path)) {
      Some(underlying.getInt(path))
    } else {
      None
    }

    def getOptionalLong(path: String): Option[Long] = if (underlying.hasPath(path)) {
      Some(underlying.getLong(path))
    } else {
      None
    }

    def getOptionalDouble(path: String): Option[Double] = if (underlying.hasPath(path)) {
      Some(underlying.getDouble(path))
    } else {
      None
    }

    def getOptionalConfig(path: String): Option[Config] = if (underlying.hasPath(path)) {
      Some(underlying.getConfig(path))
    } else {
      None
    }

  }

}
