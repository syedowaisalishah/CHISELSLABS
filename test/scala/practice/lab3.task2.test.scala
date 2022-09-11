package practice
import chisel3._
import org.scalatest._
import chiseltest._
class TASK2TEST extends FreeSpec with ChiselScalatestTester{
    "TASK2 TESTING" in {
        test(new Imm_dValGen()){c=>
        c.io.instr.poke()
        c.clock.step(1)
        c.io.immd_se.expect()
        }

    }


}

