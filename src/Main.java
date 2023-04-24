import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner((System.in));
        ArrayList<String> list = new ArrayList<String>();

        for(int i = 0; i < 3; i++){
            list.add(reader.nextLine());
        }

        list.remove(2);

        for (int i = list.size()-1; i >= 0; i--){
            System.out.println(list.get(i));
        }

}
}