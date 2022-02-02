import java.util.Scanner;

/**
 * Created by students on 27/01/22.
 */
public class TestList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer>myList= new SinglyLinkedList<>();
        Scanner in= new Scanner(System.in);
        System.out.println("input elements");
        for (int i = 0; i < 5; i++) {
            myList.addFrist(in.nextInt());

        }
        while (!myList.isEmpty())
        {
            System.out.print(myList.removeFirst()+"\t");
        }
    }
}
