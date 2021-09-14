// Task 7.a
int input = 20;
for (int i = input; i > 0; i--) {
  if (i==6) {
    println("six");
  } else {
    if (i == input/2) {
      println("HALF!");
    }
    println(i);
  }
}

// Task 7.b
int Input = 12;
for (int i = Input; (Input < 0 ? i < 0 : i > 0); i += (Input < 0 ? 1 : -1)) {
  if (i == Input/2) {
    print("HALF! ");
  }
  if (i==6) {
    print("six ");
  } else {
    print(i + " ");
  }
}
