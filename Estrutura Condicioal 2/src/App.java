import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite a velocidadde aferida no radar: ");
        int velocidade = teclado.nextInt();

        if (velocidade >= 88 && velocidade <= 97){
            System.out.println("Infração média");
        } else if (velocidade >= 98 && velocidade <= 104){
            System.out.println("Infração grave");
        } else if (velocidade >= 105 && velocidade <= 500){
        System.out.println("Infração gravíssima");
        } else if (velocidade <= 39){
        System.out.println("Infração média, por transitar em velocidade inferior à mínima permitida");
        } else {
            System.out.println
            ("Velocidade incompatível");
        }
        teclado.close();
        }
    }