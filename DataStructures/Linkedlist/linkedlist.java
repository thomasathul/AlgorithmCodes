import java.util.*;
class linkedimplement {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
        }
      }
        
        public boolean isEmpty()
        {
            return this.head==null;
        }

        public void display(){
            Node temp=this.head;
            while(temp!=null)
            {
                System.out.print(temp.data+",");
                temp=temp.next;
            }
        }
        public void insertfirst(int data)
        {
           Node temp=new Node(data);
           temp.next=this.head;
           this.head=temp;
        }

        public void insertlast(int data)
        {
        	if(this.head==null)
        	{
        		insertfirst(data);
        		return;
        	}
        	Node temp=new Node(data);
        	Node n=this.head;
        	while(n.next!=null)
        	{
        		n=n.next;
        	}
        	n.next=temp;
        }
        public void insertat(int data,int idx)
        {
                if(idx<0)
                {
                	return;
                }
                if(idx==0)
                {
                	insertfirst(data);
                	return;
                }
                Node n=new Node(data);
                Node temp=this.head;
                for(int i=0;i<idx;i++)
                {
                	temp=temp.next;
                }
                Node forward= temp.next;
                temp.next=n;
                n.next=forward;
        }
    
        public int remove(){
          if(this.head==null)
          {
          	return -1;
          }
          int rem=this.head.data;
          this.head=this.head.next;
          return rem;
        }

        public int removeat(int idx){
            if(idx<0)
            {
            	return -1;
            }
            if(idx==0)
            {
            	return remove();
            }
            Node temp=this.head;
            for(int i=0;i<idx-1;i++)
            {
            	temp=temp.next;
            }
            int rem=temp.next.data;
            temp.next=temp.next.next;
            return rem;
        }

        public void reverse()
        {
        	Node prev=null;
        	Node curr=head;
        	Node next=null;
        	while(curr!=null)
        	{
        		next=curr.next;
        		curr.next=prev;
        		prev=curr;
        		curr=next;
        	}
        	head=prev;
        }

        public static void main(String[] args)
        {
            linkedimplement lt=new linkedimplement();
            lt.insertfirst(1);
            lt.insertfirst(2);
            lt.insertlast(3);
            lt.insertfirst(4);
            lt.insertfirst(8);
            lt.insertfirst(10);
            lt.insertat(6,2);
            lt.remove();
            lt.removeat(2);
            lt.reverse();
            lt.display();

        }
} 