import java.util.ArrayList;

public class BasicJava {
    
    public void print() {
        int i = 0;
        for(i = 0; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void printOdd() {
        int i = 0;
        for(i = 0; i <= 255; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public int sigma() {
        int i = 0;
        int sum = 0;
        for(i = 0; i <= 255; i++) {
            sum += i;
        }
        return sum;    
    }

    public void iterateArray(int[] array) {
        int i = 0;
        for(i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        } 
    }

    public void findMax(int[] array) {
        int maxValue = array[0];
        int i = 0;
        for(i = 1; i < array.length; i++) {
            if(array[i] > maxValue) {
                maxValue = array[i];
                
            }
        }
        System.out.println("Max value is:" + maxValue);
    }

    public ArrayList<Integer> oddNumbers() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        int i = 0;
        for(i = 0; i < 255; i++) {
            if (i % 2 == 1) {
                y.add(i);
                
            }
        }
        return y;
    }


}

