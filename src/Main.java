import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k =0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Введи размер массива: ");
        k = scan.nextInt();

        int[] myArray= new int[--k];

        for (int t=0; t<myArray.length; t++)
            myArray[t]=(t+1)*2;

        for (int t:myArray )
            System.out.print(t+" ");
        System.out.println();

        for (int t: myArray)
            System.out.println(t);
    }
}