package operadoresautomatas;
import java.util.Scanner;
public class OperadoresAutomatas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el primer numero entero: ");
        int numero1 = entrada.nextInt();
        System.out.println("Escriba el segundo numero entero: ");
        int numero2 = entrada.nextInt();
        if(numero1 == numero2){
            System.out.printf("%d == %d\n", numero1,numero2, "\n");}
        else if(numero1 != numero2){
            System.out.printf(numero1 +"!="+ numero2, "\n");}
        else if(numero1 < numero2){
            System.out.printf("%d < %d\n", numero1,numero2, "\n");}
        else if(numero1 > numero2){
            System.out.printf(numero1 +">"+ numero2, "\t");}
        else if(numero1 <= numero2){
            System.out.printf("%d <= %d\n", numero1,numero2, "\n");}
        else if(numero1 >= numero2){
            System.out.printf(numero1 +">="+ numero2, "\n"); }
    }  
}
