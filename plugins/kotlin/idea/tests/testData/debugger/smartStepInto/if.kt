fun foo() {
   <caret>if (f1()) {
        f2()
    }
}

fun f1() = true
fun f2() {}

// EXISTS: f1()