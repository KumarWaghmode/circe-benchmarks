package io.circe.benchmarks

import org.scalatest.FlatSpec

class ParsingBenchmarkSpec extends FlatSpec with VersionSpecificParsingSpec {
  val benchmark: ParsingBenchmark = new ParsingBenchmark

  import benchmark._

  "The parsing benchmark" should "correctly parse integers using Circe" in {
    assert(parseIntsC === intsC)
  }

  it should "correctly parse integers using Argonaut" in {
    assert(parseIntsA === intsA)
  }

  it should "correctly parse integers using Spray JSON" in {
    assert(parseIntsS === intsS)
  }

  it should "correctly parse case classes using Circe" in {
    assert(parseFoosC === foosC)
  }

  it should "correctly parse case classes using Argonaut" in {
    assert(parseFoosA === foosA)
  }

  it should "correctly parse case classes using Spray JSON" in {
    assert(parseFoosS === foosS)
  }

  it should "correctly parse case classes using Json4s" in {
    assert(parseFoos4s === foos4s)
  }
}
