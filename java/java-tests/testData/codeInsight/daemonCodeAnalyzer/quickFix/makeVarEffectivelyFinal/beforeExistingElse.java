// "Make variable effectively final" "true-preview"
class X {
  void test(boolean a) {
    int x = 0;
    if (a) {
      x = 1;
    }
    else System.out.println("hello");
    Runnable r = () -> System.out.println(<caret>x);
  }
}