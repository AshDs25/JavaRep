import java.util.Scanner;

public class Star2 {
    public static void takeInput(int n){
        for(int i=1;i<=n+1;i++){
            int a=1;
            for(int k=1;k<=n+1-i;k++){
                System.out.print(" ");
                a++;
            }
            for(int j=1;j<=n+1-a;j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args){
        int n;
        Scanner obj= new Scanner(System.in);
        System.out.println("Input:");
        n= obj.nextInt();
        takeInput(n);
    }
}
