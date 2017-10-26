import java.util.*;
class OddsAndEvens {
public static void main (String args [])
{String s,y;
String O="odd";
String E="even";
int userNumber,sum;
System.out.println("Let's play a game called Odds and Evens ");

      Scanner in = new Scanner(System.in);
 
      System.out.println("What is your name");
      s = in.nextLine();
 System.out.println("Hi " +s + "which do you choose? (O)dds or (E)vens");
y=in.nextLine();
if(y.equals(O))
System.out.println("you picked odd computer will be even");
else
System.out.println(" you picked even computer will be odd");
System.out.println("----------------------------------------------");
System.out.println("enter number of fingers you choose between 0-5");
userNumber=in.nextInt();
System.out.println("you choose"  +userNumber+ "fingers");
Random rand = new Random();
int computer = rand.nextInt(6);
System.out.println("the computer plays number"  +computer+ "fingers");
System.out.println(sum=userNumber + computer );
boolean oddOrEven = sum % 2 == 0;
//String str2=Integer.toString(userNumber);//
if(((sum%2==0) && (userNumber%2==0)) ||((sum%2!=0) && (userNumber%2!=0)))
System.out.println("Congrats ! user you win");
else
System.out.println("Computer Wins");
System.out.println("----------------------------------------------");
}}