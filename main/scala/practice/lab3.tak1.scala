package lab3
import chisel3 . _
import chisel3 . util . _
class LM_IO_Interface_BranchControl extends Bundle {
    val fnct3 = Input ( UInt (3. W ) )
    val branch = Input ( Bool () )
    val arg_x = Input ( UInt (32. W ) )
    val arg_y = Input ( UInt (32. W ) )
    val br_taken = Output ( Bool () )
}
class BranchControl extends Module {
    val io = IO (new LM_IO_Interface_BranchControl )
// Start Coding here
    val out=Wire(Bool())
    out:=0.B
    switch(io.fnct3){
        is("b000".U){
            out:=io.arg_x & io.arg_y}
        is("b001".U){
            out:=io.arg_x | io.arg_y}
        is("b010".U){
            out:=io.arg_x ^ io.arg_y}
        is("b011".U){
            out:=io.arg_x === io.arg_y}
        is("b100".U){
            out:=io.arg_x =/= io.arg_y}
        is("b110".U){
            out:=io.arg_x > io.arg_y}
        is("b111".U){
            out:=io.arg_x < io.arg_y}
    }
    io.br_taken:=io.branch && out
}
// End your code here
// Well , you can actually write classes too . So , technically you have no


