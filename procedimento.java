import java.util.Scanner;
public class procedimento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y;
        String enter;
        
        int opcao;

        do{
            System.err.println("qualquer valor para continuar...");
            enter = scan.next();
            menu();
            opcao = scan.nextInt();
            if(opcao!=0 & opcao<=4){
                switch(opcao){
                    case 1:
                    System.out.println("=== ADICAO ===");
                    System.out.println("++++++++++");
                    x = scan.nextInt();
                    System.out.println("++++++++++");
                    y = scan.nextInt();
                    System.out.println("++++++++++");
                    soma(x,y);
                    break;
                    case 2:
                    System.out.println("=== SUBTRACAO ===");
                    System.out.println("----------");
                    x = scan.nextInt();
                    System.out.println("----------");
                    y = scan.nextInt();
                    System.out.println("----------");
                    Subtrair(x, y);
                    break;
                    case 3:
                    System.out.println("=== MULTIPLICACAO ===");
                    System.out.println("**********");
                    x = scan.nextInt();
                    System.out.println("**********");
                    y = scan.nextInt();
                    System.out.println("**********");
                    Multiplicar(x, y);
                    break;
                    case 4:
                    System.out.println("=== DIVISAO ===");
                    System.out.println("//////////");
                    x = scan.nextInt();
                    System.out.println("//////////");
                    y = scan.nextInt();
                    System.out.println("//////////");
                    Dividir(x, y);
                    break;
                }
            }
            else if(opcao>4){
                System.out.println("FORA DE ESCOLHA... tente novamente");
            }

        }while(opcao!=0);
    }

    static void menu() {
        System.out.println("======================================");
        System.out.println("\t[1] Somar\n\t[2] Subtrair\n\t[3] Multiplicar\n\t[4] Dividir\n\t[0] Sair");
        System.out.println("======================================");
    }

    static void soma(int x, int y){
        System.out.println("\n\n\n\tResultado: "+(x+y));
    }

    static void Subtrair(int x,int y){
        System.out.println("\n\n\n\tResultado: "+(x-y));
    }

    static void Multiplicar(int x,int y){
        System.out.println("\n\n\n\tResultado: "+(x*y));
    }

    static void Dividir(int x,int y){
        System.out.println("\n\n\n\tResultado: "+(x/y));
    }
    
}
"# Calculadora-Procedimento" 
