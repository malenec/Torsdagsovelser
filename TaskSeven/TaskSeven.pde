int input = 20;

if (input > 0) {
  for (int i=0; i<=input; i++) {
    delay(300);
    println(i);

    if (i==6) {
      println("six");
    } else if (i == input/2) {
      println("HALF!");
    }
  }
} else {
  for (int i=0; i>=input; i--) {
    delay(300);
    println(i);

    if (i == -6) {
      println("six");
    } else if (i == input/2) {
      println("HALF!");
    }
  }
}
