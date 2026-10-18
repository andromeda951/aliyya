public class Output {
    public static void main(String[] args) {
        // print value
        System.out.println(6);
        System.out.println(1.75);
        System.out.println("Halo, salam kenal");
        System.out.println('{');
        System.out.println(true);
        System.out.println();

        
        // print expresion
        int x = 10;
        System.out.println(5 * 2);
        System.out.println(5.5 + 1);
        System.out.println(5 * x);


        String name = "Andromeda";
        System.out.println("Halo " + "Budi");   
        System.out.println("Name : " + name);
        System.out.println(1 + ". Name : " + name);
        System.out.println("luas = " + x);
        System.out.println("luas = " + (x*5));
        System.out.println("x = " + x + ", x*10" + (x*10));
        
        System.out.print('A');
        System.out.println("***B***");
        System.out.println();

        
        // printf
        final double PI = 3.1415926;
        System.out.printf("%d\n", x);
        System.out.printf("%f\n", PI);
        System.out.printf("value = %.2f\n", PI);
        System.out.printf("Name : %s\n", name);
        System.out.printf("PI = %f      x = %d\n", PI, x);
        System.out.printf("area = %d\n", 10*5);

        char initialsName = 'A';
        System.out.printf("initials Name : %c\n", initialsName);
        
    }
}