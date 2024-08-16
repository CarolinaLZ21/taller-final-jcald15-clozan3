import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     MENU CAPITULO DE PROGRAMACIÓN     - "+ "\n");
                System.out.printf(" -        JORGE CALDERON                 - "+ "\n");
                System.out.printf(" -       CAROLINA LOZANO                 - "+ "\n");
                System.out.printf(" ----------------------------------------- "+ "\n");
                System.out.printf(" -     1. Datos Primitivos               - "+ "\n");
                System.out.printf(" -     2. String                         - "+ "\n");
                System.out.printf(" -     3. Constantes                     - "+ "\n");
                System.out.printf(" -     4. Tipo de Operadores             - "+ "\n");
                System.out.printf(" -     5. Condicional IF, ELSE, IF ELSE  - "+ "\n");
                System.out.printf(" -     6. Condicinal Switch              - "+ "\n");
                System.out.printf(" -     7. Condicional Ternaria           - "+ "\n");
                System.out.printf(" -     8. Bucle DO WHILE                 - "+ "\n");
                System.out.printf(" -     9. Bucle WHILE                    - "+ "\n");
                System.out.printf(" -    10. Bucle FOR                      - "+ "\n");
                System.out.printf("       0. Salir                          - "+ "\n");
                System.out.printf(" ----------------------------------------- "+ "\n");

                int x;
                System.out.println("ingresa la opcion que deseas: ");
                Scanner sc = new Scanner(System.in);
                x = sc.nextInt();

                switch (x) {
                        case 1:
                                System.out.printf(" -     1. Datos Primitivos               - "+ "\n");
                                break;
                        case 2:
                                System.out.printf(" -     2. String                         - "+ "\n");
                                break;
                        case 3:
                                System.out.printf(" -     3. Constantes                     - "+ "\n");
                                break;
                        case 4:
                                System.out.printf(" -     4. Tipo de Operadores             - "+ "\n");
                                break;
                        case 5:
                                System.out.printf(" -     5. Condicional IF, ELSE, IF ELSE  - "+ "\n");
                                break;
                        case 6:
                                System.out.printf(" -     6. Condicinal Switch              - "+ "\n");
                                break;
                        case 7:
                                System.out.printf(" -     5. Condicional IF, ELSE, IF ELSE  - "+ "\n");
                                break;
                        case 8:
                                System.out.printf(" -     6. Condicinal Switch" + "              - "+ "\n");
                        case 9:
                                System.out.printf(" -     6. Condicinal Switch              - "+ "\n");
                                break;
                        case 10:
                                System.out.printf(" -     5. Condicional IF, ELSE, IF ELSE  - "+ "\n");
                                break;
                        case 0:
                                System.out.printf(" -     6. Condicinal Switch" + "              - "+ "\n");

                        default:
                                System.out.println("No existe el capitulo");

        }
        }
}