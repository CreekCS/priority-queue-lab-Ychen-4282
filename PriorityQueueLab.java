import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.PriorityQueue;

public class PriorityQueueLab{
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); 
        File file = new File("RandIntegers.txt");
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                int i = scanner.nextInt();
                queue.add(i);
            }
            scanner.close();
        }catch(Exception e){
            System.out.println("Somthing wrong!");
        }
        while(!queue.isEmpty()){      
            System.out.println(queue);
            queue.remove();
        }
    }
}

