// Task 6.a
int a = (int) random(10);
int b = (int) random(10);

if (a == 10 || b == 10 || a + b == 10) {
  println("Succes");
} else {
  println("Failure");
}


// Task 6.b
int x = 3;
int y = 17;
int z = 10;

if ((!(x % 10 == 0 || y % 10 == 0 || z % 10 == 0) || (x == 0 || y == 0 || z == 0)) && x+y+z == 30) {
  println("Succes");
} else {
  println("Failure");
}
