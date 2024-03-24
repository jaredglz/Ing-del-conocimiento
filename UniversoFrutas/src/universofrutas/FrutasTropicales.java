package universofrutas;

import java.util.Scanner;

public class FrutasTropicales {

    public FrutasTropicales() {
    }

    public void FrutasTropicales() {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        try {
            System.out.println("Cargando preguntas...");
            // Simula una carga de 2 segundos
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        while (continuar) {
            System.out.println("Responde con 1 para sí y con 0 para no");
            System.out.println("¿Es de color amarillo?");
            int respuesta = leerRespuesta(teclado);
            if (respuesta == 1) {
                System.out.println("¿La fruta tiene forma de estrella?");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("Estabas pensando en la FRUTA ESTRELLA");
                    continuar = false;
                } else {
                    System.out.println("¿Tiene cascara delgada y espinosa?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("Sus semillas son de color blanco");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Estabas pensando en la FRUTA KIWANO");
                            continuar = false;
                        } else {
                            System.out.println("No logro percibir la fruta que estas pensando, intentalo de nuevo");
                        }
                    } else {
                        System.out.println("¿Tiene hueso?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Estabas pensando en un MANGO");
                            continuar = false;
                        } else {
                            System.out.println("¿Tiene cáscara o piel dura?");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("¿Tiene un sabor agridulce?");
                                respuesta = leerRespuesta(teclado);
                                if (respuesta == 1) {
                                    System.out.println("¿Tiene semillas por dentro?");
                                    respuesta = leerRespuesta(teclado);
                                    if (respuesta == 1) {
                                        System.out.println("Estabas pensando en la FRUTA MARACUYÁ");
                                        continuar = false;
                                    } else {
                                        System.out.println("Estabas pensando en un MEMBRILLO");
                                        continuar = false;
                                    }
                                } else {
                                    System.out.println("¿Tiene forma alargada?");
                                    respuesta = leerRespuesta(teclado);
                                    if (respuesta == 1) {
                                        System.out.println("Tu fruta es un PLÁTANO");
                                        continuar = false;
                                    } else {
                                        System.out.println("No logro percibir la fruta que estas pensando, intentalo de nuevo");
                                    }
                                }
                            } else {
                                System.out.println("No logro percibir la fruta que estas pensando, intentalo de nuevo");
                            }
                        }
                    }
                }
            } else {
                System.out.println("¿Es de color rojo?");
                respuesta = leerRespuesta(teclado);
                if (respuesta == 1) {
                    System.out.println("¿Tiene espinas en su cáscara?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("Estabas pensando en el RAMBUTÁN");
                        continuar = false;
                    } else {
                        System.out.println("¿Su pulpa es translúcida y jugosa?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Estabas pensando en la FRUTA LICHI");
                            continuar = false;
                        } else {
                            System.out.println("No puedo creer que no pensaras en el lichi, aclara tus ideas e intentalo de nuevo");
                        }
                    }
                } else {
                    System.out.println("¿Por fuera es de color verde?");
                    respuesta = leerRespuesta(teclado);
                    if (respuesta == 1) {
                        System.out.println("¿Tiene espinas?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("Es blanca por dentro");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                                                System.out.println("Estabas pensando en la GUANÁBANA");
                                continuar = false;
                            } else {
                                System.out.println("No identifico qué fruta estás pensando, inténtalo de nuevo");
                            }
                        } else {
                            System.out.println("¿Es roja por dentro?");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("¿Tiene semillas negras por dentro?");
                                respuesta = leerRespuesta(teclado);
                                if (respuesta == 1) {
                                    System.out.println("Tu fruta es la SANDÍA");
                                    continuar = false;
                                } else {
                                    System.out.println("No identifico qué fruta estás pensando, inténtalo de nuevo");
                                }
                            } else {
                                System.out.println("No identifico qué fruta estás pensando, inténtalo de nuevo");
                            }
                        }
                    } else {
                        System.out.println("¿Es de color naranja?");
                        respuesta = leerRespuesta(teclado);
                        if (respuesta == 1) {
                            System.out.println("¿Tiene semillas negras en su interior?");
                            respuesta = leerRespuesta(teclado);
                            if (respuesta == 1) {
                                System.out.println("Estabas pensando en la PAPAYA");
                                continuar = false;
                            } else {
                                System.out.println("¿Su cáscara es gruesa?");
                                respuesta = leerRespuesta(teclado);
                                if (respuesta == 1) {
                                    System.out.println("¿Sus gajos son de color rosa?");
                                    respuesta = leerRespuesta(teclado);
                                    if (respuesta == 1) {
                                        System.out.println("Estabas pensando en una TORONJA");
                                        continuar = false;
                                    } else {
                                        System.out.println("Tu fruta es la NARANJA");
                                        continuar = false;
                                    }
                                } else {
                                    System.out.println("¿Se considera un híbrido?");
                                    respuesta = leerRespuesta(teclado);
                                    if (respuesta == 1) {
                                        System.out.println("Tu fruta es el TANGELO");
                                        continuar = false;
                                    } else {
                                        System.out.println("¿Es fácil de pelar?");
                                        respuesta = leerRespuesta(teclado);
                                        if (respuesta == 1) {
                                            System.out.println("Tu fruta es la MANDARINA");
                                            continuar = false;
                                        } else {
                                            System.out.println("¿Estás seguro que conoces la fruta?");
                                            System.out.println("Inténtalo de nuevo");
                                        }
                                    }
                                }
                            }
                        } else {
                            System.out.println("Parece que la fruta que buscas no pertenece a esta categoría");
                            continuar = false;
                        }
                    }
                }
            }
        }
    }

    private int leerRespuesta(Scanner teclado) {
        int respuesta;
        do {
            System.out.print("Respuesta (1 para sí, 0 para no): ");
            while (!teclado.hasNextInt()) {
                System.out.println("Por favor, ingresa 1 para 'sí' o 0 para 'no'");
                System.out.print("Respuesta (1 para sí, 0 para no): ");
                teclado.next(); // consume la entrada incorrecta
            }
            respuesta = teclado.nextInt();
        } while (respuesta != 0 && respuesta != 1);
        return respuesta;
    }

    public static void main(String[] args) {
        FrutasTropicales juego = new FrutasTropicales();
        juego.FrutasTropicales();
    }
}

