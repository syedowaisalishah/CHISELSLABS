package practice
import chisel3._
import org.scalatest._
import chiseltest._

class TASK3TEST  extends FreeSpec with ChiselScalatestTester {
    "TASK3 TESTING" in {
        test(new decoder_with_valid(){c=>
        c.io.in.poke(2.U)
        c.clock.step(40)
        c.io.out.bits.expect(4.U)
        c.io.out.valid.expect(1.B)

        }
    }
}