import java.util.Scanner;

public class CyclicSort {
    public static void cyclic(int a[]){
        int i=0;
        while(i<a.length){
            int correct=a[i]-1;
            if(a[correct]!=a[i]){
                //swap
                int temp=a[i];
                a[i]=a[correct];
                a[correct]=temp;
            }
            else{
                i++;
            }

        }
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }
    }

    public static void main(String[] args) {
      //  int arr[]={5,4,3,2,1};


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Size: ");
        int size = sc.nextInt();
        int[] arr= new int[size];///Size=3
        System.out.print("enter the element: ");
        for (int i = 0; i < size; i++) {
           arr[i] = sc.nextInt();
        }
        cyclic(arr);



    }

}
