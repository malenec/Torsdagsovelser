public class Datamatik{

  public static Student[] studentsArray = {
    new Student("Malene", 34, true, 'b'),
    new Student("Sofia", 19, true, 'b'),
    new Student("Kristian", 32, false, 'b'),
    new Student("Muneeb", 26, false, 'b'),
    new Student("Mia", 24, true, 'b'),
    new Student("Kim", 27, false, 'b'),
    new Student("Long", 29, false, 'b'),
    new Student("Jens", 69, false, 'b'),
    new Student("Denis", 39, false, 'b'),
    new Student("Martin", 28, false, 'b'),
  };

  public static void main(String[] args) {

    Teacher teacherWilliam = new Teacher("William", 30, false);

    //Student studentMalene = new Student("Malene", 34, true, 'b');

    //Student studentSofia = new Student("Sofia", 19, true, 'b');

    //studentsArray[0] = studentMalene;

    //identification(studentsArray,0);

    System.out.println("Vores lærer hedder " +teacherWilliam.name);

    identification(studentsArray,3);

    //System.out.println("Jeg hedder " +studentMalene.name+ " og går på hold " +studentMalene.datamatikerTeam);

    //System.out.println("Jeg er i gruppe med " +studentSofia.name+ ", som også går på hold " +studentSofia.datamatikerTeam);



    System.out.println(searchByName(studentsArray,"Long"));

  }

  public static String identification (Student[] newStudentsArray, int indexSpot){
    Student instance = newStudentsArray[indexSpot];
    System.out.println(instance.name);
    return instance.name;
  }

  public static int searchByName (Student[] newStudentsArray2, String newName){
    int index = -1;
    for(int i=0; i<newStudentsArray2.length; i++){
      if(newName.equals(newStudentsArray2[i].name)== true){
        index = i;

      }


    }



    return index;
  }
}
