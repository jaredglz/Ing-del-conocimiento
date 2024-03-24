package universofrutas;

import java.util.Scanner;

public class UniversoFrutas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        FrutasTropicales tropicales = new FrutasTropicales();
        FrutasCitricas citricas = new FrutasCitricas();
        FrutasHueso fhueso = new FrutasHueso();
        FrutasPepita pepitas = new FrutasPepita();
        Bayas bayas = new Bayas();
        FrutasSubTropicales stropicales = new FrutasSubTropicales();
        int respuesta;
        boolean continuar = true;

        try {
            System.out.println("Cargando...");
            // Simula una carga de 1 segundo
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("BIENVENIDO AL UNIVERSO DE FRUTAS");
        while (continuar) {
            System.out.println("Comencemos");
            System.out.println("Responde con 1 para sí y con 0 para no");
            System.out.println("¿Es una fruta tropical?");
            respuesta = obtenerRespuesta(teclado);
            if (respuesta == 1) {
                tropicales.FrutasTropicales();
                continuar = false;
            } else if (respuesta == 0) {
                System.out.println("¿Es una fruta cítrica?");
                respuesta = obtenerRespuesta(teclado);
                if (respuesta == 1) {
                    citricas.FrutasCitricas();
                    continuar = false;
                } else if (respuesta == 0) {
                    System.out.println("¿Tiene hueso?");
                    respuesta = obtenerRespuesta(teclado);
                    if (respuesta == 1) {
                        fhueso.FrutasHueso();
                        continuar = false;
                    } else if (respuesta == 0) {
                        System.out.println("¿Se considera una pepita?");
                        respuesta = obtenerRespuesta(teclado);
                        if (respuesta == 1) {
                            pepitas.FrutasPepita();
                            continuar = false;
                        } else if (respuesta == 0) {
                            System.out.println("¿Tu fruta es una baya?");
                            respuesta = obtenerRespuesta(teclado);
                            if (respuesta == 1) {
                                bayas.Bayas();
                                continuar = false;
                            } else if (respuesta == 0) {
                                System.out.println("¿Se da en climas subtropicales o templados?");
                                respuesta = obtenerRespuesta(teclado);
                                if (respuesta == 1) {
                                    stropicales.FrutasTropicales();
                                    continuar = false;
                                } else if (respuesta == 0) {
                                    System.out.println("¿Seguro que quieres jugar?");
                                    System.out.println("Vuelve a intentarlo y asegúrate de conocer bien la fruta");
                                    continuar = false; // Terminar el juego si no se conoce la fruta
                                }
                            }
                        }
                    }
                }
            } 
        }
    }
    
    // Método para obtener la respuesta, solo permite 1 o 0
    public static int obtenerRespuesta(Scanner teclado) {
        int respuesta;
        do {
            respuesta = teclado.nextInt();
            if (respuesta != 0 && respuesta != 1) {
                System.out.println("Por favor, responde con 1 para sí o 0 para no");
            }
        } while (respuesta != 0 && respuesta != 1);
        return respuesta;
    }
}
