import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {


        System.out.printf(" ----------------------------------------- " + "\n");
        System.out.printf(" -     MENU CAPITULO DE PROGRAMACIÓN     - " + "\n");
        System.out.printf(" -            JORGE CALDERON             - " + "\n");
        System.out.printf(" -            CAROLINA LOZANO            - " + "\n");
        System.out.printf(" ----------------------------------------- " + "\n");
        System.out.printf(" -     1. Datos Primitivos               - " + "\n");
        System.out.printf(" -     2. String                         - " + "\n");
        System.out.printf(" -     3. Constantes                     - " + "\n");
        System.out.printf(" -     4. Tipo de Operadores             - " + "\n");
        System.out.printf(" -     5. Condicional IF, ELSE, IF ELSE  - " + "\n");
        System.out.printf(" -     6. Condicinal Switch              - " + "\n");
        System.out.printf(" -     7. Condicional Ternaria           - " + "\n");
        System.out.printf(" -     8. Bucle DO WHILE                 - " + "\n");
        System.out.printf(" -     9. Bucle WHILE                    - " + "\n");
        System.out.printf(" -    10. Bucle FOR                      - " + "\n");
        System.out.printf("       0. Salir                          - " + "\n");
        System.out.printf(" ----------------------------------------- " + "\n");

        int x;
        System.out.println("ingresa la opcion que deseas: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     DATOS PRIMITIVOS                  - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     1. Explicacion byte               - " + "\n");
                System.out.printf(" -     2. Explicacion short              - " + "\n");
                System.out.printf(" -     3. Explicacion int                - " + "\n");
                System.out.printf(" -     4. Explicacion long               - " + "\n");
                System.out.printf(" -     5. Explicacion float              - " + "\n");
                System.out.printf(" -     6. Explicacion double             - " + "\n");
                System.out.printf(" -     7. Explicacion char               - " + "\n");
                System.out.printf(" -     8. Explicacion boolean            - " + "\n");
                System.out.printf("       0. volver al menu principal       - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");

                int y;
                System.out.println("ingresa la opcion que deseas: ");
                Scanner dp = new Scanner(System.in);
                y = dp.nextInt();

                switch (y) {
                    case 1:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     QUE ES BYTE                       - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -  Un BYTE es un tipo de dato que se    - " + "\n");
                        System.out.printf(" -  utiliza para representar un          - " + "\n");
                        System.out.printf(" -  valor de 8 bits                      - " + "\n");
                        System.out.printf(" -  Ejemplo:                             - " + "\n");
                        System.out.printf(" -     byte valor = 10;                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");

                        break;
                    case 2:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     QUE ES SHORT                      - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -  Un SHORT es un tipo de dato que se   - " + "\n");
                        System.out.printf(" -  utiliza para representar un          - " + "\n");
                        System.out.printf(" -  valor de 16 bits                     - " + "\n");
                        System.out.printf(" -  Ejemplo:                             - " + "\n");
                        System.out.printf(" -     short valor = 10;                 - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    case 3:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     QUE ES INT                        - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -  Un INT es un tipo de dato que se     - " + "\n");
                        System.out.printf(" -  utiliza para representar un          - " + "\n");
                        System.out.printf(" -  valor de 32 bits                     - " + "\n");
                        System.out.printf(" -  Ejemplo:                             - " + "\n");
                        System.out.printf(" -     int valor = 10;                   - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    case 4:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     QUE ES LONG                       - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -  Un LONG es un tipo de dato que se    - " + "\n");
                        System.out.printf(" -  utiliza para representar un          - " + "\n");
                        System.out.printf(" -  valor de 64 bits                     - " + "\n");
                        System.out.printf(" -  Ejemplo:                             - " + "\n");
                        System.out.printf(" -     long valor = 10;                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    case 5:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     QUE ES FLOAT                      - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -  Un FLOAT es un tipo de dato que se   - " + "\n");
                        System.out.printf(" -  utiliza para representar un          - " + "\n");
                        System.out.printf(" -  valor de 32 bits                     - " + "\n");
                        System.out.printf(" -  Ejemplo:                             - " + "\n");
                        System.out.printf(" -     float valor = 10;                 - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    case 6:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     QUE ES DOUBLE                     - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -  Un DOUBLE es un tipo de dato que se  - " + "\n");
                        System.out.printf(" -  utiliza para representar un          - " + "\n");
                        System.out.printf(" -  valor de 64 bits                     - " + "\n");
                        System.out.printf(" -  Ejemplo:                             - " + "\n");
                        System.out.printf(" -     double valor = 10;                - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    case 7:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     QUE ES CHAR                       - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -  Un CHAR es un tipo de dato que se    - " + "\n");
                        System.out.printf(" -  utiliza para representar un          - " + "\n");
                        System.out.printf(" -  valor de 16 bits                     - " + "\n");
                        System.out.printf(" -  Ejemplo:                             - " + "\n");
                        System.out.printf(" -     char valor = 'a';                 - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    case 8:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     QUE ES BOOLEAN                    - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -  Un BOOLEAN es un tipo de dato que se -" + "\n");
                        System.out.printf(" -  utiliza para representar un          - " + "\n");
                        System.out.printf(" -  valor de 16 bits                     - " + "\n");
                        System.out.printf(" -  Ejemplo:                             - " + "\n");
                        System.out.printf(" -     boolean valor = true;             - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    case 0:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     GRACIAS POR SU VISITA             - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    default:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     OPCION INVALIDA                   - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                }
                break;
            case 2:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     QUE ES STRING                     - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -  Un STRING o cadena de caracteres es  - " + "\n");
                System.out.printf(" -  un tipo de dato que se utiliza para  - " + "\n");
                System.out.printf(" -  almacenar textos                     - " + "\n");
                System.out.printf(" -  Ejemplo:                             - " + "\n");
                System.out.printf(" -     String nombre = \"Casimiro\";     - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                break;
            case 3:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     QUE ES CONSTANTE                  - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -  Las constantes cumplen la misma      - " + "\n");
                System.out.printf(" -  función que las variables pero su    - " + "\n");
                System.out.printf(" -  valor siempre será estático          - " + "\n");
                System.out.printf(" -  (no cambia)                          - " + "\n");
                System.out.printf(" -  Ejemplo:                             - " + "\n");
                System.out.printf(" -     final tipo nombreVble = valor;    - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                break;
            case 4:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     TIPOS DE OPERADORES               - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     1. Aritmeticos                    - " + "\n");
                System.out.printf(" -     2. Relacionales                   - " + "\n");
                System.out.printf(" -     3. Logicos                        - " + "\n");
                System.out.printf(" -     4. Asignacion                     - " + "\n");
                System.out.printf(" -     5. Incremento y Decremento        - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");

                int z;
                System.out.println("ingresa la opcion que deseas: ");
                Scanner to = new Scanner(System.in);
                z = to.nextInt();

                switch (z) {
                    case 1:
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------ " + "\n");
                        System.out.printf(" -                                     Aritmeticos                                                          - " + "\n");
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------ " + "\n");
                        System.out.printf(" - +	En la suma, los valores de dos operandos se suman. Ejemplo: x + y = z                                  - " + "\n");
                        System.out.printf(" - -	En la resta, el valor del segundo operando se resta del valor del primer operando. Ejemplo: x - y = z  - " + "\n");
                        System.out.printf(" - *	En la multiplicación, se multiplican dos operandos. Ejemplo: x * y = z                                 - " + "\n");
                        System.out.printf(" - /	En la división, el primer operando se divide por el valor del segundo operando. Ejemplo: x / y = z     - " + "\n");
                        System.out.printf(" - mod El operando mod calcula el valor restante de una división. Ejemplo: 2 mod 2 = 1                      - " + "\n");
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------ " + "\n");
                        break;

                    case 2:
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------------ " + "\n");
                        System.out.printf(" -                                     Relacionales                                                               - " + "\n");
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------------ " + "\n");
                        System.out.printf(" - <   El operador Menor, compara si un valor es menor que el otro Ejemplo: comparacion = 3 < 5                   - " + "\n");
                        System.out.printf(" - >	  El operador Mayor, compara si un valor es mayor que otro Ejemplo: comparacion = 10 > 7                     - " + "\n");
                        System.out.printf(" - <=  El operador Menor o igual, compara si un valor es menor o igual que el otro Ejemplo: comparacion = 7 <= 7  - " + "\n");
                        System.out.printf(" - >=  El operador Mayor o igual, compara si un valor es mayor o igual que el otro Ejemplo: comparacion = 7 >= 2  - " + "\n");
                        System.out.printf(" - =   El operando Igual, compara si un valor es igual que el otro Ejemplo: comparacion = 9 = 9                   - " + "\n");
                        System.out.printf(" - !=  El operando diferente, compara si un valor es diferente de otro Ejemplo: comparacion = 9 != 7              - " + "\n");
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------------ " + "\n");
                        break;
                    case 3:
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------------ " + "\n");
                        System.out.printf(" -                                     Logicos                                                                    - " + "\n");
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------------ " + "\n");
                        System.out.printf(" - Los operadores lógicos son herramientas poderosas para combinar o invertir condiciones lógicas en un programa. - " + "\n");
                        System.out.printf(" -                                                                                                                - " + "\n");
                        System.out.printf(" - Los operadores lógicos más comunes son && (AND lógico), || (OR lógico) y ! (NOT lógico).                       - " + "\n");
                        System.out.printf(" -                                                                                                                - " + "\n");
                        System.out.printf(" - El operador && devuelve true si ambas condiciones son verdaderas, || devuelve true si al menos una condición   - " + "\n");
                        System.out.printf(" - es verdadera, y ! invierte el valor de una condición, es decir, cambia true a false y viceversa.               - " + "\n");
                        System.out.printf(" -                                                                                                                - " + "\n");
                        System.out.printf(" - Estos operadores son esenciales para construir expresiones condicionales complejas y tomar decisiones          - " + "\n");
                        System.out.printf(" - basadas en múltiples condiciones lógicas. Se utilizan en conjunto con operadores de comparación para crear     - " + "\n");
                        System.out.printf(" - lógica condicional robusta en programas.                                                                       - " + "\n");
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------------ " + "\n");
                        System.out.printf(" -                                     TABLAS DE VERDAD                                                           - " + "\n");
                        System.out.printf(" -                                 &&(AND)    ||(OR)               !(NOT)                                         - " + "\n");
                        System.out.printf(" -                      | V | V |   | V |     | V |               | V | F |                                       - " + "\n");
                        System.out.printf(" -                      | V | F |   | F |     | V |               | F | V |                                       - " + "\n");
                        System.out.printf(" -                      | F | V |   | F |     | V |                                                               - " + "\n");
                        System.out.printf(" -                      | F | F |   | F |     | V |                                                               - " + "\n");
                        System.out.printf(" ------------------------------------------------------------------------------------------------------------------ " + "\n");
                        break;

                    case 4:
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" -                                     Asignacion                                                                           - " + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" - Los operadores de asignación asignan valores a las variables:                                                             - " + "\n");
                        System.out.printf(" -                                                                                                                          - " + "\n");
                        System.out.printf(" - =  Asigna el valor de la expresión a la variable. Ejemplo: asigna valor 5 a la variable X = 5                            - " + "\n");
                        System.out.printf(" - += Suma el valor de la expresión al valor de la variable y reasigna el resultado a la variable. Ejemplo: X += 5          - " + "\n");
                        System.out.printf(" - -= Resta el valor de la expresión del valor de la variable y reasigna el resultado a la variable. Ejemplo: X -= 3        - " + "\n");
                        System.out.printf(" - := Concatena el valor de la variable y el valor de la expresión y reasigna el resultado a la variable. Ejemplo: X := Y   - " + "\n");
                        System.out.printf(" -                                                                                                                          - " + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        break;

                    case 5:
                        System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" -     Incremento y Decremento                                                                                               - " + "\n");
                        System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" - Los operadores de incremento (++) y decremento (—) son útiles para modificar el valor de una variable en una unidad.      - " + "\n");
                        System.out.printf(" -                                                                                                                           - " + "\n");
                        System.out.printf(" - El operador de incremento aumenta el valor de la variable en 1, mientras que el operador de decremento lo disminuye en 1. - " + "\n");
                        System.out.printf(" -                                                                                                                           - " + "\n");
                        System.out.printf(" - Estos operadores son especialmente útiles en bucles y otras situaciones en las que se necesita actualizar una variable    - " + "\n");
                        System.out.printf(" - de forma repetida. También se pueden utilizar en combinación con operadores de asignación para realizar incrementos       - " + "\n");
                        System.out.printf(" - o decrementos personalizados, como x += 2; que incrementa x en 2 unidades.                                                - " + "\n");
                        System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        break;
                    default:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                }
                break;
            case 5:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     IF, ELSE, IF ELSE                 - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     1. Explicacion de IF              - " + "\n");
                System.out.printf(" -     2. Explicacion de ELSE IF         - " + "\n");
                System.out.printf(" -     3. Explicacion de ELSE            - " + "\n");
                System.out.printf(" -     4. Programa IF, ELSE, IF ELSE     - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");

                int a;
                System.out.println("ingresa la opcion que deseas: ");
                Scanner ie = new Scanner(System.in);
                a = ie.nextInt();

                switch (a) {
                    case 1:
                        System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" -     Explicacion de IF                                                                                                     - " + "\n");
                        System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" - Permite que un programa decida si ejecuta una sentencia o un bloque de sentencias, en caso de que la condición sea        - " + "\n");
                        System.out.printf(" - verdadera, o bien si salta su ejecución, en caso de que la condición sea falsa                                            - " + "\n");
                        System.out.printf(" -                                                                                                                           - " + "\n");
                        System.out.printf(" ----------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        break;
                    case 2:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     Explicacion de ELSE IF           - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     1. Explicacion de ELSE IF         - " + "\n");
                        System.out.printf(" -     2. Programa ELSE IF               - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    case 3:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     Explicacion de ELSE              - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     1. Explicacion de ELSE            - " + "\n");
                        System.out.printf(" -     2. Programa ELSE                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    case 4:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     Programa de IF, ELSE, IF ELSE - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     1. Explicacion de IF, ELSE, IF ELSE - " + "\n");
                        System.out.printf(" -     2. Programa IF, ELSE, IF ELSE     - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                        break;
                    default:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                }
                break;

            case 6:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -           SWITCH                      - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     1. Explicacion de Switch          - " + "\n");
                System.out.printf(" -     2. Programa Switch                - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");

                Scanner sw = new Scanner(System.in);
                System.out.println("ingresa la opcion que deseas");
                int s = sw.nextInt();

                switch (s) {
                    case 1:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Explicacion de Switch                                                                                                 -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" - La sentencia switch se utiliza para ejecutar diferentes bloques de código basados                                         -" + "\n");
                        System.out.printf(" - en el resultado de una expresión o el valor de una variable.Es ideal para los casos en los que necesitas comparar         -" + "\n");
                        System.out.printf(" - la misma variable contra múltiples valores.                                                                               -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------  " + "\n");
                        break;
                    case 2:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Programa Switch                                                                                                       -" + "\n");
                        System.out.printf(" -     Determina la calificación de acuerdo al numero ingresado                                                              -" + "\n");
                        System.out.printf(" -     Si es 1 o 2 Su calificación es:F,Si es 3 o 4 Su calificación es:D,Si es 5 o 6 Su calificación es: C                   -" + "\n");
                        System.out.printf(" -     Si es 7 o 8 Su calificación es: B, Si es 9 o 10 Su calificación es: A                                                 -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------  " + "\n");

                        Scanner calificacion = new Scanner(System.in);
                        System.out.println("Ingrese calificación");
                        int cal = calificacion.nextInt();

                        switch (cal) {
                            case 1:
                            case 2:
                                System.out.println("Calificación F");
                                break;
                            case 3:
                            case 4:
                                System.out.println("Calificación D");
                                break;
                            case 5:
                            case 6:
                                System.out.println("Calificación C");
                                break;
                            case 7:
                            case 8:
                                System.out.println("Calificación B");
                                break;
                            case 9:
                            case 10:
                                System.out.println("Calificación A");
                                break;
                            default:
                                System.out.println("Número no válido, por favor verifique");
                        }
                    default:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");

                }
                break;

            case 7:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -             TERNARIA                  - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     1. Explicacion de ternaria        - " + "\n");
                System.out.printf(" -     2. Programa ternaria - Determina  - " + "\n");
                System.out.printf(" -     si un numero es par e impar       - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");

                Scanner te = new Scanner(System.in);
                System.out.println("ingresa la opcion que deseas");
                int t = te.nextInt();
                switch (t) {
                    case 1:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Explicacion de Ternaria                                                                                               -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" - El operador ternario en Java es una construcción que permite tomar decisiones basadas en una condición booleana de manera -" + "\n");
                        System.out.printf(" - concisa en una sola línea de código.                                                                                      -" + "\n");
                        System.out.printf(" -                                                                                                                           -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        break;
                    case 2:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Programa Ternaria                                                                                                     -" + "\n");
                        System.out.printf(" -     Determina si un numero es par o impar                                                                                 -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");

                        Scanner numero = new Scanner(System.in);
                        System.out.println("Ingrese número");
                        int n = numero.nextInt();

                        String resultado = (n % 2 == 0) ? "Par" : "Impar";
                        System.out.println("El número es:" + resultado);
                        break;
                    default:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");

                }
                break;

            case 8:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     DO WHILE                          - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     1. Explicacion de DO WHILE        - " + "\n");
                System.out.printf(" -     2. Programa DO WHILE - Adivina    - " + "\n");
                System.out.printf(" -     el numero                         - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");

                Scanner dw = new Scanner(System.in);
                System.out.println("ingresa la opcion que deseas");
                int d = dw.nextInt();
                switch (d) {
                    case 1:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Explicacion de DO WHILE                                                                                               -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" - La instrucción do-while permite ejecutar un bloque de código al menos una vez,                                            -" + "\n");
                        System.out.printf(" - y luego repetirlo mientras se cumpla una condición específica                                                             -" + "\n");
                        System.out.printf(" -                                                                                                                           -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        break;
                    case 2:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Programa DO WHILE                                                                                                     -" + "\n");
                        System.out.printf(" -     Adivina el numero                                                                                                     -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");

                        Scanner sdw = new Scanner(System.in);
                        int numeroAlea = ThreadLocalRandom.current().nextInt(1, 10);
                        int numeroUsuario;
                        int intentos = 0;

                        do {
                            System.out.print("Ingresa tu número: ");
                            numeroUsuario = sdw.nextInt();
                            intentos++;

                            if (numeroUsuario < numeroAlea) {
                                System.out.println("El número que he pensado es mayor.");
                            } else if (numeroUsuario > numeroAlea) {
                                System.out.println("El número que he pensado es menor.");
                            } else {
                                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                            }
                        }
                        while (numeroUsuario != numeroAlea);

                        break;

                    default:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");

                }
                break;
            case 9:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     WHILE                             - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     1. Explicacion de WHILE           - " + "\n");
                System.out.printf(" -     2. Programa WHILE                 - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");

                Scanner wh = new Scanner(System.in);
                System.out.println("ingresa la opcion que deseas");
                int w = wh.nextInt();
                switch (w) {
                    case 1:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Explicacion de  WHILE                                                                                                 -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" -  El bucle while permite repetir un bloque de código mientras                                                              -" + "\n");
                        System.out.printf(" -  se cumpla una condición específica                                                                                       -" + "\n");
                        System.out.printf(" -                                                                                                                           -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        break;
                    case 2:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Programa  WHILE                                                                                                       -" + "\n");
                        System.out.printf(" -   Realizar la sumatoria de los números enteros comprendidos entre el 1 y el numero ingresado es decir, 1 + 2 + 3 + …. +   -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");

                        Scanner wp = new Scanner(System.in);
                        System.out.println("ingresa hasta que numero quieres sumar");
                        int nu = wp.nextInt();

                        int contador = 1;
                        int suma = 0;

                        while (contador <= nu) {
                            suma = suma + contador;
                            contador++;
                            System.out.println("Suma = " + suma);
                        }
                        break;
                    default:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                }
                break;
            case 10:
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     FOR                               - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");
                System.out.printf(" -     1. Explicacion de FOR             - " + "\n");
                System.out.printf(" -     2. Programa FOR                   - " + "\n");
                System.out.printf(" ----------------------------------------- " + "\n");

                Scanner fo = new Scanner(System.in);
                System.out.println("ingresa la opcion que deseas");
                int f = fo.nextInt();
                switch (f) {
                    case 1:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Explicacion de FOR                                                                                                    -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        System.out.printf(" - El bucle for permite repetir un bloque de código un número específico de veces                                            -" + "\n");
                        System.out.printf(" -                                                                                                                           -" + "\n");
                        System.out.printf(" -                                                                                                                           -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");
                        break;
                    case 2:
                        System.out.printf(" -----------------------------------------------------------------------------------------------------------------------------" + "\n");
                        System.out.printf(" -     Programa FOR                                                                                                          -" + "\n");
                        System.out.printf(" -   Realizar la sumatoria de los números enteros comprendidos entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10             -" + "\n");
                        System.out.printf(" ---------------------------------------------------------------------------------------------------------------------------- " + "\n");

                        Scanner pf = new Scanner(System.in);
                        System.out.println("ingresa hasta que numero quieres sumar");
                        int nu = pf.nextInt();

                        int sum = 0;

                        for (int i = 1; i <= nu; i++) {
                            sum = sum + i;

                            System.out.println("Suma = " + sum);

                        }
                        break;

                    default:
                        System.out.printf(" ----------------------------------------- " + "\n");
                        System.out.printf(" -     OPCION NO VALIDA                  - " + "\n");
                        System.out.printf(" ----------------------------------------- " + "\n");
                }
                break;
            case 0:
                System.out.printf(" -     Nos vemos lk                      - " + "\n");
                break;
            default:
                System.out.println("No existe el capitulo, verificar el menu de arriba");

        }
    }
}
