package com.example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

final class Test extends AnyFlatSpec with Matchers {

  it should "pass test placeholder" in {
    1 shouldEqual 1
  }

}
