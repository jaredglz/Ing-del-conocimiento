package universofrutas;

import java.util.Scanner;

public class FrutasCitricas {

    public FrutasCitricas() {
    }

    public void FrutasCitricas() {
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
            System.out.println("Responde con 1 para sí y con 0 para no");
            System.out.println("¿Es de color amarillo?");
            respuesta = leerRespuesta(teclado);
            if (respuesta == 1) {
                System.out.println("Tu fruta es la LIMA");
                continuar = false;
            } else if (respuesta == 0) {
                System.out.println("¿Es de color verde? ");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("Tu fruta es el LIMÓN");
                    continuar = false;
                } else if (respuesta == 0) {
                    System.out.println("Parece que la fruta que buscas no pertenece a esta categoría");
                    continuar = false;
                }
            }
        }
    }

    private int leerRespuesta(Scanner teclado) {
        int respuesta;
        do {
            System.out.print("Respuesta: ");
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, ingresa 1 para 'sí' o 0 para 'no'");
                System.out.print("Respuesta: ");
                teclado.next();
            }
            respuesta = teclado.nextInt();
        } while (respuesta != 0 && respuesta != 1);
        return respuesta;
    }
}
