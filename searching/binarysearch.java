/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.searching;
/**
 *
 * @author Dell
 */
public class binarysearch {
    public static void main(String args[])
    {
        System.out.println(binarysearch(new int[] {1,2,3,4,5,6,7,8},7));
    }
    public static int binarysearch(int[] a,int x)
    {
        int l=0;
        int r=a.length;
        while(l<=r)
        {
            int mid=(l+(r-l))/2;
            if(mid==x)
                return mid;
            else if(mid>x)
                r=mid-1;
            else
                l=mid+1;
            
        }
        return -1;
    }
}
