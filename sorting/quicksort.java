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
public class quicksort {
    public static void main(String[] args)
    {
          tosort(new int[] {4,7,2,8,4,9,2,8});
    }
    public static void tosort(int A[])
    {
        int low=0;
        int high=A.length-1;
        quicksort(A,low,high);
        System.out.println(Arrays.toString(A));
    }
    public static void quicksort(int[] A, int low,int high)
    {
          if(low<high)
          {
             int p=lomuto(A,low,high);
             quicksort(A,low,p-1);
             quicksort(A,p+1,high);
        
          }
    }
    public static int lomuto(int A[],int l,int h)
    {
        int pivot=A[h];
        int i=l;
        for(int j=l;j<h;j++)
        {
            if(A[j]<pivot)
            {
                swap(A,i,j);
                i++;
            }
            
        }
        swap(A,i,h);
        
        return i;
    }
    public static void swap(int[] A, int i,int j)
    {
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
    
}
