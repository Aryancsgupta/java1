import java.util.Scanner;
public class array_roated_by_90 {
    public static int [][] transope_arr(int arr[][],int n){
        for(int i =0 ;i<n;i++){
            for(int j = i;j<n;j++){
                int temp = arr[i][j]; //transope
                arr[i][j] = arr[j][i];
                arr[j][i]= temp;
            }
        }
    
        roteadarr(arr,n);
        return arr;
    }
    public static int [][] roteadarr(int [][] arr,int n){
        for(int i= 0;i<arr.length;i++){
            arr[i] = reversearr(arr[i]);  
        }
        return arr;
    }
    public static int [] reversearr(int [] matrix){
        int i =0, j = matrix.length-1;
        while(i<j){
            int temp = matrix[i];
            matrix[i] = matrix[j];   //reverse arr[i]
            matrix[j] = temp;
            i++;j--;
        }
        return matrix;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2d square size");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        arr= transope_arr(arr,n);
        System.out.print("final result");
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
