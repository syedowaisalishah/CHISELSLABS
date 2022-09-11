// package practice
// import chisel3 . _
// class LM_IO_Interface extends Bundle {
// val in = Input ( UInt (32. W ) )
// val s0 = Input ( Bool () )
// val s1 = Input ( Bool () )
// val s2 = Input ( Bool () )
// val out = Output (UInt(32.W))
// }
// class Mux_5to1 extends Module {
// val io = IO (new LM_IO_Interface )
// io . out := Mux( io . s0 , Mux( io . s1 , io . in (3) , io . in (2) ) ,
// Mux( io . s1 , io . in (1) ,Mux(io.s2, io . in (0),io.in(4) ) ) )

// }