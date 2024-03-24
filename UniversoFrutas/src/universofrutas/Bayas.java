package universofrutas;

import java.util.Scanner;

public class Bayas {

    public Bayas() {
    }

    public void Bayas() {
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
            System.out.println("¿Es de color morado o azul?");
            respuesta = leerRespuesta(teclado);
            if (respuesta == 1) {
                System.out.println("¿Tiene piel lisa?");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("Tu fruta es el ARÁNDANO");
                    continuar = false;
                } else {
                    System.out.println("No logro percibir la fruta en la que estás pensando");
                    System.out.println("Inténtalo de nuevo");
                }
            } else if (respuesta == 0) {
                System.out.println("Es de color rojo oscuro o morado");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("¿Su sabor es agridulce?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("Tu fruta es la MORA");
                        continuar = false;
                    } else {
                        System.out.println("No logro percibir la fruta en la que estás pensando");
                        System.out.println("Inténtalo de nuevo");
                    }
                } else if (respuesta == 0) {
                    System.out.println("¿Puede ser de color rosa, rojo o negro?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("¿Es pequeña y redonda?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Tu fruta es la GROSELLA");
                            continuar = false;
                        } else {
                            System.out.println("No logro percibir la fruta en la que estás pensando");
                            System.out.println("Inténtalo de nuevo");
                        }
                    } else if (respuesta == 0) {
                        System.out.println("¿Es de color rojo claro?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Tiene piel aterciopelada");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("Tu fruta es la FRAMBUESA");
                                continuar = false;
                            } else {
                                System.out.println("No logro percibir la fruta en la que estás pensando");
                                System.out.println("Inténtalo de nuevo");
                            }
                        } else if (respuesta == 0) {
                            System.out.println("Asegúrate de conocer bien la fruta que pensaste e inténtalo de nuevo");
                            continuar = false;
                        } else {
                            System.out.println("Respuesta no válida. Por favor, responde con 1 para sí y con 0 para no");
                        }
                    } else {
                        System.out.println("Respuesta no válida. Por favor, responde con 1 para sí y con 0 para no");
                    }
                } else {
                    System.out.println("Respuesta no válida. Por favor, responde con 1 para sí y con 0 para no");
                }
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
