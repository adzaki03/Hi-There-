import java.util.Scanner;
class Hallo {
    public static void main(String[] args) {
        System.out.println("Hallo Namaku Ahmad Dzaki ");
        Scanner NamaMu = new Scanner(System.in);
        String namamu;
        System.out.print("Siapa Nama mu ? ");
        namamu = NamaMu.nextLine();
        System.out.println("Hallo "+namamu);

        System.out.println("Umurku 19 tahun");
        Scanner UmurMu = new Scanner(System.in);
        String umurmu;
        System.out.print("Umur kamu berapa ? ");
        umurmu = UmurMu.nextLine();
        System.out.println("Salam kenal ");
    }
}

