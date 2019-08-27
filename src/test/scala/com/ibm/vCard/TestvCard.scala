package com.ibm.vCard

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestvCard_DFDL {
  val runner = Runner("com/ibm/vCard", "vCard.tdml")

  @AfterClass def shutDown {
    runner.reset
  }
}

class TestvCard_DFDL {
  
  import TestvCard_DFDL._

  @Test def test_embedded(): Unit = { runner.runOneTest("vCard_embedded") }
  @Test def test_escaping(): Unit = { runner.runOneTest("vCard_escaping") }
  @Test def test_lower_case(): Unit = { runner.runOneTest("vCard_lower_case") }
  @Test def test_multi(): Unit = { runner.runOneTest("vCard_multi") }
  @Test def test_not_2_1(): Unit = { runner.runOneTest("vCard_not_2.1") }
  @Test def test_upper_case(): Unit = { runner.runOneTest("vCard_upper_case") }
  @Test def test_vendor_defined(): Unit = { runner.runOneTest("vCard_vendor_defined") }
}
