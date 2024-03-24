package universofrutas;

import java.util.Scanner;

public class FrutasHueso {

    public FrutasHueso() {
    }

    public void FrutasHueso() {
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
            System.out.println("¿Tiene forma redonda?");
            respuesta = leerRespuesta(teclado);
            if (respuesta == 1) {
                System.out.println("¿Es de color rojo y/o amarillo?");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("¿Tiene piel aterciopelada?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("¿Tiene un sabor dulce?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Tu fruta es el DURAZNO");
                            continuar = false;
                        } else {
                            System.out.println("No conozco otra fruta con estas características a parte del durazno");
                            System.out.println("Intentalo de nuevo");
                        }
                    } else {
                        System.out.println("¿Tiene piel lisa? ");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("¿Tiene vitamina C? ");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("Tu fruta es la NECTARINA");
                                continuar = false;
                            } else {
                                System.out.println("Creí que pensabas en la NECTARINA");
                                System.out.println("Intentalo de nuevo");
                            }
                        } else {
                            System.out.println("No logro identificar la fruta en la que estás pensando");
                            System.out.println("Intentalo de nuevo");
                        }
                    }
                } else {
                    System.out.println("¿Es de color amarillo o anaranjado?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("¿Suele tener puntos color café en su exterior al madurarse?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Tu fruta es el TEJOCOTE");
                            continuar = false;
                        } else {
                            System.out.println("¿Es dulce y de tamaño pequeño?");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("Tu fruta es el CHABACANO");
                                continuar = false;
                            } else {
                                System.out.println("No logro identificar la fruta en la que estás pensando");
                                System.out.println("Intentalo de nuevo");
                            }
                        }
                    } else {
                        System.out.println("¿Es de color rojo?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("¿Tiene un sabor dulce?");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("Además del color rojo ¿puede ser de color verde, morado, amarillo o azul?");
                                respuesta = leerRespuesta(teclado);
                                if (respuesta == 1) {
                                    System.out.println("Tu fruta es la CIRUELA");
                                    continuar = false;
                                } else {
                                    System.out.println("Tu fruta es la CEREZA");
                                    continuar = false;
                                }
                            } else {
                                System.out.println("No logro identificar la fruta en la que estás pensando");
                                System.out.println("Intentalo de nuevo");
                            }
                        } else {
                            System.out.println("No logro identificar la fruta en la que estás pensando");
                            System.out.println("Intentalo de nuevo");
                        }
                    }
                }
            } else {
                System.out.println("¿Tiene forma alargada y ovalada?");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("¿Es color café y tiene textura arrugada?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("Tu fruta es un DÁTIL");
                        continuar = false;
                    } else {
                        System.out.println("Creí que pensabas en un dátil, intentalo de nuevo");
                    }
                } else {
                    System.out.println("Quizá tu fruta pertenece a otra categoría");
                    System.out.println("Intentalo de nuevo");
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
                teclado.next();
            }
            respuesta = teclado.nextInt();
        } while (respuesta != 0 && respuesta != 1);
        return respuesta;
    }
}
