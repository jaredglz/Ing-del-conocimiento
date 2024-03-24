package universofrutas;

import java.util.Scanner;

public class FrutasSubTropicales {

    public FrutasSubTropicales() {
    }

    public void FrutasTropicales() {
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
            System.out.println("¿Puede ser de color verde, morado o negro? ");
            respuesta = leerRespuesta(teclado);
            if (respuesta == 1) {
                System.out.println("¿Tiene forma redonda?");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("¿Tiene múltiples semillas comestibles en su interior?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("Tu fruta es el HIGO");
                        continuar = false;
                    } else {
                        System.out.println("¿Crece en racimos?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Tu fruta con las UVAS");
                            continuar = false;
                        } else {
                            System.out.println("Lo siento no logro identificar la fruta, intentalo de nuevo");
                        }
                    }
                } else {
                    System.out.println("Lo siento no logro identificar la fruta, intentalo de nuevo");
                }
            } else if (respuesta == 0) {
                System.out.println("¿Es de color amarillo? ");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("¿Tiene forma redonda? ");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("¿Tiene semillas comestibles por dentro? ");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Tu fruta es la GRANADILLA");
                            continuar = false;
                        } else {
                            System.out.println("¿Tiene gajos? ");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("Tu fruta es el POMELO");
                                continuar = false;
                            } else {
                                System.out.println("Lo siento no logro identificar la fruta, intentalo de nuevo");
                            }
                        }
                    } else {
                        System.out.println("Lo siento no logro identificar la fruta, intentalo de nuevo");
                    }
                } else {
                    System.out.println("¿Puede ser color rojo oscuro o negro? ");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("¿Tiene un sabor agridulce? ");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Tu fruta es la ZARZAMORA");
                            continuar = false;
                        } else {
                            System.out.println("Lo siento no logro identificar la fruta, intentalo de nuevo");
                        }
                    } else {
                        System.out.println("¿Es de color rojo? ");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("¿Tiene aquenios en su exterior? ");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("Tu fruta es la FRESA");
                                continuar = false;
                            } else {
                                System.out.println("Lo siento no logro identificar la fruta, intentalo de nuevo");
                            }
                        } else {
                            System.out.println("¿Su cáscara es de color beige, amarillo o verde? ");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("¿Es de color naranja por dentro? ");
                                respuesta = leerRespuesta(teclado);
                                if (respuesta == 1) {
                                    System.out.println("¿Tiene semillas en su interior? ");
                                    respuesta = leerRespuesta(teclado);
                                    if (respuesta == 1) {
                                        System.out.println("Tu fruta es un MELÓN");
                                        continuar = false;
                                    } else {
                                        System.out.println("Lo siento no logro identificar la fruta, intentalo de nuevo");
                                    }
                                } else {
                                    System.out.println("Lo siento no logro identificar la fruta, intentalo de nuevo");
                                }
                            } else {
                                System.out.println("Quizá la fruta que piensas pertenece a otra categoría");
                                System.out.println("Intentalo de nuevo");
                                continuar = false;
                            }
                        }
                    }
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
