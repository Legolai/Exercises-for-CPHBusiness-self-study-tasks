// Task 6.a
int a = (int) random(10);
int b = (int) random(10);

if(a == 10 || b == 10 || a + b == 10){
  println("Succes");
}
else{
  println("Failure");
}


// Task 6.b
int x = (int) random(30);
int y = (int) random(30);
int z = (int) random(30);

if(!(x % 10 == 0 || y % 10 == 0 || z % 10 == 0) && x+y+x == 30){
  println("Succes");
}
else{
  println("Failure");
}
