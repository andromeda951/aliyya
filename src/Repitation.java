import java.util.Scanner;

public class Repitation {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }
        // i=0      0<5 true    print hello
        // i=1      1<5 true    print hello
        // i=2      2<5 true    print hello
        // i=3      3<5 true    print hello
        // i=4      4<5 true    print hello
        // i=5      5<5 false
        
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println("ini dieksekusi setelah for loop");
        // i=0      0<5 true    print 0
        // i=1      1<5 true    print 1
        // i=2      2<5 true    print 2
        // i=3      3<5 true    print 3
        // i=4      4<5 true    print 4
        // i=5      5<5 false

        // total = 3+3+3+3+3=15
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total = total + 3;
        }
        System.out.println("total = " + total);
        // // i=0      0<5 true    total=0+3=3
        // // i=1      1<5 true    total=3+3=6
        // // i=2      2<5 true    total=6+3=9
        // // i=3      3<5 true    total=9+3=12
        // // i=4      4<5 true    total=12+3=15
        // // i=5      5<5 false

        // total = 0+1+2+3+4=10
        total = 0;
        for (int i = 0; i < 5; i++) {
            total = total + i;
        }
        System.out.println("total = " + total);
        // i=0      0<5 true    total=0+0=0
        // i=1      1<5 true    total=0+1=1
        // i=2      2<5 true    total=1+2=3
        // i=3      3<5 true    total=3+3=6
        // i=4      4<5 true    total=6+4=10
        // i=5      5<5 false

        Scanner input = new Scanner(System.in);

        total = 0;
        for (int i = 0; i < 5; i++) {
            int x = input.nextInt();
            total = total + x;
        }
        System.out.println("total = " + total);
        System.out.println("rata-rata = " + total/5);

        // i=0      0<5 true    x=2     total=0+2=2
        // i=1      1<5 true    x=3     total=2+3=5
        // i=2      2<5 true    x=5     total=5=5=10
        // i=3      3<5 true    x=5     total=10+5=15
        // i=4      4<5 true    x=10    total=15+10=25
        // i=5      5<5 false



        int n = 8;
        for (int i = 1; i < 10; i+=3) {
            System.out.println(i);
        }        
        // i=1
        // i=4
        // i=7




        input.close();
    }
}
