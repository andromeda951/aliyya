public class Selection {
    public static void main(String[] args) {
        
        // String password = "12345";

        // if (password == "12345") {
        //     System.out.println("Selamat Datang");
        //     System.out.println("Selamat Datang");
        // }
        
        // System.out.println("Andromeda");


        // int x = 3;
        // if (x % 2 == 0) {
        //     System.out.println("Genap");
        //     System.out.println("Genap");
        // } else {
        //     System.out.println("Ganjil");
        //     System.out.println("Ganjil");
        // }


        // int x = -5;
        // if (x > 0) {
        //     System.out.println("positif");
        //     System.out.println("positif");
        // } else if (x < 0) {
        //     System.out.println("negatif");
        //     System.out.println("negatif");
        // } else if (x == 0) {
        //     System.out.println("Nol");
        // }
        // System.out.println();

        // operator perbanding
        // == !=  > < >= <=

        // operator logika
        // ! && || 

        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // !true = false
        // !false = true

        // boolean y = !true;
        // System.out.println(y);


        int x = 0;
        if (x % 2 == 0 && x > 0) {
            System.out.println("genap positif");
        } else if (x % 2 == 0 && x < 0) {
            System.out.println("genap negatif");
        } else if (x % 2 == 1 && x > 0) {
            System.out.println("ganjil positif");
        } else if (x % 2 == 1 && x < 0) {
            System.out.println("ganjil negatif");
        } else {
            System.out.println("NOL");
            System.out.println("NOL");
        }




    }
}
