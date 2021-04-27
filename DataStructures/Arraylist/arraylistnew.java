import java.util.ArrayList;

class arraylistnew{
    public static void main(String args[]){
        ArrayList <Integer> ar=new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.remove(2);
        System.out.println(ar.get(2));
    }
}