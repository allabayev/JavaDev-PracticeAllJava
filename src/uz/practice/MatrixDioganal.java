package uz.practice;

public class MatrixDioganal {
    public static void main(String[] args) {
        int [][] myMatrix={{1, 22, 11, 2},
                           {37, 4, 5, 44},
                           {87, 6, 7, 64},
                           {7, 92, 77, 3} };
        System.out.println("diagonal numbers: sum, multiplication and substitution to 0");
        int i, j, t, f, summa=0, multiplication=1;
        for (i=0; i<myMatrix.length; i++) {
            for (j=0; j<myMatrix[i].length; j++) {
                if (i==j || i+j == myMatrix.length -1) {
                    summa += myMatrix[i][j];
                    multiplication *=myMatrix[i][j];
                    myMatrix[i][j]=0;
                }
            }
        }
        System.out.println("the sum of the numbers on the diagonal\n" + summa);
        System.out.println("multiplication of numbers on the diagonal\n" + multiplication);
        for (t=0; t<myMatrix.length; t++) {
            for (f = 0; f < myMatrix[t].length; f++) {
                System.out.print(myMatrix[f][t] + " ");
            }
            System.out.println();
        }
    }
}