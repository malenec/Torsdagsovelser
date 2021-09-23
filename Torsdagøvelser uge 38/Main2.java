class Main2{
  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands");
   }

   System.out.println(mySum(4,5));

   System.out.println(myWords("malene"));

   System.out.println(checkCharacter("Malene"));

}


public static boolean iAmHappy(){
 // fill out what is missing here:
  if(happy == true){
  return true;
} else {
  return false;
}
}

public static int mySum(int a, int b){
  return a + b;
}

public static String myWords(String changeToUppercase){
return changeToUppercase.toUpperCase();

}

public static boolean checkCharacter(String filledWithCharacters){
  char characterOne = filledWithCharacters.charAt(0);

  if(Character.isUpperCase(characterOne)){
    return true;
  } else{
    return false;
  }
}



}
