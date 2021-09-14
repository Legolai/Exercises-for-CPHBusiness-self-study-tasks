// Task 6.a
int a = (int) random(10);
int b = (int) random(10);

if (a == 10 || b == 10 || a + b == 10) {
  println("Succes");
} else {
  println("Failure");
}


// Task 6.b
int x = 20;
int y = 10;
int z = 0;
int[] vars = {x, y, z};
/*
if (!((x == 10 || y == 10 || z == 10) || (x == 20 || y == 20 || z == 20) || (x == 30 || y == 30 || z == 30)) && x+y+z==30) {
 println("Succes");
 } else {
 println("Failure");
 }
 */
int sum = 0;
for (int num : vars) {
  if (!((num / 10 != num / 10f || num / 10f == 0))) {
    break;
  } else {
    sum += num;
  }
}
if (sum==30) {
  println("Succes");
} else {
  println("Failure");
}
