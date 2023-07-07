import java.util.Scanner;
class que6 {
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
 
System.out.println("enter the no of days :");
int remday=sc.nextInt();
int months=remday/30;
int days=remday%30;

System.out.println("months are:"+months);
System.out.println("days are:"+days);
}
}