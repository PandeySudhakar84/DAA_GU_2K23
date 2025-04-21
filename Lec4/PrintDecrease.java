package Lec4;

public class PrintDecrease {
    public static void main(String[] args) {
        int n=5;
        PD(n);
    }
    public static void PD(int n){
        if(n==0){
            return;
        }
        //PI(n-1);
        System.out.print(n+" ");
          PD(n-1);
    }
}
