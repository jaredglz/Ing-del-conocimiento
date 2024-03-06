import random

matriz = []
matriz_hijo = []

def iniciar_simulacion():
    global matriz, matriz_hijo
    generacion_actual = 1
    num_generaciones = 2
    formula = "-3*(x-1)**2 + 0.7*x + 3"
    genes = 8

    while generacion_actual <= num_generaciones:
        if generacion_actual == 1:
            print("\nGeneración:", generacion_actual)
            matriz = generar_y_imprimir_matriz(genes)
            matriz_hijo = []
            convertir_a_decimal(matriz)
            orden_ap = eval_aptitud(matriz, formula)
        else:
            print("\nGeneración:", generacion_actual)
            convertir_matriz_hijo_a_matriz(matriz_hijo)
            matriz_hijo = []
            convertir_a_decimal(matriz)
            orden_ap = eval_aptitud(matriz, formula)
        generacion_actual += 1

def eval_aptitud(matriz, formula):
    resultados = []
    total_aptitud = 0

    for i in range(len(matriz)):
        # Excluir bits en posición 0 y 9
        bits_excluidos = ''.join(map(str, matriz[i][1:-1]))
        valor_absoluto = int(bits_excluidos, 2)

        # Evaluar la fórmula de aptitud sustituyendo x con el valor decimal
        resultado = eval(formula.replace('x', str(valor_absoluto)))
        total_aptitud += resultado

        # Almacenar el resultado junto con el número de individuo
        resultados.append({"individuo": i + 1, "aptitud": resultado})

    # Mostrar la aptitud de cada individuo ordenado de mejor a peor estudiante
    print("\nAptitud para cada individuo ordenado de mejor a peor estudiante:")
    resultados.sort(key=lambda x: x["aptitud"], reverse=True)
    for resultado in resultados:
        print(f"Individuo {resultado['individuo']}: {resultado['aptitud']} {matriz[resultado['individuo'] - 1]}")

    # Llamar a cruzamiento y pasarle la matrizCruce y los resultados
    cruzamiento(resultados)

    # Retornar la matriz ordenada por aptitud
    return resultados

def cruzamiento(resultados):
    global matriz_hijo
    genes = len(matriz[0]) - 2  # Descontar bits en posición 0 y 9
    can_cruces = len(matriz) // 2

    # Cruzar el mejor con el segundo mejor, el mejor con el peor y asignar los demás a posiciones aleatorias
    for i in range(can_cruces):
        if i == 0:
            padre1 = resultados[0]["individuo"]
            padre2 = resultados[1]["individuo"]
        elif i == 1:
            padre1 = resultados[0]["individuo"]
            padre2 = resultados[-1]["individuo"]
        else:
            posiciones = obtener_posiciones_aleatorias(genes, resultados)
            padre1 = resultados[posiciones[0]]["individuo"]
            padre2 = resultados[posiciones[1]]["individuo"]

        # Almacenar los genes de padre1 y padre2
        gen_padre1 = matriz[padre1 - 1][:]
        gen_padre2 = matriz[padre2 - 1][:]

        # Imprimir la relación de cruces y los genes de los padres
        print(f"\nPadre {padre1}: {gen_padre1}  Padre {padre2}: {gen_padre2}")

        # Crear los hijos en base a la posición de cruce (punt_cruce)
        punt_cruce = random.randint(1, genes - 1)  # Nueva posición de cruce en cada iteración
        gen_hijo1 = gen_padre1[:punt_cruce] + gen_padre2[punt_cruce:]
        gen_hijo2 = gen_padre2[:punt_cruce] + gen_padre1[punt_cruce:]

        # Agregar los genes de los hijos a la matriz_hijo
        matriz_hijo.extend([gen_hijo1, gen_hijo2])

        # Imprimir los genes de los hijos
        print(f"Hijo 1:  {gen_hijo1}  Hijo 2:  {gen_hijo2}")
        # Imprimir la posición de corte después de cada cruce
        print(f"Punto de cruce: {punt_cruce}\n")

    # Llamar a mutacion y pasarle la matriz_hijo
    mutacion(matriz_hijo)

def convertir_matriz_hijo_a_matriz(matriz_hijo):
    global matriz
    matriz = matriz_hijo[:]
    # Imprimir la nueva matriz después del cruzamiento y mutación
    print("\nMatriz Generada con", len(matriz), "individuos (después del cruzamiento y mutación):")
    for i, individuo in enumerate(matriz):
        print(f"Individuo {i + 1}: {individuo}")

def mutacion(matriz_hijo):
    genes_por_individuo = len(matriz_hijo[0])
    total_genes = len(matriz_hijo) * genes_por_individuo
    cant_muta = round(0.02 * total_genes)  # Calcula el 2% de total_genes y redondea

    print("\nCantidad de genes a mutar (2% de totalGenes):", cant_muta)

    # Mutar genes de manera aleatoria
    for _ in range(cant_muta):
        fila = random.randint(0, len(matriz_hijo) - 1)
        columna = random.randint(0, genes_por_individuo - 1)

        # Cambiar el valor del gen seleccionado (0 a 1 o 1 a 0)
        matriz_hijo[fila][columna] = 1 - matriz_hijo[fila][columna]

    # Imprimir la matriz_hijo después de la mutación
    print("\nPoblacion final:")
    for individuo in matriz_hijo:
        print(individuo)

def obtener_posiciones_aleatorias(genes, orden_ap):
    posiciones = []

    for _ in range(2):
        pos = random.randint(0, len(orden_ap) - 1)

        # Asegurarse de que no elija la posición de los mejores
        while pos in posiciones:
            pos = random.randint(0, len(orden_ap) - 1)

        posiciones.append(pos)

    return posiciones

def generar_y_imprimir_matriz(genes):
    matriz = []

    # Crear la matriz
    for _ in range(genes):
        fila = [random.randint(0, 1) for _ in range(10)]
        matriz.append(fila)

    # Imprimir la matriz en pantalla
    print("\nMatriz Generada con", genes, "individuos:")
    for i, individuo in enumerate(matriz):
        print(f"Individuo {i + 1}: {individuo}")

    return matriz

def convertir_a_decimal(matriz):
    print("\nIndividuos en decimal (excluyendo bits en posición 0 y 9):")
    for i, individuo in enumerate(matriz):
        # Excluir bits en posición 0 y 9
        bits_excluidos = ''.join(map(str, individuo[1:-1]))
        valor_absoluto = int(bits_excluidos, 2)

        decimal = valor_absoluto

        if individuo[0] == 0:
            decimal = -decimal  # Si el bit en la posición 0 es 0, cambiamos el signo del decimal

        if individuo[9] == 1:
            decimal += 0.5  # Si el bit en la posición 9 es 1, sumamos 0.5 al decimal

        print(f"Individuo {i + 1}: {decimal}")

# Iniciar la simulación
iniciar_simulacion()