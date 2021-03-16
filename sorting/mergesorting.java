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
public class mergesorting {
     public static void main(String args[])
      {
          mergesort(new int[] {5,7,2,8,3,6,7});
      }
      public static void mergesort(int[] A)
      {
          divconq(A,0,A.length-1);
          System.out.println(Arrays.toString(A));
      }
      public static void divconq(int[] A, int l, int r)
      {
          if(l<r){
          int mid=l+(r-l)/2;
          divconq(A,l,mid);
          divconq(A,mid+1,r);
          merge(A,l,mid,r);
          }
      }
      public static void merge(int[] A,int l, int m, int r)
      {
          int[] sorarray=new int[r-l+1];
          int i=l, j=m+1, k=0;
          for(k=0;j<=r && k<sorarray.length && i<=m ;k++)
          {
              if(A[i]<=A[j])
                  sorarray[k]=A[i++];
              else
                  sorarray[k]=A[j++];
          }
          while(i<=m)
          {
              sorarray[k++]=A[i++];
          }
          while(j<=r)
          {
              sorarray[k++]=A[j++];
          
          }
          k=0;
          for(i=l;i<=r;i++)
          {
              A[i]=sorarray[k++];
          }
      }
}
