import java.util.Scanner;
public class selection_sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
// input
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //logic
        for(int i =0 ;i<n;i++){
            int smallest = i;
            for(int j= i+1;j<n;j++){
                if(arr[smallest] >arr[j]){
                    smallest = j;
                }
            }
            int tem = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = tem;
        }
         //print
         for(int i =0;i<n;i++){
                System.out.print(arr[i] + " ");
         }

    }   
}
