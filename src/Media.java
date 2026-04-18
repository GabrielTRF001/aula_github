  import java.util.Scanner;
public class Media{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Programa para calculo de media das 4 Unidades");
         double nota1, nota2, nota3, nota4;
         double media;
         System.out.print("Digite a primeira Nota:");
         nota1 = scanner.nextDouble();

         System.out.print("Digite a Segunda Nota:");
         nota2 = scanner.nextDouble();

         System.out.print("Digite a Tereira Nota:");
         nota3 = scanner.nextDouble();

         System.out.print("Digite a Quarta Nota:");
         nota4 = scanner.nextDouble();
         
         media = (nota1 + nota2 + nota3 + nota4) / 4;
         System.out.println("A media e:"+ media);
         scanner.close();


        
    }
}


