import java.util.Scanner;
public class FindMaxTwoArr {
    public static void DisplayArr(int[][]arr){
        for (int i = 0; i<arr.length;i++){
            System.out.println();
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
        }

    }
    public static int[][] creadArray (int row ,int colum){
        int [][] arr = new int[row][colum];
        for (int i = 0;i<row;i++){
            for (int j=0;j<colum;j++){
                arr[i][j]=(int)(Math.random()*10+9);
            }
        }
        return arr;
    }
    public static int findMaxArr(int [][] arr){
        int max = arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = sc.nextInt();
        System.out.println("Enter colum: ");
        int colum = sc.nextInt();
        int [][]array = creadArray(row,colum);

        DisplayArr(array);
        int max = findMaxArr(array);
        System.out.println("Max is: "+max);
    }

}
