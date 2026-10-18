public class Operator {
    public static void main(String[] args) {
        // Assignment Operators
        int x, y;

        x = 5;
        y = 8;
        x = x + y;

        System.out.println(x);


        // Arithmetic Operators
        x = 10;
        y = 5;

        int penjumlahan = x + y;
        int pengurangan = x - y;
        int perkalian = x * y;
        int pembagian = x / y;
        int modulo = x % y;

        System.out.println(penjumlahan);
        System.out.println(pengurangan);
        System.out.println(perkalian);
        System.out.println(pembagian);
        System.out.println(modulo);
        System.out.println(x);
        System.out.println(y);


        // String Operator
        String firstName = "Andro";
        String lastName = "meda";
        String name = firstName + " " + lastName;

        System.out.println(name);
    }
}