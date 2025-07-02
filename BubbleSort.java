import java.util.*;
class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements you want:");
        int n = sc.nextInt();
        int a[];
        a = new int[n];
        int i,j ,t;
        for(i=0;i<n;i++){
            System.out.println("Enter numbers");
            a[i] = sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-1-i;j++){
                t = a[j];
                a[j] = a[j+1];
                a[j+1]=t;
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i]+"  ");
        }
    }
}