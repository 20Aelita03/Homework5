public class Main {
    public static void main(String[] args) {
        //Task 1

        int [] box = new int[3];
        box [0] = 1;
        box [1] = 2;
        box [2] = 3;

        double [] casket = new double[]{1.57, 7.654, 9.986};

        boolean [] paackage = new boolean[]{true, false};

        //Task2


        for (int a = 0; a < box.length; a++) {
            if ( a == (box.length - 1)) {
                System.out.print(box[a]);
            } else {
                System.out.print(box[a] + ", ");
            }
        }
        System.out.println();


        for (int b = 0; b < casket.length; b++) {
            if ( b == (casket.length - 1)) {
                System.out.print(casket[b]);
            } else {
                System.out.print(casket[b] + ", ");
            }
        }
        System.out.println();

        for (int c = 0; c < paackage.length; c++) {
            if ( c == (paackage.length - 1)) {
                System.out.print(paackage[c]);
            } else {
                System.out.print(paackage[c] + ", ");
            }
        }
        System.out.println();

        //Task3


        for (int i = box.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(box[i]);
            } else {
            System.out.print(box[i] + ", ");
            }

        }
        System.out.println();


        for (int k = casket.length - 1; k >= 0; k--) {
            if (k == 0) {
                System.out.print(casket[k]);
            } else {
                System.out.print(casket[k] + ", ");
            }
        }
        System.out.println();


        for (int s = paackage.length - 1; s >= 0; s--) {
            if (s == 0) {
                System.out.print(paackage[s]);
            } else {
                System.out.print(paackage[s] + ", ");
            }
        }
        System.out.println( );


        //Task4

        for (int o = 0; o < box.length; o++) {
            if (box[o] % 2 != 0) {
                box[o] += 1;
                System.out.print(box[o] );
            } else {
                System.out.print( box[o] );
            }
        }
    }
}