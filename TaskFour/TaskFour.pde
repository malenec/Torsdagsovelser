int numbers = 20 ;

/*
for ( int i=0; i <= numbers; i++) {
 delay(300);
 // println(i);
 
 if ((i % 2) == 0) {
 println(i);
 }
 
 }
 */

int i = 0 ;

while (i <= numbers) {
  delay(300);
  if (i % 2 == 0)
    println(i);
  i++;
}
