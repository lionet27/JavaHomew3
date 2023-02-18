// 2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка
import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void RandFillList(int count, int maxValue, ArrayList<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < count; i++) list.add(rand.nextInt(maxValue));
    }

    public static Integer MinFind(ArrayList<Integer> list){
        Integer min=list.get(0);
        for (int i = 1; i < list.size() ; i++) {
            if (list.get(i)<min) min=list.get(i);            
        }    
        return min;
    }
    public static Integer MaxFind(ArrayList<Integer> list){
        Integer max=list.get(0);
        for (int i = 1; i < list.size() ; i++) {
            if (list.get(i)>max) max=list.get(i);            
        }    
        return max;
    }
    public static double AverageFind(ArrayList<Integer> list){
        int sum = list.stream().mapToInt(Integer::valueOf).sum();
        double average=(double)sum/list.size();
        return average;
    }    


    public static void main(String[] args) {
        ArrayList<Integer> newlist=new ArrayList<Integer>();
        RandFillList(6, 10, newlist);
        System.out.println(newlist);
        Integer min=MinFind(newlist);
        System.out.println("Минимальное значение в списке: " + min);
        Integer max=MaxFind(newlist);
        System.out.println("Максимальное значение в списке: "+ max);
 
        double average=AverageFind(newlist);
        System.out.println("Среднее арифметическое списка: "+String.format("%.2f", average));
    }    


}
