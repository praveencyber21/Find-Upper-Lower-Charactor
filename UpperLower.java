package UpperLower;



public class UpperLower {
    public static void main(String args[]) {

        System.out.println("Enter the String: ");
        char c = Scan.Char(); 

        System.out.println(lowerUpper(c));

    }
    static char lowerUpper(char c){

        if(c >= 65 && c <=90){
           return c = (char)(c + 32);
        }
        
        else{
            if(c >= 97 && c <=122){
           return c = (char)(c - 32);
        }
        
        }
        return c;
    }
  
}

    

