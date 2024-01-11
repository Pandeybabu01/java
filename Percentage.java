import java.util.Scanner;


public class Percentage {
    public static void main(String[] args) {
        float English, Math, Physics, Chemistry, Hindi;
        double total, average,percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your five subject name");
        System.out.println("Entner marks of English subject");
        English=sc.nextFloat();
        System.out.println("Enter marks Math subject");
        Math=sc.nextFloat();
        System.out.println("Enter marks of Physics subject");
        Physics=sc.nextFloat();
        System.out.println("Enter marks Chemistry subject");
        Chemistry=sc.nextFloat();
        System.out.println("Enter marks of Hindi subject");
        Hindi=sc.nextFloat();

        total= English + Math + Physics + Chemistry + Hindi;
        average=(total/5.0);
        percentage=(total/500.0)*100;
        System.out.println("Total marks="+total);
        System.out.println("Average marks="+average);
        System.out.println("Percentage marks="+percentage);
    }

    
}