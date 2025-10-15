import java.util.Scanner;

public class TarefaMod10 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota = s.nextInt();
        String notaFD = getNota(nota);
        System.out.println(notaFD );
    }

    public static String getNota(int nota) {
        if (nota >= 7 ) {
            return "Você está aprovado";
        } else if (nota>= 5) {
            return "Você está de recuperação";
        }  else {
            return "Você está reprovado, estude mais no proximo semestre!";
        }
    }
}
