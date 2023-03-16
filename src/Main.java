import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int anos;
        int anoTotal;
        int meses;
        int mesesTotal;
        int dias;
        int diasTotais;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantos anos a pessoa tem");
        anos = s.nextInt();
        System.out.println("Digite quantos meses a pessoa tem");
        meses = s.nextInt();
        System.out.println("Digite quantos dias a pessoa tem");
        dias = s.nextInt();
        anoTotal = anos * 365;
        mesesTotal = meses * 30;
        diasTotais = anoTotal + mesesTotal + dias;
        System.out.println("O tota de dias é " +diasTotais);
    }
}