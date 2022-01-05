/* 
 Lacture no. 32 , Recursion day 2 fibbonacci number program code in java language. Just enjoy it.
 Code in java language 100% execute in your system if you have Java in your system.
 if your don't have java so please watch a video on youtube that how to install java in our system.
 then follow following steps:

java coder instruction for you

please copy this entire code ans paste it in your favourite editor in my case editor is Notepad

save file as Fibbonacci.java
and and paste this command in cmd for compile our code

      javac Fibbonacci.java
and then paste
      java Fibbonacci
*/

// our program starts from here .....
import java.util.Scanner;

public class Fibbonacci{

  public static void main(String [] args){
  
  Scanner scan=new Scanner(System.in);
    System.out.println("Enter Value of n :");
    int n=scan.nextInt();
    
    int result=fibbonacci(n);
  System.out.println(result);
  }
  
 // from line 20 to line 53 our recursion code
 
  static int fibbonacci(int n){
    
// listen : logic is same but the way of writing the code in any programming language is different  , simply means SYNTAX is different
	
// here is our base case   
  if(n==0){
  return 0;
  }
 
  if(n==1){
  return 1;
  }

// this is our recursive realtion and recursive call

  int ans= fibbonacci(n-1)+fibbonacci(n-2);

  return ans;   // or we can also write this -->  return fibbonacci(n-1)+fibbonacci(n-2);
}

}
