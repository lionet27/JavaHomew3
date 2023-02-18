// 1) Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class task1{
    public static void RandFillList(int count, int maxValue, ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) list.add(rand.nextInt(maxValue));
    }

    
    public static void DelEvenNum(ArrayList<Integer> list){
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i)%2==0) {
               list.remove(i);
               i--;
            }
        }      
    }

    public static void IterDelEvenNum(ArrayList<Integer> list){
        Iterator<Integer> col=list.iterator();
        while (col.hasNext()) {
            Integer numNext = col.next();
            if (numNext%2==0) col.remove();
        }
    }    
        
    public static void main(String[] args) {
        ArrayList<Integer> newlist=new ArrayList<Integer>();
        RandFillList(10, 30, newlist);
        System.out.println(newlist);
        //Удаление четных чисел обычным перебором.
        // DelEvenNum(newlist);

        //Удаление четных чисел с помощью итератора.
        IterDelEvenNum(newlist);        
     
        System.out.println(newlist);        
    }

}        


