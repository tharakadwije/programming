public class Algo {

    public static void main(String args[]){

        int arr [][] = new int[2][2];

        arr[0][0] = 10;
        arr[0][1] = 12;
        arr[1][0] = 8;
        arr[1][1] = 18;

        for (int[] i : arr) {
            for (int x : i) {
                System.out.print(x +"\t");
            }
            System.out.println("\n");
        }

    }
}
