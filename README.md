# Sistema Académico UTA - Introducción a la Programación Orientada a Objetos (POO)

## 📌 Descripción y Objetivo del Proyecto
Este proyecto corresponde al desarrollo del primer componente del sistema académico para la **Universidad Técnica de Ambato (UTA)**. El objetivo principal es comprender y aplicar los conceptos fundamentales de la Programación Orientada a Objetos (POO) mediante el diseño e implementación de la clase `Estudiante` en Java, reconociendo sus atributos, instanciando objetos independientes y evidenciando el trabajo colaborativo distribuido en **GitHub**.

---

## 👥 Integrantes y Distribución de Roles

| Integrante | Rol en el Proyecto | Responsabilidades Principales |
| :--- | :--- | :--- |
| **Joseph** | Integrante 1: Líder de Repositorio y Arquitectura Base | Configuración inicial del proyecto Java, `.gitignore`, repositorio GitHub y teoría (Actividad 1: P1, P2 y Ejemplo). |
| **Steeve** | Integrante 2: Diseñador UML y Modelador de Datos | Especificación técnica de atributos y elaboración del diagrama de clase (`docs/diagrama_clase.png`) (Actividad 2). |
| **Joel Pacha** | Integrante 3: Programador - Clase Modelo | Implementación en Java de la clase `Estudiante.java` y teoría (Actividad 1: P3, P4 y P5). |
| **Leyber** | Integrante 4: Programador - Ejecución e Instanciación | Creación de la clase `Principal.java`, instanciación de objetos y capturas de consola (`docs/evidencia_ejecucion.png`) (Actividad 3). |
| **Matías** | Integrante 5: Documentador de GitHub | Estructuración y redacción del `README.md`, integración de roles y reflexión final (Actividades 4 y 5). |
| **Marlon** | Integrante 6: Consolidador y Control de Calidad | Ensamblaje del documento PDF para Moodle, verificación de compilación/commits y revisión final del `README.md`. |

---

## 📁 Estructura del Repositorio

```text
POO-Tema1-GrupoN/
│
├── docs/
│   ├── diagrama_clase.png       # Diagrama UML de la clase Estudiante (Steeve)
│   └── evidencia_ejecucion.png  # Captura de pantalla del programa en ejecución (Leyber)
│
├── src/
│   ├── Estudiante.java          # Clase modelo con los 5 atributos (Joel Pacha)
│   └── Principal.java           # Clase ejecutable con el método main (Leyber)
│
├── .gitignore                   # Archivos excluidos del control de versiones (Joseph)
└── README.md                    # Documentación general del proyecto (Matías / Marlon)


```
## 🚀 Instrucciones de Clonación y Ejecución

Sigue estos pasos para clonar, compilar y ejecutar el proyecto desde la terminal o tu IDE de preferencia (Visual Studio Code, Apache NetBeans, IntelliJ IDEA):

### Prerrequisitos
* **Java Development Kit (JDK):** Versión 11 o superior instalada.
* **Git:** Instalado en el sistema operativo.

### Step-by-Step

1. **Clonar el repositorio:**
   Abre tu terminal y ejecuta el siguiente comando:
   ```bash
   git clone https://github.com
   ```

2. **Abrir el proyecto:**
   Abre la carpeta del proyecto en tu IDE favorito (NetBeans, VS Code o IntelliJ IDEA).

3. **Ejecutar el programa:**
   Busca el archivo `Principal.java` dentro de la carpeta `src`, dale clic derecho y selecciona **Run File** (o Ejecutar).
   
## Actividad 2: Diagrama de Clase Estudiante

### Objetivo
Diseñar la clase Estudiante para el sistema académico de la Universidad Técnica de Ambato, identificando sus atributos y tipos de datos mediante UML.

### Atributos

| Atributo | Tipo | Descripción | Ejemplo |
|---|---|---|---|
| nombre | String | Nombre del estudiante | Carlos |
| apellido | String | Apellido del estudiante | Pérez |
| edad | int | Edad en años cumplidos | 20 |
| carrera | String | Carrera universitaria | Software |
| semestre | int | Semestre académico actual | 2 |

### Validaciones propuestas
- nombre y apellido: no deben estar vacíos.
- edad: número entero positivo; se propone de 15 a 100 años para este ejercicio.
- carrera: debe corresponder a una carrera registrada.
- semestre: entero desde 1 hasta el máximo permitido por la carrera.

### Diagrama UML
![Diagrama UML de Estudiante](documentos/diagrama_clase.png)

### Código fuente PlantUML
[Ver diagrama_clase.puml](documentos/diagrama_clase.puml)

### Conclusión
El diagrama UML representa la estructura de la clase Estudiante con cinco atributos privados y permite orientar su implementación posterior en Java.
