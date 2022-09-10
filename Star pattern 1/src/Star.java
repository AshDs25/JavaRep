import java.util.Scanner;

public class Star {
    public static void takeInput(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int a;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter No. of lines:");
        a=obj.nextInt();
        takeInput(a);
    }
}
