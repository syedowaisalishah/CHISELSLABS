package practice
import chisel3._
import org.scalatest._
import chiseltest._
class TASK1TEST extends FreeSpec with ChiselScalatestTester{
    "TASK1 TESTING" in {
        test(new BranchControl()){c=>
            c.io.func3.poke(1.U)
            c.io.branch.poke(1.B)
            c.io.arg_x.poke(4.U)
            c.io.arg_y.poke(3.U)
            c.clock.step(20)
            c.io.br_taken.expect(1.B)
        }

    }


}
