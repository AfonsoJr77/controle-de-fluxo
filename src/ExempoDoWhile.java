import java.util.Random;
public class ExempoDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //repetindo até alguem atender
            System.out.println("Telefone tocando...");
        }while(tocando());

        System.out.println("Alô!!!");
        
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;//se um desses valores for igual a 1 ele atendeu.
        System.out.println("Atendeu ?" + atendeu);
        //negando o ato de continuar tocando
        return !atendeu;
    }
}
