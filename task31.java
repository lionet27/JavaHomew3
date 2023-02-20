
import java.util.Random;

public class task31{
    public static void RandFillArray(int maxValue,int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) array[i]=(rand.nextInt(maxValue));
    }

    public static int[] MergeTwoSortArray(int[] firstlist,int[] secondlist ){
        int[] twolist=new int[firstlist.length+secondlist.length];
        int f=0;
        int s=0;
        for (int i=0;i<twolist.length;i++){
           if (f<firstlist.length & s<secondlist.length){
                if (firstlist[f]<secondlist[s]){
                    twolist[i]=firstlist[f];
                    f++;            
                }
                else{
                    twolist[i]=secondlist[s];
                    s++;
                }
               
            }
            else if (f<firstlist.length) {
                twolist[i]=firstlist[f];
                    f++;   
            } else {
                twolist[i]=secondlist[s];
                s++;
            }
        } 
        return twolist;
    }

    public static int[] SortMergе(int[] list){
                
        if (list.length<2){
            return list;
        }    
        int middle = (list.length-1) / 2;
        int[] firstlist=new int[middle+1];
        for (int i=0;i<firstlist.length;i++) firstlist[i]=list[i];
        
        int[] secondlist=new int[list.length-middle-1];
        int j=0;
        for (int i=(middle+1);i<list.length;i++){
             secondlist[j]=list[i];
             j++;
        }
        
        return MergeTwoSortArray(SortMergе(firstlist), SortMergе(secondlist));
        
    }


    public static void main(String[] args) {
        int[] myarray=new int[10];
        RandFillArray(30, myarray);
        for (int i=0;i<myarray.length;i++) System.out.print(myarray[i]+" ");
        
        System.out.println();
        int[] sortlist=SortMergе(myarray);
        for (int i=0;i<sortlist.length;i++) System.out.print(sortlist[i]+" ");
        // System.out.println(sortlist);

    }    

}
