import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        Scanner inserir = new Scanner(System.in);
        String nome = "";
        int eXP = 0;
        String classificação = "";
        
        System.out.println("insira o nome do personagem");
        nome = inserir.nextLine();
        System.out.println("Perfeito!");
        System.out.println("insira a EXP do personagem");
        eXP = inserir.nextInt();
        System.out.println("Ótimo!");
        
        if (eXP < 1000 && eXP >= 0) {
            classificação = "Ferro";
            }
            else if (eXP >= 1001 && eXP <= 2000) {
            classificação = "Bronze";
        }
            else if (eXP >= 2001 && eXP <= 5000) {
            classificação = "Prata";
        }
            else if (eXP >= 5001 && eXP <= 7000) {
            classificação = "Ouro";
        }
            else if (eXP >= 7001 && eXP <= 8000) {
            classificação = "Platina";
        }
            else if (eXP >= 8001 && eXP <= 9000) {
            classificação = "Ascendente";
        }
            else if (eXP >= 9001 && eXP <= 10000) {
            classificação = "Imortal";
        }
            else {
            classificação = "Radiante";
        }

        System.out.print("O Herói de nome " + nome);
        System.out.print(" está no nível de " + classificação);

    }
}