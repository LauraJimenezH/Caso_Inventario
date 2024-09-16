# Caso_Inventario

# Tarea en Grupo: Programa de Control de Inventario Básico con Clasificación de Productos

## Objetivo:
El objetivo de esta tarea es que los estudiantes trabajen en equipo para desarrollar un programa de control de inventario básico que les permita practicar el uso de estructuras secuenciales, condicionales y la estructura `switch`, sin usar arreglos ni estructuras repetitivas (bucles). Los estudiantes deberán discutir y compartir ideas de solución.

## Descripción:
Una tienda necesita un sistema básico que permita gestionar su inventario. El programa debe permitir ingresar hasta 5 productos y realizar una serie de cálculos y clasificaciones según los datos ingresados. Las funcionalidades principales que el programa debe cumplir son:

### 1. **Entrada de Datos**:
   El programa solicitará al usuario la siguiente información para **exactamente 5 productos** (para lo cual se creara gran cantidad de variables, pero ese es el objetivo del ejercicio en base a los temas tratados en el curso):
   - **Nombre del producto**.
   - **Cantidad en inventario** (número de unidades disponibles).
   - **Precio unitario** del producto.
   - **Categoría** del producto, la cual será seleccionada por el usuario:
     - **1**: Productos electrónicos
     - **2**: Alimentos
     - **3**: Ropa

### 2. **Cálculo del Valor Total del Inventario**:
   El sistema calculará el valor total del inventario para cada producto, usando la fórmula:
   ```bash
   valor_total = cantidad * precio_unitario
   ```

### 3. **Descuento por Cantidad**:
   Se aplicará un descuento en base a la cantidad de productos en inventario:
   - **10% de descuento** si la cantidad es **mayor a 50 unidades**.
   - **20% de descuento** si la cantidad es **mayor a 100 unidades**.
   - **No se aplica descuento** si la cantidad es menor o igual a 50.

   **Ejemplo**:
   Si la cantidad es 60 y el precio unitario es 1200, el valor total es 72,000. Con el descuento del 10%, el valor final será 64,800.

### 4. **Clasificación de Productos (Usar `switch`)**:
   Dependiendo de la categoría seleccionada para el producto, el programa debe mostrar un mensaje adicional utilizando la estructura `switch`:
   - **Categoría 1 (Electrónicos)**: Mostrar el mensaje:
     ```bash
     Producto electrónico. Revisar garantía.
     ```
   - **Categoría 2 (Alimentos)**: Mostrar el mensaje:
     ```bash
     Producto alimenticio. Revisar fecha de caducidad.
     ```
   - **Categoría 3 (Ropa)**: Mostrar el mensaje:
     ```bash
     Producto de ropa. Revisar tallas disponibles.
     ```

### 5. **Toma de Decisiones**:
   El programa deberá evaluar si el valor total del inventario de un producto, **después de aplicar los descuentos**, supera los **500 soles**.Si es así, deberá mostrar el siguiente mensaje:

   ```bash
   Atención: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.
   ```

### 6. **Salida de Datos**:
   Al final, el programa debe mostrar un **resumen del inventario** para los 5 productos ingresados, que incluirá:
   - Nombre de cada producto.
   - Cantidad en inventario.
   - Precio unitario.
   - Valor total del inventario (con descuento aplicado si corresponde).
   - Mensaje correspondiente a la categoría (según el `switch`).
   - Mensaje de advertencia si el valor supera los 500 soles.
   - 
## Requisitos:
- Utilizar estructuras secuenciales, condicionales (`if`, `else`, `else if`), y `switch`.
- No usar arreglos ni estructura repetitivas
- El código debe estar bien documentado con comentarios explicando que realiza y seguir buenas prácticas de programación.
