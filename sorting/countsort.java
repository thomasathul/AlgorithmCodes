/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sorting;

import java.util.*;

/**
 *
 * @author Dell
 */
public class countsort {
    public static void main(String[] args)
    {
        countsort(new int[] {1,4,5,6,4,3,6,4,6,4,8,5,8,2,4,7,9,3,5,7,2,1,5,7,8,4,2,5,7,8,3,2,1,4,7,9,3,3,1,5,7,10,4,2,4,6,2,6,8,3,1,5,8,4,8,10});
        
    }
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

