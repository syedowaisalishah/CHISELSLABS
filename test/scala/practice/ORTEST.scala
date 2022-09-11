// package practice
// import chisel3._
// import org.scalatest._
// import chiseltest._

// class ORTEST extends FreeSpec with ChiselScalatestTester{
//     "OR GATE TEST" in {
//         test(new OR()){ c =>
//             c.io.a.poke(1.B)
//             c.io.b.poke(1.B)
//             c.clock.step(1)
//             c.io.c.expect(1.S)
//         }
//     }
// }