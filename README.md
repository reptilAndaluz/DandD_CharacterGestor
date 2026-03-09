# 🐉 D&D Java Character Manager - Roadmap

Este documento detalla las funcionalidades actuales y futuras del proyecto

## 🛠️ Estado del Proyecto Desarrollo

### 1. Motor de Atributos y Estadísticas 
- [x] **Sistema de Atributos:** Implementación de las 6 estadísticas base (STR, DEX, CON, INT, WIS, CHA).
- [x] **Calculadora de Modificadores:** Lógica automática para obtener bonos (ej. 10 -> 0, 12 -> +1).
- [ ] **Gestión de Salud (HP):** Sistema de vida actual, máxima y puntos temporales.
- [ ] **Cálculo de CA:** Lógica para Clase de Armadura según armadura equipada y destreza.
- [ ] **Iniciativa y Velocidad:** Cálculo dinámico basado en raza y stats.

### 2. Identidad y Progresión
- [ ] **Sistema de Razas:** Aplicación de rasgos (Ej: Visión en la oscuridad, bonos de stat).
- [ ] **Gestión de Clases:** Manejo de niveles, Dados de Golpe y rasgos de clase.
- [ ] **Bono de Competencia:** Escalado automático por nivel ($+2$ a $+6$).
- [ ] **Habilidades (Skills):** Listado de las 18 habilidades con cálculo de bonos y maestría.

### 3. Inventario y Equipo
- [ ] **Base de Datos de Objetos:** Clase abstracta `Item` y subclases `Weapon` y `Armor`.
- [ ] **Sistema de Carga:** Cálculo de peso total y estado de "Encumbrance".
- [ ] **Monedero:** Gestión de divisas (CP, SP, EP, GP, PP) con conversor.
- [ ] **Equipamiento Activo:** Lógica para "equipar/desequipar" objetos y afectar stats en tiempo real.

### 4. Magia y specs
- [ ] **Spellbook:** Lista de hechizos o artes marciales conocidas y preparados.
- [ ] **Gestores de Slots:** Contador de espacios de conjuro por nivel (1º a 9º).
- [ ] **Gestor de habilidades:** Lista de habilidades aprendidas dentro de un mismo Spec
- [ ] **Lógica de Descanso:** Botón de "Descanso Largo" para recuperar slots, HP y cooldowns.

### 5. Utilidades y Persistencia
- [ ] **Roller:** Generador aleatorio para dados $d4, d6, d8, d10, d12, d20, d100$.
- [ ] **Guardado JSON:** Serialización de la ficha a un archivo `.json`.
- [ ] **Carga de Ficha:** Reconstrucción del objeto `Personaje` desde un archivo.
- [ ] **Exportación PDF:** Generación de la hoja oficial rellena.

---

## Arquitectura
- **Lenguaje:** Java 17+
- **Persistencia:** Jackson Databind / GSON
