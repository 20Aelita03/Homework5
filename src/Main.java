public class Main {
    public static void main(String[] args) {
        //Task 1

        int [] Box = new int[3];
        Box [0] = 1;
        Box [1] = 2;
        Box [2] = 3;

        double [] Casket = new double[]{1.57, 7.654, 9.986};

        boolean [] Package = new boolean[]{true, false};

        //Task2

        int a = 0;
        for (; a < Box.length; a++) {
            if ( a == (Box.length - 1)) {
                System.out.print(Box[a]);
            } else {
                System.out.print(Box[a] + ", ");
            }
        }
        System.out.println();

        int b = 0;
        for (; b < Casket.length; b++) {
            if ( b == (Casket.length - 1)) {
                System.out.print(Casket[b]);
            } else {
                System.out.print(Casket[b] + ", ");
            }
        }
        System.out.println();

        int c = 0;
        for (; c < Package.length; c++) {
            if ( c == (Package.length - 1)) {
                System.out.print(Package[c]);
            } else {
                System.out.print(Package[c] + ", ");
            }
        }
        System.out.println();

        //Task3

        int i = Box.length - 1;
        for (; i >= 0; i--) {
            if (i == 0) {
                System.out.print(Box[i]);
            } else {
            System.out.print(Box[i] + ", ");
            }

        }
        System.out.println();

        int k = Casket.length - 1;
        for (; k >= 0; k--) {
            if (k == 0) {
                System.out.print(Casket[k]);
            } else {
                System.out.print(Casket[k] + ", ");
            }
        }
        System.out.println();

        int s = Package.length - 1;
        for (; s >= 0; s--) {
            if (s == 0) {
                System.out.print(Package[s]);
            } else {
                System.out.print(Package[s] + ", ");
            }
        }
        System.out.println( );


        //Task4
        int o = 0;
        for (; o < Box.length; o++) {
            if (Box[o] % 2 == 0) {
                System.out.print(Box[o] + " ");
            } else {
                System.out.print( (Box[o] + 1) + " ");
            }
        }
    }
}