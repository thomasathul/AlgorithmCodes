class arraylistimplement{

          private static final int size_fact=1;
          private int data[];
          private int index;
          private int size;

          public arraylistimplement() {
              this.data=new int[size_fact];
              this.size=size_fact;
          }

          public void add(int val) {
              if (index == this.size-1 ) {
                  increaseArrayList();
                  this.size*=2;
              }
              data[this.index] = val;
              this.index++;
             
          }

          public void increaseArrayList() {
              int newarr[] = new int[this.size * 2];
              for (int i = 0; i < this.size-1; i++) {
                  newarr[i] = data[i];
              }
              this.data = newarr;
          }
        
         
        

         public int get(int i)
         {
             if(i>this.index-1 || i<0)
             {
                 return -1;
             }
             return this.data[i];
         }

         public void remove(int i){
             if(i>this.index-1|| i<0)
             {
                 return;
             }


             for(int x=i;x < this.data.length-1;x++)
             {
                   data[x]=data[x+1];
             }

             this.index--;
         }

         public static void main(String args[])
         {
             arraylistimplement ar=new arraylistimplement();
             ar.add(0);
             ar.add(4);
             ar.add(3);
             ar.add(10);
             ar.add(2);
             ar.add(20);
             ar.add(21);
             ar.add(34);
             System.out.println(ar.get(6));
         }

}
