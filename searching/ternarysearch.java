 class ternarysearch
 {
    public static void main(String[] args)
    {
        System.out.println(ternarySearch(new int[]{1,3,5,6,8,9,10,11,12},6));
    }

    public static int ternarySearch(int a[],int key)
    {
        int l=0,r=a.length;
        if(r>=l)
        {
           int mid1=(l+(r-l))/3;
           int mid2=(r-(r-l))/3;
           if(a[mid1]==key)
           return mid1+1;
           if(a[mid2]==key)
           return mid2+1;
           if(key<mid1)
           {
               r=mid1-1;
           }
           else if(key>mid2)
           {
               l=mid2+1;
           }
           else
           {
               l=mid1+1;
               r=mid2-1;
           }
        }
        return -1;
    }
}