
   public static void countsort(int a[])
    {
        int max=max(a);
        int min=min(a);
        int range=max+1;
        int count[]=new int[range];
        int output[]=new int[a.length+1];
        for (int i = 0; i < max; i++) 
        {
           count[i] = 0;
        }
       
        for(int i=0;i<a.length;i++)
        {
            count[a[i]]++;
        }
       
        for(int i=1;i<=max;i++)
        {
            count[i]+=count[i-1];
        }
         
        for(int i=a.length-1;i>=0;i--)
        {
            output[count[a[i]]-1]=a[i];
            count[a[i]]--;
        }
        
        for(int i=0;i<a.length;i++)
        {
            a[i]=output[i];
        }
        System.out.println(Arrays.toString(a));
    }
    public static int max(int a[])
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            max=Math.max(max,a[i]);
        }
        return max;
        
    }
    public static int min(int a[])
    {
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            min=Math.min(min,a[i]);
        }
        return min;
        
    }
    
}

