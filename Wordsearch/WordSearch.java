import java.util.Arrays;
 
public class WordSearch
{
  /** 2D array instance variable
     You CANNOT add any additional instance variables */
 char[][] array2D;
  
  /** constructor used to set the number of rows and columns in the 2D array
    * @param row
    * @param col*/
  public WordSearch(int row, int col)
  {
    array2D = new char[row][col];
  }
  public char[][] getArray(){
   return array2D;
 }
  /** method to set an element in the 2D array
    * @param s which is the value to store in the 2D array
    * @param row the row to use
    * @param col the column to use*/
  public void setSpot(String s, int row, int col)
  {
    array2D[row][col] = s.charAt(0);
  }
  
  /**how to search in all 8 directions?
 search for proper length of word */
 public boolean fWord(String c, int a, int b){
   boolean result = false;
   int lenOfC = c.length();
   int[] possibleR = {-1, -1, -1, 0, 0, 1, 1, 1};
   int[] possibleC = {-1, 0, 1, -1, 1, -1, 0, 1};
   if(array2D[a][b] != c.charAt(0)){
     return false;
   }
   for(int direction = 0; direction < 8; direction++){
     int rDirection = a + possibleR[direction];
     int cDirection = b + possibleC[direction];
     int temp;
     for(temp = 1; temp < lenOfC; temp++){
       if((rDirection >= array2D.length) || (rDirection < 0) || (cDirection >= array2D[0].length) || (cDirection < 0)){
         break;
       }
       if(array2D[rDirection][cDirection] != c.charAt(temp)){
         break;
       }
       rDirection = rDirection + possibleR[direction];
       cDirection = cDirection + possibleC[direction];
     }
     if(temp == lenOfC){
       result = true;
     }
   }
   return result;
 }
 
  /** methods to check for the word in the 2D array
    * @param word the word to search for
    * @return return true or false*/
  public boolean inGrid(String s)
  {
   boolean finalResult = false;
   for(int i = 0; i < array2D.length; i++){
     for(int j = 0; j < array2D[0].length; j++){
       if(fWord(s, i, j)){
         finalResult = true;
         break;
       }
     }
   }
    return finalResult;
  }
  
  /** toString method
    * @return String containing all elements in the 2D array*/
  public String toString()
  {
   String f = "[";
   for(int i = 0; i < array2D.length; i++){
     if(i == 0){
       f = f + Arrays.toString(array2D[i]).replace(",","") + "\n";
     }
     else if(i == array2D.length - 1){
       f = f + " " + Arrays.toString(array2D[i]).replace(",","");
     }
     else{
       f = f + " " + Arrays.toString(array2D[i]).replace(",","") + "\n";
     }
   }
   f = f + "]";
    return(f);
  }
}
