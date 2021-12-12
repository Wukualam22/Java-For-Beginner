package mr.cloud;
import java.util.Scanner;
public class Elseif
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int nim;
        String nama;
        System.out.println("Masukkan Nama Anda ; ");
        nama = input.nextLine();
        System.out.println("Masukkan NIM Anda ; ");
        nim = input.nextInt();
        System.out.println("Berapakah Hasil 1 + 1?");
        System.out.println("A.2\nB.3\nC.4");
        char jawaban = input.next().charAt(0);
        if (jawaban =='A')
        {
            System.out.println("Jawaban Anda Benar Bingits!");
        }
        else if (jawaban =='B')
        {
            System.out.println("Jawaban Anda Salah!");
        }
        else if (jawaban =='C')
        {
            System.out.println("Jawaban Anda Salah!");
        }
    }
    
}
