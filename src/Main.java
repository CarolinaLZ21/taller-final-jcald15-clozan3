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
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                System.out.printf(" -                                     Aritmeticos                                                          - "+ "\n");
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                System.out.printf(" - +	En la suma, los valores de dos operandos se suman. Ejemplo: x + y = z                                  - "+ "\n");
                                                System.out.printf(" - -	En la resta, el valor del segundo operando se resta del valor del primer operando. Ejemplo: x - y = z  - "+ "\n");
                                                System.out.printf(" - *	En la multiplicación, se multiplican dos operandos. Ejemplo: x * y = z                                 - "+ "\n");
                                                System.out.printf(" - /	En la división, el primer operando se divide por el valor del segundo operando. Ejemplo: x / y = z     - "+ "\n");
                                                System.out.printf(" - mod El operando mod calcula el valor restante de una división. Ejemplo: 2 mod 2 = 1                        - "+ "\n");
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                break;

                                        case 2:
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                System.out.printf(" -                                     Relacionales                                                               - "+ "\n");
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                System.out.printf(" - <   El operador Menor, compara si un valor es menor que el otro Ejemplo: comparacion = 3 < 5                   - "+ "\n");
                                                System.out.printf(" - >	  El operador Mayor, compara si un valor es mayor que otro Ejemplo: comparacion = 10 > 7                     - "+ "\n");
                                                System.out.printf(" - <=  El operador Menor o igual, compara si un valor es menor o igual que el otro Ejemplo: comparacion = 7 <= 7  - "+ "\n");
                                                System.out.printf(" - >=  El operador Mayor o igual, compara si un valor es mayor o igual que el otro Ejemplo: comparacion = 7 >= 2  - "+ "\n");
                                                System.out.printf(" - =   El operando Igual, compara si un valor es igual que el otro Ejemplo: comparacion = 9 = 9                   - "+ "\n");
                                                System.out.printf(" - !=  El operando diferente, compara si un valor es diferente de otro Ejemplo: comparacion = 9 != 7              - "+ "\n");
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                break;
                                        case 3:
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                System.out.printf(" -                                     Logicos                                                                    - "+ "\n");
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                System.out.printf(" - Los operadores lógicos son herramientas poderosas para combinar o invertir condiciones lógicas en un programa. - "+ "\n");
                                                System.out.printf(" -                                                                                                                - "+ "\n");
                                                System.out.printf(" - Los operadores lógicos más comunes son && (AND lógico), || (OR lógico) y ! (NOT lógico).                       - "+ "\n");
                                                System.out.printf(" -                                                                                                                - "+ "\n");
                                                System.out.printf(" - El operador && devuelve true si ambas condiciones son verdaderas, || devuelve true si al menos una condición   - "+ "\n");
                                                System.out.printf(" - es verdadera, y ! invierte el valor de una condición, es decir, cambia true a false y viceversa.               - "+ "\n");
                                                System.out.printf(" -                                                                                                                - "+ "\n");
                                                System.out.printf(" - Estos operadores son esenciales para construir expresiones condicionales complejas y tomar decisiones          - "+ "\n");
                                                System.out.printf(" - basadas en múltiples condiciones lógicas. Se utilizan en conjunto con operadores de comparación para crear     - "+ "\n");
                                                System.out.printf(" - lógica condicional robusta en programas.                                                                       - "+ "\n");
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                System.out.printf(" -                                     TABLAS DE VERDAD                                                           - "+ "\n");
                                                System.out.printf(" -                                 &&(AND)    ||(OR)               !(NOT)                                         - "+ "\n");
                                                System.out.printf(" -                      | V | V |   | V |     | V |               | V | F |                                       - "+ "\n");
                                                System.out.printf(" -                      | V | F |   | F |     | V |               | F | V |                                       - "+ "\n");
                                                System.out.printf(" -                      | F | V |   | F |     | V |                                                               - "+ "\n");
                                                System.out.printf(" -                      | F | F |   | F |     | V |                                                               - "+ "\n");
                                                System.out.printf(" ------------------------------------------------------------------------------------------------------------------ "+ "\n");
                                                break;

                                        case 4:
                                                System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- "+ "\n");
                                                System.out.printf(" -                                     Asignacion                                                                           - "+ "\n");
                                                System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- "+ "\n");
                                                System.out.printf(" - Los operadores de asignación asignan valores a las variables:                                                             - "+ "\n");
                                                System.out.printf(" -                                                                                                                          - "+ "\n");
                                                System.out.printf(" - =  Asigna el valor de la expresión a la variable. Ejemplo: asigna valor 5 a la variable X = 5                            - "+ "\n");
                                                System.out.printf(" - += Suma el valor de la expresión al valor de la variable y reasigna el resultado a la variable. Ejemplo: X += 5          - "+ "\n");
                                                System.out.printf(" - -= Resta el valor de la expresión del valor de la variable y reasigna el resultado a la variable. Ejemplo: X -= 3        - "+ "\n");
                                                System.out.printf(" - := Concatena el valor de la variable y el valor de la expresión y reasigna el resultado a la variable. Ejemplo: X := Y   - "+ "\n");
                                                System.out.printf(" -                                                                                                                          - "+ "\n");
                                                System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- "+ "\n");
                                                break;

                                        case 5:
                                                System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- "+ "\n");
                                                System.out.printf(" -     Incremento y Decremento                                                                                               - "+ "\n");
                                                System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- "+ "\n");
                                                System.out.printf(" - Los operadores de incremento (++) y decremento (—) son útiles para modificar el valor de una variable en una unidad.      - "+ "\n");
                                                System.out.printf(" -                                                                                                                           - "+ "\n");
                                                System.out.printf(" - El operador de incremento aumenta el valor de la variable en 1, mientras que el operador de decremento lo disminuye en 1. - "+ "\n");
                                                System.out.printf(" -                                                                                                                           - "+ "\n");
                                                System.out.printf(" - Estos operadores son especialmente útiles en bucles y otras situaciones en las que se necesita actualizar una variable    - "+ "\n");
                                                System.out.printf(" - de forma repetida. También se pueden utilizar en combinación con operadores de asignación para realizar incrementos       - "+ "\n");
                                                System.out.printf(" - o decrementos personalizados, como x += 2; que incrementa x en 2 unidades.                                                - "+ "\n");
                                                System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- "+ "\n");
                                                break;
                                        default:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     OPCION NO VALIDA                  - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
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

                        int a;
                        System.out.println("ingresa la opcion que deseas: ");
                        Scanner ie = new Scanner(System.in);
                        a = ie.nextInt();

                                switch (a) {
                                        case 1:
                                                System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- "+ "\n");
                                                System.out.printf(" -     Explicacion de IF                                                                                                     - "+ "\n");
                                                System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- "+ "\n");
                                                System.out.printf(" - Permite que un programa decida si ejecuta una sentencia o un bloque de sentencias, en caso de que la condición sea        - "+ "\n");
                                                System.out.printf(" - verdadera, o bien si salta su ejecución, en caso de que la condición sea falsa                                            - "+ "\n");
                                                System.out.printf(" -                                                                                                                           - "+ "\n");
                                                System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- "+ "\n");
                                                break;
                                        case 2:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     Explicacion de ELSE IF           - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     1. Explicacion de ELSE IF         - "+ "\n");
                                                System.out.printf(" -     2. Programa ELSE IF               - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                        case 3:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     Explicacion de ELSE              - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     1. Explicacion de ELSE            - "+ "\n");
                                                System.out.printf(" -     2. Programa ELSE                  - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                                case 4:
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     Programa de IF, ELSE, IF ELSE - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                System.out.printf(" -     1. Explicacion de IF, ELSE, IF ELSE - "+ "\n");
                                                System.out.printf(" -     2. Programa IF, ELSE, IF ELSE     - "+ "\n");
                                                System.out.printf(" ----------------------------------------- "+ "\n");
                                                break;
                                }

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
                                System.out.println("No existe el capitulo, verificar el menu de abajo");
                                System.out.println("No existe el capitulo, verificar el menu de abajo");
                }
        }
}