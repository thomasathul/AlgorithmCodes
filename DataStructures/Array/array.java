import java.util.*;
public class array {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int numberofelements = sc.nextInt();
        int arr[]=new int[numberofelements];

        //input
        for(int i=0;i<numberofelements;i++)
        {
            arr[i]=sc.nextInt();
        }

        //display1
        for(int i=0;i<numberofelements;i++)
        {
            System.out.println(arr[i]);
        }

        //display2
        Arrays.stream(arr).forEach(e->System.out.print(e+" "));

        //display3
        System.out.println(Arrays.toString(arr));
    }
}
