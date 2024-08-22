import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     MENU CAPITULO DE PROGRAMACIÓN     - "+ "\n");
                System.out.printf(" -       JORGE CALDERON                  - "+ "\n");
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
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     DATOS PRIMITIVOS                  - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     1. Explicacion byte               - "+ "\n");
                                System.out.printf(" -     2. Explicacion short              - "+ "\n");
                                System.out.printf(" -     3. Explicacion int                - "+ "\n");
                                System.out.printf(" -     4. Explicacion long               - "+ "\n");
                                System.out.printf(" -     5. Explicacion float              - "+ "\n");
                                System.out.printf(" -     6. Explicacion double             - "+ "\n");
                                System.out.printf(" -     7. Explicacion char               - "+ "\n");
                                System.out.printf(" -     8. Explicacion boolean            - "+ "\n");
                                System.out.printf("       0. volver al menu principal       - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");

                                int y;
                                System.out.println("ingresa la opcion que deseas: ");
                                Scanner dp = new Scanner(System.in);
                                y = dp.nextInt();

                                switch (y) {
                                        case 1:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     QUE ES BYTE                       - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -  Un BYTE es un tipo de dato que se    - "+ "\n");
                                                System.out.printf(" -  utiliza para representar un          - "+ "\n");
                                                System.out.printf(" -  valor de 8 bits                      - "+ "\n");
                                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                                System.out.printf(" -     byte valor = 10;                  - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 2:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     QUE ES SHORT                      - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -  Un SHORT es un tipo de dato que se   - "+ "\n");
                                                System.out.printf(" -  utiliza para representar un          - "+ "\n");
                                                System.out.printf(" -  valor de 16 bits                     - "+ "\n");
                                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                                System.out.printf(" -     short valor = 10;                 - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 3:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     QUE ES INT                        - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -  Un INT es un tipo de dato que se     - "+ "\n");
                                                System.out.printf(" -  utiliza para representar un          - "+ "\n");
                                                System.out.printf(" -  valor de 32 bits                     - "+ "\n");
                                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                                System.out.printf(" -     int valor = 10;                   - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 4:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     QUE ES LONG                       - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -  Un LONG es un tipo de dato que se    - "+ "\n");
                                                System.out.printf(" -  utiliza para representar un          - "+ "\n");
                                                System.out.printf(" -  valor de 64 bits                     - "+ "\n");
                                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                                System.out.printf(" -     long valor = 10;                  - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 5:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     QUE ES FLOAT                      - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -  Un FLOAT es un tipo de dato que se   - "+ "\n");
                                                System.out.printf(" -  utiliza para representar un          - "+ "\n");
                                                System.out.printf(" -  valor de 32 bits                     - "+ "\n");
                                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                                System.out.printf(" -     float valor = 10;                 - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 6:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     QUE ES DOUBLE                     - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -  Un DOUBLE es un tipo de dato que se  - "+ "\n");
                                                System.out.printf(" -  utiliza para representar un          - "+ "\n");
                                                System.out.printf(" -  valor de 64 bits                     - "+ "\n");
                                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                                System.out.printf(" -     double valor = 10;                - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 7:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     QUE ES CHAR                       - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -  Un CHAR es un tipo de dato que se    - "+ "\n");
                                                System.out.printf(" -  utiliza para representar un          - "+ "\n");
                                                System.out.printf(" -  valor de 16 bits                     - "+ "\n");
                                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                                System.out.printf(" -     char valor = 'a';                 - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 8:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     QUE ES BOOLEAN                    - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -  Un BOOLEAN es un tipo de dato que se -"+ "\n");
                                                System.out.printf(" -  utiliza para representar un          - "+ "\n");
                                                System.out.printf(" -  valor de 16 bits                     - "+ "\n");
                                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                                System.out.printf(" -     boolean valor = true;             - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 0:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     GRACIAS POR SU VISITA             - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        default:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     OPCION INVALIDA                   - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                }
                                break;
                        case 2:
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     QUE ES STRING                     - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -  Un STRING o cadena de caracteres es  - "+ "\n");
                                System.out.printf(" -  un tipo de dato que se utiliza para  - "+ "\n");
                                System.out.printf(" -  almacenar textos                     - "+ "\n");
                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                System.out.printf(" -     String nombre = \"Casimiro\";       - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                break;
                        case 3:
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     QUE ES CONSTANTE                  - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -  Las constantes cumplen la misma      - "+ "\n");
                                System.out.printf(" -  función que las variables pero su    - "+ "\n");
                                System.out.printf(" -  valor siempre será estático          - "+ "\n");
                                System.out.printf(" -  (no cambia)                          - "+ "\n");
                                System.out.printf(" -  Ejemplo:                             - "+ "\n");
                                System.out.printf(" -     final tipo nombreVble = valor;    - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                break;
                        case 4:
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     TIPOS DE OPERADORES               - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     1. Aritmeticos                    - "+ "\n");
                                System.out.printf(" -     2. Relacionales                   - "+ "\n");
                                System.out.printf(" -     3. Logicos                        - "+ "\n");
                                System.out.printf(" -     4. Asignacion                     - "+ "\n");
                                System.out.printf(" -     5. Incremento y Decremento        - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");

                                int z;
                                System.out.println("ingresa la opcion que deseas: ");
                                Scanner to = new Scanner(System.in);
                                z = to.nextInt();

                                switch (z) {
                                        case 1:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     Aritmeticos                      - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     1. Explicacion de Suma            - "+ "\n");
                                                System.out.printf(" -     2. Explicacion de Resta           - "+ "\n");
                                                System.out.printf(" -     3. Explicacion de Multiplicacion  - "+ "\n");
                                                System.out.printf(" -     4. Explicacion de Division        - "+ "\n");
                                                System.out.printf(" -     5. Explicacion de Modulo          - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 2:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     Relacionales                     - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     1. Explicacion de Menor           - "+ "\n");
                                                System.out.printf(" -     2. Explicacion de Mayor           - "+ "\n");
                                                System.out.printf(" -     3. Explicacion de Menor Igual     - "+ "\n");
                                                System.out.printf(" -     4. Explicacion de Mayor Igual     - "+ "\n");
                                                System.out.printf(" -     5. Explicacion de Igual           - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 3:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     Logicos                          - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     1. Explicacion de And             - "+ "\n");
                                                System.out.printf(" -     2. Explicacion de Or              - "+ "\n");
                                                System.out.printf(" -     3. Explicacion de Not             - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                }
                                break;
                        case 5:
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     IF, ELSE, IF ELSE                 - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     1. Explicacion de IF              - "+ "\n");
                                System.out.printf(" -     2. Explicacion de ELSE IF         - "+ "\n");
                                System.out.printf(" -     3. Explicacion de ELSE            - "+ "\n");
                                System.out.printf(" -     4. Programa IF, ELSE, IF ELSE     - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                break;
                        case 6:
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     SWITCH                            - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     1. Explicacion de Switch          - "+ "\n");
                                System.out.printf(" -     2. Programa Switch                - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                break;
                        case 7:
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     TERNARIA                          - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     1. Explicacion de ternaria        - "+ "\n");
                                System.out.printf(" -     2. Programa ternaria - Determina  - "+ "\n");
                                System.out.printf(" -     si un numero es par e impar       - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                break;
                        case 8:
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     DO WHILE                          - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     1. Explicacion de DO WHILE        - "+ "\n");
                                System.out.printf(" -     2. Programa DO WHILE - Adivina    - "+ "\n");
                                System.out.printf(" -     el numero                         - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                        case 9:
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     WHILE                             - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     1. Explicacion de WHILE           - "+ "\n");
                                System.out.printf(" -     2. Programa WHILE                 - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                break;
                        case 10:
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     FOR                               - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                System.out.printf(" -     1. Explicacion de FOR             - "+ "\n");
                                System.out.printf(" -     2. Programa FOR                   - "+ "\n");
                                System.out.printf(" ----------------------------------------- "+ "\n");
                                break;
                        case 0:
                                System.out.printf(" -     Nos vemos lk                      - "+ "\n");
                                break;
                        default:
                                System.out.println("No existe el capitulo, verificar el menu de arriba");
                }
        }
}