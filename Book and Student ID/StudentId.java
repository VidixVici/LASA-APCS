public class StudentId{
  private String studentFirstName;
  private String studentLastName;
  private int studentId;
  public StudentId() {
    studentFirstName = "First";
    studentLastName = "Last";
    studentId = 111111;
  }
  public StudentId(String fName, String lName, int sId){
    studentFirstName = fName;
    studentLastName = lName;
    studentId = sId;
  }
  public void setFirstName(String firstName){
    studentFirstName = firstName;
  }
  public void setLastName(String lastName){
    studentLastName = lastName;
  }
  public void setStudentId(int studentIdNew){
    studentId = studentIdNew;
  }
  public String getFirstName(){
    return studentFirstName;
  }
  public String getLastName(){
    return studentLastName;
  }
  public int getStudentId(){
    return studentId;
  }
  public String getPassword(){
    return "" + studentLastName.charAt(0) + studentId + studentLastName.charAt(studentLastName.length()-1);
  }
  public String toString(){
    
    return "Name = " + studentFirstName + " " + studentLastName + " " + "Student ID = " + studentId;
  }
}