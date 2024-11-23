import java.util.Scanner;
public class spiral_matrix {
    static void printSpiralOrder(int[][] matrix,int r,int c){
        int toprow = 0, bottomrow = r-1,leftcol = 0,rightcol = c-1;
        int totalelement=0;
        while(totalelement < r*c){
            //toprow print
            for(int j = leftcol;j<=rightcol;j++){
                if(totalelement < r*c){
                    System.out.print(matrix[toprow][j]+" ");
                }
                totalelement++;
            }
            toprow++;
            //rightcol
            for(int i = toprow;i<=bottomrow;i++){
                if(totalelement < r*c){
                    System.out.print(matrix[i][rightcol]+" ");
                }
                totalelement++;
            }
            rightcol--;
            //botom row riht to left
            for(int j =rightcol;j>=leftcol;j--){
                if(totalelement < r*c){
                    System.out.print(matrix[bottomrow][j]+" ");
                }
                totalelement++;
            }
            bottomrow--;
            //left col down to up
            for(int i =bottomrow;i>=toprow;i--){
                if(totalelement < r*c){
                    System.out.print(matrix[i][leftcol]+" ");
                }
                totalelement++;
            }
            leftcol++;

        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of rows and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("enter the vakue of matrix");
        for(int i =0 ;i<r;i++){
            for(int j =0 ;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        printSpiralOrder(matrix,r,c);
    }
}
