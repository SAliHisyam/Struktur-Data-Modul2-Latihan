package modul2semester4latihan;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class Modul2Semester4Latihan {

    public static void main(String[] args) {
        List<String> animal = Arrays.asList("Sapi", "Kelinci", "Kambing", "Unta", "Domba");
        
        ArrayList<String> objek = new ArrayList<>();
        
        output1(objek,animal);
        output2(objek);
        
    }
    public static void output1(ArrayList<String> objek, List<String> animal) {      
        objek.addAll(animal);     
        System.out.println("Hewan:\n" + objek.toString());
    }
    public static void output2(ArrayList<String> objek) {
        System.out.println("Hewan yang dihapus : ");
        System.out.println("" +objek.get(1) +objek.get(2) +objek.get(3));
        System.out.println();
        objek.remove(1);
        objek.remove(2);
        objek.remove(1);
        System.out.println("Output:\n" + objek.toString());
        System.out.println();
    }
}
