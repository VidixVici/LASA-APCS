import java.util.Arrays;
public class Vigenere
{
   // declare instance variables for text and keyword
   private String plainText;
   private String key;

   // default constructor
   public Vigenere()
   {
	   plainText = "";
     key = "";
   }
    
   // initialization constructor
   public Vigenere(String theMsg, String theKey)
   {
     plainText = theMsg;
     key = theKey;
   }
    
   // modifier method for plainText
   public void setPlainText(String pT){
     plainText = pT;
   }
    
   // modifier method for key
   public void setKey(String k){
     key = k;
   }
    
   // accessor method for plainText
   public String getPlainText(){
     return plainText;
   }
    
   // accessor method for key
   public String getKey(){
     return key;
   }
    
   // encrypt method
   //   return a String
   //   no parameters
   public String encrypt()
   {
     String plainTextE = plainText;
     String keyE = key;
     int n = plainTextE.length();
     char[] outE = new char[n];
     int keyELR = keyE.length();
     int keyEL = keyE.length();
     for(int i = 0; (i < plainTextE.length()) && (keyEL != 0); i++){
       if(((int)plainTextE.charAt(i)) + (((int)keyE.charAt(keyE.length() - keyEL)-65)) > 90){
         int newVal = (((int)plainTextE.charAt(i)) + (((int)keyE.charAt(keyE.length() - keyEL)-65))) - 90;
         outE[i] = (char)(64+newVal);
       }
       else{
        outE[i] = (char)(((int)plainTextE.charAt(i)) + (((int)keyE.charAt(keyE.length() - keyEL)-65)));
       }
        keyEL--;
        if(keyEL == 0){
          keyEL = keyELR;
        }
      }
     String str = new String(outE);
     return(str);
   }
   
    
   // decrypt method
   //   return a String
   //   String parameter 
   public String decrypt(String s){
     String plainTextE = s;
     String keyE = key;
     int n = plainTextE.length();
     char[] outE = new char[n];
     int keyELR = keyE.length();
     int keyEL = keyE.length();
     for(int i = 0; (i < plainTextE.length()) && (keyEL != 0); i++){
       if(((int)plainTextE.charAt(i)) - (((int)keyE.charAt(keyE.length() - keyEL)-65)) < 65){
         int newVal = 65 - (((int)plainTextE.charAt(i)) + (((int)keyE.charAt(keyE.length() - keyEL)-65)));
         outE[i] = (char)(90-newVal);
       }
       else{
        outE[i] = (char)(((int)plainTextE.charAt(i)) - (((int)keyE.charAt(keyE.length() - keyEL)-65)));
       }
        keyEL--;
        if(keyEL == 0){
          keyEL = keyELR;
        }
      }
     String str = new String(outE);
     return(str);
   }
   
   // equals method
   //   return a boolean
   //   Vigenere reference parameter
  public boolean equals(Object obj){
    Vigenere v = (Vigenere)obj;
    if(v.plainText == plainText && v.key == key){
      return(true);
    }
    else{
      return(false);
    }
  }
   
   // toString() method
   public String toString()
   {
        return("plain Text     = " + plainText + "\nkey            = " + key + "\nencrypted Text = " + encrypt());    // Do NOT modify 
   }
    
}