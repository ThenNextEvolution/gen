import java.util.*;
//import java.lang.
public class Main {
    static void sort(int[] array, int lowindex, int highIndex){
    if(lowindex>=highIndex){
        return;
    }

    int pivot = array[highIndex];
    int leftp = lowindex;
    int rightp =highIndex;

    //sort the array each run
    while(leftp<rightp){
        while (array[leftp]<= pivot && leftp<rightp){
            leftp++;
        }
        while (array[rightp]>= pivot && leftp<rightp){
            rightp--;
        }

        swap(array, leftp,rightp);

    }

    //swap the pivot with the meet index
    swap(array, leftp, highIndex);

    //sort left side
    sort(array,lowindex,leftp-1);

    //sort right side
    sort(array,leftp,highIndex);
    }

    private static void swap(int[] array,int index1, int index2){
    int temp = array[index1];
    array[index1] =array[index2];
    array[index2]=temp;

    }
    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[10000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10000000);
        }
        /*int[]  ro=new int[7];
        ro[0]=1;
        ro[1]=2;
        ro[2]=3;
        ro[3]=5;
        ro[4]=2;
        ro[5]=4;
        ro[6]=0;*/

       // System.out.println(Arrays.toString(arr));
        //for (int i = 0; i < 6; i++) {


        long start = System.nanoTime();
        sort(arr,0,arr.length-1);
       // System.out.print(Arrays.toString(arr));
        long end = System.nanoTime();
        long time = end - start;
        System.out.println("the quicksort took "+ time +" nanoseconds to sort");}


   // }
}