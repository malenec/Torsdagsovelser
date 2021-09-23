import java.util.Arrays;

public class Main4{

  public static void main(String[] args) {

    int [] intArray = {3,1,2,4};
    String [] stringArray = {"hej","farvel","vi ses","tak for i dag"};
    boolean [] booleanArray = {true, false, true, false};

    printStrings(stringArray);

    System.out.println(sumOfintArray(intArray));

    System.out.println(averageOfintArray(intArray));

sortArray(intArray);
  for(int i=0; i<intArray.length; i++){
    System.out.println(intArray[i]);
  }

  }

public static void printStrings(String [] hilsner){
  for(int i=0; i<hilsner.length; i++){
    System.out.println(hilsner[i]);
  }
}

public static int sumOfintArray(int [] tal){
  int sum = 0;
  for(int i=0; i<tal.length; i++){
    sum += tal[i];
  }
  return sum;
}

public static float averageOfintArray(int [] tal){
  float sum = 0;
  float average = 0;
  for(int i=0; i<tal.length; i++){
    sum += tal[i];
  }
  return sum/tal.length;
}

public static int [] sortArray(int[] numbers){
  Arrays.sort(numbers);
  return numbers;
}

}
