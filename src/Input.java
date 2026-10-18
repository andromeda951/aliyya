import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l;

        System.out.print("masukan panjang: ");
        p = input.nextInt();
        System.out.print("masukan lebar: ");
        l = input.nextInt();

        int luas = p * l;
        System.out.println("LUAS = " + luas);


        
        input.close();
    }
}