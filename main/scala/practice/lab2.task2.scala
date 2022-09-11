// package practice
// import chisel3._
// import chisel3.util._
// class MUXD extends Module {
//     val io = IO (new Bundle {
//         val in0 = Input(Bool())
//         val in1 =Input(Bool())
//         val in2 =Input(Bool())
//         val in3 =Input(Bool())
//         val S1  =Input(Bool())
//         val S2 =Input(Bool())
//         val shift = Input ( Bool () )
//         val out1 = Output(Bool())
//         val out2 = Output(Bool())
//         val out3 = Output(Bool())
//         val out4 = Output(Bool())
//     })
//     io.out1 := Mux(io.S1,Mux(io.S2,io.in0,io.in1),Mux(io.S2,io.in2,io.in3))
//     io.out2 := Mux(io.S1,Mux(io.S2,io.in0,io.in1),Mux(io.S2,io.in2,io.shift(io.in3)))
//     io.out3 := Mux(io.S1,Mux(io.S2,io.in0,io.in1),Mux(io.S2,io.shift(io.in2),io.shift(io.in3)))
//     io.out4 := Mux(io.S1,Mux(io.S2,io.in0,io.shift(io.in1)),Mux(io.S2,io.shift(io.in2),io.shift(io.in3)))

// }