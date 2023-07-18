import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rettangolo pippo= new Rettangolo();
        System.out.println("dammi la base del rettangolo");
        int a = input.nextInt();
        System.out.println("dammi l'altezza del rettangolo");
        int b = input.nextInt();
        int perimetro = pippo.perimetro(a,b);
        System.out.println("il perimetro del rettangolo è : "+perimetro);
        int area = pippo.area(a,b);
        System.out.println("l'area del rettangolo è : "+ area);
    }
}
