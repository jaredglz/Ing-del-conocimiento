package universofrutas;

import java.util.Scanner;

public class FrutasPepita {

    public FrutasPepita() {
    }

    public void FrutasPepita() {
        Scanner teclado = new Scanner(System.in);
        int respuesta;
        boolean continuar = true;

        try {
            System.out.println("Cargando preguntas...");
            // Simula una carga de 3 segundos
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        while (continuar) {
            System.out.println("¿Tiene vitamina C?");
            respuesta = leerRespuesta(teclado);
            if (respuesta == 1) {
                System.out.println("¿Puede ser de color amarillo, verde o rojo?");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("¿Tiene un sabor dulce o ácido según variedad?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("Tu fruta es la MANZANA");
                        continuar = false;
                    } else {
                        System.out.println("¿Tiene forma de bombilla?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Tu fruta es la PERA");
                            continuar = false;
                        } else {
                            System.out.println("Lo siento, no logro identificar la fruta. Inténtalo de nuevo");
                        }
                    }
                } else {
                    System.out.println("¿Es de color rojo?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("¿Sus semillas interiores son comestibles?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Tu fruta es la GRANADA");
                            continuar = false;
                        } else {
                            System.out.println("Lo siento, no logro identificar la fruta. Inténtalo de nuevo");
                        }
                    } else {
                        System.out.println("No cuento con frutas de otros colores dentro de esta categoría");
                        System.out.println("Inténtalo de nuevo");
                    }
                }
            } else if (respuesta == 0) {
                System.out.println("Quizá la fruta que piensas pertenece a otra categoría");
                System.out.println("Inténtalo de nuevo");
                continuar = false;
            } else {
                System.out.println("Respuesta no válida. Por favor, responde con 1 para sí y con 0 para no");
            }
        }
    }

    private int leerRespuesta(Scanner teclado) {
        int respuesta;
        do {
            System.out.print("Respuesta: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, ingresa 1 para 'sí' o 0 para 'no'");
                teclado.next();
            }
            respuesta = teclado.nextInt();
        } while (respuesta != 0 && respuesta != 1);
        return respuesta;
    }
}
