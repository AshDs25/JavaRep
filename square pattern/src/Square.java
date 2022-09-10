import java.util.Scanner;

public class Square {
    public static void takeInput(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1){
                    System.out.print("*");
                }else if(j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        int n;
        Scanner obj= new Scanner(System.in);
        System.out.println("Input rows:");
        n= obj.nextInt();
        takeInput(n);
    }
}
