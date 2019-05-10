import  java.util.Scanner;

public class fact {
    public  static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("faktoriyeli alınacak sayiyi girin");

        int deger = scan.nextInt();

        int fakt = 1;

        for (int i=1;i<deger;i++){
            fakt = fakt * i;

        }
        System.out.println(fakt);
    }

}
