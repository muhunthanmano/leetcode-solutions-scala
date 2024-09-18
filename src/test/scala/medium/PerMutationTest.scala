package medium


import org.scalatest.*
import org.scalatest.flatspec.AnyFlatSpec

class PerMutationTest extends AnyFlatSpec {

  "PreMutation" should "Match with the single element" in {
    assert(PerMutation.permute(Array(1)) == Seq(Seq(1)))

  }

  "PreMutation" should "Match with the two element" in {
    assert(PerMutation.permute(Array(1,2)) == Seq(Seq(2,1), Seq(1,2)))
  }

  "PreMutation" should "Match with the empty" in {
    assert(PerMutation.permute(Array()) == Seq())
  }

}
