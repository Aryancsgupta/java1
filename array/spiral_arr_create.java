import java.util.Scanner;
public class spiral_arr_create {
    public static void createArray(int[][] matrix,int n){
        int top_row = 0,bottom_row = n-1,left_col = 0,right_col = n-1;
        int element = 1;
        int total_element = 0;
        while(total_element < n*n){
            //top_row 
            for(int j = left_col;j<=right_col;j++){
                if(total_element < n*n){
                    matrix[top_row][j] = element++;
                    total_element++;
                }
            }
            top_row++;
            //right_col
            for(int i = top_row;i<=bottom_row;i++){
                if(total_element < n*n){
                    matrix[i][right_col] = element++;
                    total_element++;
                }
            }
            right_col--;
            //bottom row -> right to left
            for(int j = right_col;j>=left_col;j--){
                if(total_element < n*n){
                    matrix[bottom_row][j] =element++;
                    total_element++;
                }
            }
            bottom_row--;
            // left_ col->bottom to up 
            for(int i = bottom_row;i>=top_row;i--){
                if(total_element < n*n){
                    matrix[i][left_col] = element++;
                    total_element++;
                }
            }
            left_col++;
        }
    }
    public static void printArray(int [][] matrix,int n){
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array row size");
        int n = sc.nextInt();
        int [][] matrix = new int [n][n];
        createArray(matrix,n);
        printArray(matrix,n);
    }
}
