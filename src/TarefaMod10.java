import java.util.Scanner;

public class TarefaMod10 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nota 1: ");
        double nota1 =s.nextDouble();
        System.out.println("Digite sua nota 2: ");
        double nota2 =s.nextDouble();
        System.out.println("Digite sua nota 3: ");
        double nota3 =s.nextDouble();
        System.out.println("Digite sua nota 4: ");
        double nota4 =s.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String resultado = getNota(media);
        System.out.println("Sua média final é: " + media);
        System.out.println(resultado);
    }

    public static String getNota(double media) {
        if (media>= 7 ) {
            return "Você está aprovado";
        } else if (media>= 5) {
            return "Você está de recuperação";
        }  else {
            return "Você está reprovado, estude mais no proximo semestre!";
        }
    }
}
