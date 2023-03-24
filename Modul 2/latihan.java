import java.util.ArrayList;

public class latihan {
    public static void main(String[] args) {
        
        ArrayList<String> Hewan = new ArrayList<String>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan : \n" + Hewan);

        ArrayList<String> DeleteHewan = new ArrayList<String>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        System.out.println("Hewan yang dihapus : \n" + DeleteHewan);

        for (String warna : DeleteHewan) {
            while (Hewan.contains(warna)) {
                Hewan.remove(warna);
            }
        }

        System.out.println("Output Hewan : \n" + Hewan);
    }
}
