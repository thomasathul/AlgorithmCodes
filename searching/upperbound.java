public class upperbound{
    public static void main(String args[])
    {
        int a[]={1,2,3,3,4,4,4,4,4,5,5,5,6,6};
        int x=3;
        System.out.println(upperboundfunc(a,x));
    }
    public static int upperboundfunc(int[] a,int x)
    {
        int l=0,r=a.length-1;
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(a[mid]<=x)
            l=mid+1;
            else
            r=mid;
        }
        return r+1;
    }
}