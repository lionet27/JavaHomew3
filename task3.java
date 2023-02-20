// 3)(Дополнительное) Реализовать алгоритм сортировки массива слиянием (Дополнительное)
import java.util.ArrayList;
import java.util.Random;

public class task3{
    public static void RandFillList(int count, int maxValue, ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) list.add(rand.nextInt(maxValue));
    }

    public static ArrayList<Integer> MergeTwoSortArray(ArrayList<Integer> firstlist,ArrayList<Integer> secondlist ){
        ArrayList<Integer> twolist=new ArrayList<Integer>();
        int f=0;
        int s=0;
        for (int i=0;i<(firstlist.size()+secondlist.size());i++){
           if (f<firstlist.size() & s<secondlist.size()){
                if (firstlist.get(f)<secondlist.get(s)){
                    twolist.add(firstlist.get(f));
                    f++;            
                }
                else{
                    twolist.add(secondlist.get(s));
                    s++;
                }
               
            }
            else if (f<firstlist.size()) {
                twolist.add(firstlist.get(f));
                    f++;   
            } else {
                twolist.add(secondlist.get(s));
                s++;               
            }
        } 
        return twolist;
    }

    public static ArrayList<Integer> SortMergе(ArrayList<Integer> list){
                
        if (list.size()<2){
            return list;
        }    
        int middle = (list.size()-1) / 2;
        ArrayList<Integer> firstlist=new ArrayList<Integer>();
        for (int i=0;i<(middle+1);i++) firstlist.add(list.get(i));
        
        ArrayList<Integer> secondlist=new ArrayList<Integer>();
        for (int i=(middle+1);i<(list.size());i++) secondlist.add(list.get(i));
        
        return MergeTwoSortArray(SortMergе(firstlist), SortMergе(secondlist));
        
    }


    public static void main(String[] args) {
        ArrayList<Integer> mylist=new ArrayList<Integer>();
        RandFillList(20,30, mylist);
        System.out.println(mylist);
        
        ArrayList<Integer> sortlist=SortMergе(mylist);
        System.out.println(sortlist);

    }    

}
