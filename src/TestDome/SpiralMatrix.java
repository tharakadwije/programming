package TestDome;

//SpiralMatrix
public class SpiralMatrix {

    public static void main(String args[]) {

        int spiralArray[][] = new int[4][4];

        spiralArray[0][0] = 1;
        spiralArray[0][1] = 2;
        spiralArray[0][2] = 3;
        spiralArray[0][3] = 4;
        spiralArray[1][0] = 5;
        spiralArray[1][1] = 6;
        spiralArray[1][2] = 7;
        spiralArray[1][3] = 8;
        spiralArray[2][0] = 9;
        spiralArray[2][1] = 10;
        spiralArray[2][2] = 11;
        spiralArray[2][3] = 12;
        spiralArray[3][0] = 13;
        spiralArray[3][1] = 14;
        spiralArray[3][2] = 15;
        spiralArray[3][3] = 16;

        new SpiralMatrix().printSprin(spiralArray);
    }

    public void printSprin(int [][] spiralArray){

        int firstRow = 0;
        int lastRow = spiralArray.length-1;
        int firstCol = 0;
        int lastCol = spiralArray[0].length-1;

        while(firstRow<lastRow && firstCol<lastCol){

            for (int x = firstRow; x<=lastCol; x++){
                System.out.println(spiralArray[firstRow][x]);
            }

            for (int x=firstRow+1; x<=lastRow; x++){
                System.out.println(spiralArray[x][lastCol]);
            }

            for (int x=lastCol-1; x >= firstCol; x--){
                System.out.println(spiralArray[lastRow][x]);
            }

            for (int x=lastRow-1; x > firstRow; x--){
                System.out.println(spiralArray[x][firstCol]);
            }

            firstRow++;
            lastRow--;
            firstCol++;
            lastCol--;

        }

    }


//    public void printSprin(int [][] spiralArray){
//
//        int firstRow = 0;
//        int lastRow = spiralArray.length -1;
//        int firstCol = 0;
//        int lastCol = spiralArray[0].length -1;
//
//        while (firstRow<lastRow && firstCol<lastCol){
//
//            for (int x = firstCol; x<=lastCol; x++){
//                System.out.println(spiralArray[firstRow][x]);
//            }
//
//            for (int x=firstRow+1; x<=lastRow; x++){
//                System.out.println(spiralArray[x][lastCol]);
//            }
//
//            for (int x=lastCol-1; x>=firstCol; x--){
//                System.out.println(spiralArray[lastRow][x]);
//            }
//
//            for (int x=lastRow-1; x>firstRow; x--){
//                System.out.println(spiralArray[x][firstCol]);
//            }
//
//
//            firstRow++;
//            lastRow--;
//            firstCol++;
//            lastCol--;
//
//
//
//        }
//
//    }
}
