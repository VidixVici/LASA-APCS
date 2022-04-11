class Main {
  public static void main(String args[]){
		StudentId normStudent = new StudentId();
    System.out.println(normStudent);
    normStudent.setFirstName("Ada");
    normStudent.setLastName("Lovelace");
    normStudent.setStudentId(223344);
    System.out.println(normStudent);
    StudentId secondStudent = new StudentId("Buzz", "Lightyear", 123456);
    System.out.println(secondStudent);
    System.out.println(secondStudent.getFirstName() + " " + secondStudent.getLastName() + " ID = " + secondStudent.getStudentId() + " Password = " + secondStudent.getPassword());

  }
}