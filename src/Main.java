import com.dio.iphone.interfaces.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        String numberphone;
        String nameMusic;
        boolean finishMyIphone = true;
        Scanner sc = new Scanner(System.in);
        Iphone myIphone = new Iphone("Iphone", 86);
        System.out.println(myIphone.getModel() + " Nivel Bateria: " + myIphone.getBatteryLevel());
        System.out.println("Digite 1 para ligar");
        System.out.println("Digite 2 para ouvir musica");
        System.out.println("Digite 3 para abrir o browser");
        System.out.println("Digite 4 para fechar a tela");
        option = sc.nextInt();
        sc.nextLine();
        do {
            if (option == 1) {
                System.out.print("Número do Telefone: ");
                numberphone = sc.nextLine();
                myIphone.makeCall(numberphone);
            } else if (option == 2) {
                myIphone.playMusic("Jazz Blues Music");
            } else if (option == 3) {
                myIphone.accessWebsite("www.uol.com.br");
            } else if (option == 4) {
                finishMyIphone = false;
            }
            if(finishMyIphone) {
                System.out.println("Escolha uma nova opção: ");
                option = sc.nextInt();
            }
        } while (finishMyIphone);
        sc.close();
    }
}