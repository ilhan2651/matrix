import java.util.Random;

public class matrix {
    public static void main(String[] args) {
        System.out.println( " ^^^^^^^^^^Matrix Operations^^^^^^^^^^ " );

        Random rnd = new Random();
        int[][] array = new int[4][4];
        System.out.println( "FİRST MATRİX:" );

        for (int i = 0; i < array.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 1+rnd.nextInt(30);
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.print(" ");
            System.out.println();
        }
        System.out.println( "^^^^^^^^^^^^^^^^^^^^" );
        System.out.println( " Transpose of first matrix: " );

        int[][] trsps = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < array.length; j++) {
                trsps[i][j] = array[j][i];
                System.out.print( " " + trsps[i][j] + " " );
            }
            System.out.print(" ");
            System.out.println();
        }
        System.out.println( "^^^^^^^^^^^^^^^^^^^^" );
        Random rnd2 = new Random();
        int[][] array2 = new int[4][4];
        System.out.println( "SECOND MATRİX:" );
        for (int i = 0; i < array2.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < array2.length; j++) {
                array2[i][j] = 1 + rnd2.nextInt(30);
                System.out.print(" " + array2[i][j] + " ");
            }
            System.out.print(" ");
            System.out.println();
        }
        System.out.println( "^^^^^^^^^^^^^^^^^^^^" );
        System.out.println("Transpose of second Matrix:");
        int[][] trsps2 = new int[4][4];
        for (int i = 0; i < array2.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < array2.length; j++) {
                trsps2[i][j] = array2[j][i];
                System.out.print(" " + trsps2[i][j] + " ");
            }
            System.out.print(" ");
            System.out.println();
        }
            System.out.println( "^^^^^^^^^^^^^^^^^^^^" );

            System.out.println( " Summation :" );
            int[][] sum = new int[4][4];
            for( int i = 0 ; i<array.length ; i++ ){
                System.out.print(" ");
                for( int j = 0 ; j<array.length ; j++ ){
                    sum[i][j] = array[i][j]+array2[i][j];
                    System.out.print( " " + sum[i][j] + " " );
                }
                System.out.print(" ");
                System.out.println();
            }
            System.out.println( "^^^^^^^^^^^^^^^^^^" );

            System.out.println(" Subtraction:");
            int[][] sub = new int[4][4];
            for( int i = 0 ; i <array.length ; i++ ) {
                System.out.print(" ");
                for(int j=0;j<array.length;j++){
                    sub[i][j] = array[i][j]-array2[i][j];
                    System.out.print(" " + sub[i][j] + " ");
                }
                System.out.print(" ");
                System.out.println();
            }
            System.out.println( "^^^^^^^^^^^^^^^^^^^^" );

            System.out.println( "Multiplication:" );
            int[][] multi = new int[4][4];
            for( int i = 0 ; i<array.length ; i++ ){
                System.out.print(" ");
                for( int j = 0;  j<array.length ; j++ ){
                    multi[i][j]=0;
                    for(int k = 0 ; k<array.length ; k++ ){
                        multi[i][j]+=array[i][k]*array2[k][j];
                    }
                    System.out.print(" " + multi[i][j] + " ");
                }
                System.out.print(" ");
                System.out.println();
            }
            System.out.println( "^^^^^^^^^^^^^^^^^^^^" );
        }

    }

