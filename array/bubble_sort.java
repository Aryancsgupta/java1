import java.util.Scanner;
class bubble_sort{
    public  static void main(String args[]){
        //input from  5 to 10
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
//           logic from 12 to 20
        for(int i = 0;i<n;i++){
            for(int j =0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        // print/ from 
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}