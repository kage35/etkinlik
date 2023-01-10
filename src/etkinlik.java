import java.util.Scanner;
public class etkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input=new Scanner(System.in);
        System.out.println("hava kaç derece");
        sicaklik=input.nextInt();

        if (sicaklik<5){System.out.println("Kayak yapabilirsiniz");}
        if (sicaklik>=5 && sicaklik<15){System.out.println("sinema yapabilirsiniz");}
        if (sicaklik>=15 && sicaklik<25){System.out.println("piknik yapabilirsiniz");}
        if (sicaklik>=25){System.out.println("yüzme yapabilirsiniz");}
    }
}