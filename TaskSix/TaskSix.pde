int a = (int) random (0, 10) ;
int b = (int) random (0, 10) ;
int c = (a+b);

if (a == 10 || b == 10 || a + b == 10) {
  println("Success!");
  println(a+ "+" +b+ "=" +c);
} else {
  println("Failure!");
  println(a+ "+" +b+ "=" +c);
}

int x = 0;
int y = 0;
int z = 0;
int w = (x + y + z);

if (x + y + z == 30 && x != 10 && x != 20 && x != 30 && y != 10 && y != 20 && y != 30 && z != 10 && z != 20 && z != 30) {
  println("Success!");
  println(x+ "+" +y+ "+" +z+ "=" +w);
}
else {
  println("Failure!");
  println(x+ "+" +y+ "+" +z+ "=" +w);
}
