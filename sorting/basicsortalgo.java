
   //Bubble Sort
   public static void bubblesort(int arr[])
   {
   for(int i=0;i<arr.length-1;i++)
       {
           for(int j=0;j<arr.length-i-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   int temp=arr[j+1];
                      arr[j+1]=arr[j];
                      arr[j]=temp;
               }
           }
       }
       System.out.println(Arrays.toString(arr));
}
//Insertion Sort   
   public static void insertionsort(int arr[])
   {
       for(int i=1;i<arr.length;i++)
       {
           int key=arr[i];
           int j=i-1;
           while(j>=0 && arr[j]>key)
           {
               arr[j+1]=arr[j];
                       j--;
           }
           arr[j+1]=key;
           
       }
       System.out.println(Arrays.toString(arr));
   }
 //Selection Sort  
   public static void selectionsort(int arr[])
   {
       for(int i=0;i<arr.length;i++)
       {
           int minind=i;
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[j]<arr[minind])
               {
                   minind=j;
               }
           }
           if(minind!=i)
           {
               int temp=arr[minind];
               arr[minind]=arr[i];
               arr[i]=temp;
           }
       }
       System.out.println(Arrays.toString(arr));
   }
}
