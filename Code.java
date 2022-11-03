import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Input a Number : ");
        int n=input.nextInt();
        double harmonik=0;
        for(double i=1;i<=n;i++){
            harmonik+=1/i;
        }
        System.out.println("Girilen Sayinin Harmonik Degeri : "+harmonik);
    }
}
