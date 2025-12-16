# 📚 School English - Sistema de Horarios

> Sistema de consulta de horarios para escuela de inglés según edad del alumno

## 📋 Descripción

Aplicación de consola en Java que asigna horarios de clases de inglés basándose en la edad del estudiante. El sistema permite realizar múltiples consultas sin necesidad de reiniciar el programa.

## 🎯 Funcionalidades

- 👤 Registro de nombre y edad del estudiante
- ⏰ Asignación automática de horarios según edad
- 🔄 Consultas múltiples sin reiniciar
- ✅ Validación de entrada de datos
- 🚫 Control de edades fuera del rango permitido

## 📅 Horarios por Grupo de Edad

| Rango de Edad | Días | Horario |
|---------------|------|---------|
| **4 - 6 años** | Lunes y Miércoles | 4:00 PM - 5:00 PM |
| **7 - 8 años** | Martes y Jueves | 4:30 PM - 5:30 PM |
| **9 - 10 años** | Martes y Jueves | 5:30 PM - 7:00 PM |
| **11 - 13 años** | Lunes y Miércoles | 5:00 PM - 6:30 PM |
| **< 4 años** | - | ❌ No disponible |
| **≥ 14 años** | - | ❌ No disponible |

## 🚀 Cómo usar

### Requisitos
- Java JDK 8 o superior

### Ejecución

```bash
# Compilar
javac schoolenglish/SchoolEnglish.java

# Ejecutar
java schoolenglish.SchoolEnglish
```

### Ejemplo de uso

```
Ingrese su nombre
> María García

Ingrese su edad
> 8
Martes y jueves de 4:30pm-5:30pm

---------------
Necesitas saber otro horario? SI/NO
> SI

Ingrese su nombre
> Juan Pérez

Ingrese su edad
> 12
Lunes y Miercoles de 5pm-6:30pm

---------------
Necesitas saber otro horario? SI/NO
> NO

Saliendo del programa...
```

## 🎓 Grupos de Edad

### 👶 Grupo Infantil (4-6 años)
- Clases más cortas
- Lunes y Miércoles
- Horario temprano: 4:00 PM

### 🧒 Grupo Primaria Inicial (7-8 años)
- Martes y Jueves
- 1 hora de clase

### 👦 Grupo Primaria Avanzada (9-10 años)
- Martes y Jueves
- Clases más largas: 1.5 horas

### 👧 Grupo Adolescentes (11-13 años)
- Lunes y Miércoles
- Horario intermedio

## 🛠️ Tecnologías

- Java SE
- Scanner para entrada de datos
- Manejo de excepciones (try-catch)
- Estructuras condicionales (if-else)
- Bucles (while)


## 👤 Autor

**Nicko699**
- GitHub: [@Nicko699](https://github.com/Nicko699)

---

💡 **Ejercicio simple de lógica para cualquier lenguaje de programación**
