// package practice
// import chisel3 . _
// import chisel3 . util . _
// class LM_IO_Interface extends Bundle {
//     val in = Input ( UInt (8. W ) )
//     val s0 = Input ( Bool () )
//     val s1 = Input ( Bool () )
//     val s2 = Input ( Bool () )
//     val out = Output ( Bool () ) // UInt (1. W))
// }
// class Mux_8to1 extends Module {
//     val io = IO (new LM_IO_Interface )
//     val Mux4_to_1_a = Mux( io.s1 , MuxLookup( io.s0 ,false.B , Array(0.B -> io.in (3) ,1.B -> io.in (2) )) ,
//     MuxLookup( io.s0 ,false.B , Array(0.B -> io.in (1) , 1.B -> io.in (0) )))
    
//     val Mux4_to_1_b = Mux( io.s1 , MuxLookup( io.s0 ,false.B , Array(0.B -> io.in (7) ,1.B -> io.in (6) )) ,
//     MuxLookup( io.s1 ,false.B , Array(0.B -> io.in (5) ,1.B -> io.in (4) )))

//     val Mux2_to_1 = Mux( io.s2 , Mux4_to_1_b , Mux4_to_1_a )
//     // Connecting output of 2 _to_1 Mux with the output port .
//     io . out := Mux2_to_1
// }
