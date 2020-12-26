import java.util.Scanner;

public class CalculateChar {
    private static void PrintTitle(String msg){
        System.out.println(msg);
    }

    private static int HitungKata(int lengthWord, char[] textToChar, String myText, char inputChar){
        int jumlahHitung = 0;
        for(int x = 0 ; x < lengthWord;x++){
            textToChar[x] = myText.charAt(x);
            if (textToChar[x] == inputChar) {
                jumlahHitung++;
            }
        }
        return jumlahHitung;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Text = ");
        String kalimat = sc.nextLine();

        System.out.print("Masukkan Huruf Yang Akan Dihitung Jumlahnya = ");
        char karakter = sc.next().charAt(0);

        int panjangKalimat = kalimat.length();
        char[] kalimatToChar = new char[panjangKalimat];

        int jumlahKata = CalculateChar.HitungKata(panjangKalimat,kalimatToChar,kalimat,karakter);

        System.out.println("Total Jumlah huruf " + karakter + " dalam kalimat " + kalimat + " adalah = " + jumlahKata);
    }
}
