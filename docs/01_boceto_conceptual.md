# Boceto conceptual (Library API)

## Propósito
Una **Library** (biblioteca) gestiona una colección de **Books** (libros).

## Conceptos mínimos
- **Library**
    - Contenedor lógico.
    - Tiene identidad y un nombre.
- **Book**
    - Unidad gestionada.
    - Tiene identidad, título y autor.

## Reglas de relación (conceptuales)
- Una **Library** puede tener **muchos Books**.
- Un **Book** pertenece a **una sola Library**.

## Alcance del primer micro-sprint
- Persistencia en H2.
- Más adelante: endpoints básicos para crear y listar libros.
