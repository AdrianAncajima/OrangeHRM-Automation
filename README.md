# Reto de Automatización con Playwright

Este proyecto tiene como objetivo automatizar el proceso de creación de un nuevo empleado en la pagina web OrangeHRM utilizando Playwright.

# Tener en cuenta herramientas y frameworks utilizados
- Intellij Idea
- Java
- Patron de diseño POM
- Playwright - Dependencias
- Cucumber
# Objetivos del Reto
- Automatizar el flujo de trabajo para la creación de personal en OrangeHRM.
- Verificar la funcionalidad a través de casos de prueba.
# Casos de Prueba

# Caso de Prueba 1: Acceso al Sistema OrangeHRM
- Descripción: Verificar que el usuario puede acceder al sistema correctamente.
- Pasos:
    1. Navegar a la URL de inicio de sesión.
    2. Ingresar credenciales válidas (usuario y contraseña).
    3. Hacer clic en el botón de inicio de sesión.
- **Resultado Esperado**: El usuario es redirigido al panel de control de OrangeHRM.
# Caso de Prueba 2: Navegar a la Sección de "Añadir Personal"
- Descripción: Confirmar que el usuario puede acceder a la sección de "Añadir Personal".
- Pasos:
    1. Acceder al menú "PIM".
    2. Hacer clic en "Añadir Personal".
- Resultado Esperado: La página de "Añadir Personal" se carga correctamente.
# Caso de Prueba 3: Crear Nuevo Personal con Datos Válidos
- Descripción: Validar que el sistema permite crear un nuevo empleado con datos válidos.
- Pasos:
    1. Completar todos los campos obligatorios con datos válidos (nombre, apellido, codigoEmpleado).
    2. Hacer clic en el botón "Guardar".
- Resultado Esperado: Se muestra un mensaje de confirmación y muestra el nuevo empleado creado.

# Caso de Prueba 4: Buscar Empleado Existente y validar
- Descripción: Verificar que el usuario puede buscar un empleado existente en la lista.
- Pasos:
    1. Navegar a la sección "PIM".
    2. Hacer clic en "Lista de Empleados".
    3. Ingresar el nombre completo en el campo de búsqueda.
    4. Hacer clic en el botón de búsqueda.
- Resultado Esperado: La lista se actualiza para mostrar el empleado correspondiente a los criterios de búsqueda.

## Técnicas de Diseño de Caso de Prueba Utilizadas

1. Técnica de Particionamiento Equivalente
2. Técnica de Tabla de Decisión
3. Técnica de Exploración
## Siguientes Pasos

Con los casos de prueba definidos, se procederá a escribir los scripts de automatización en Playwright para llevar a cabo cada uno de estos escenarios.
