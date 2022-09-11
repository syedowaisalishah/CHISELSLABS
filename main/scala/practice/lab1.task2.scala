// package practice
// import chisel3._
// import scala.language.postfixOps
// import chisel3.util._
// import java.io.File

// class Counter (counterbits:UInt ) extends Module {
//     val io = IO (new Bundle {
//         val result = Output ( Bool () )
//     })

//     var count = RegInit(0.U(4.W))
//     var newc = RegInit(0.U(4.W))
//     var newcc = RegInit(0.U(4.W))

//     when((count > counterbits) || (newc === 1.U)){
//         println("a")
//         newcc :=1.U
//     } 
//     .otherwise{
//         count := count + 1.U
    
//     }
//     when((count < 10.U ) && (newcc === 0.U)){
//         println("b")

//     }
//     .otherwise{
//         newc:=1.U
//         newcc:=1.U
//         count := count-1.U
//     }
        


    
//     io.result :=count
// }


