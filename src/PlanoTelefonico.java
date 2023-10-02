import java.util.Scanner;

public class PlanoTelefonico {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

            System.out.println("Planos disponiveis: BASIC, MIDIA E TURBO");

             System.out.println("Qual o plano deseja: ");
             String plano = scanner.nextLine();

             switch(plano){
                case "BASIC":{
                    System.out.println("Você tem 100 minutos de ligação!");
                    break;
                }
                case "MIDIA":{
                    System.out.println("Você tem 100 minutos de ligação + Whats e Instagram grátis!");
                    break;
                }
                case "TURBO":{
                    System.out.println("Você tem 100 minutos de ligação + Whats e Instagram grátis + 5G YouTube!");
                    break;
                }
                default:
                    System.out.println("Plano não encontrado!");
             }
    }

    




    
}
