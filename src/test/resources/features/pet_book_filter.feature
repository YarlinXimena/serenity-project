# language: es
Característica: Visualizar Animales
  Como usuario de pet-book
  Quiero poder visualizar unicamente los animales que seleccione dentro de la web
  Para ver si son bonitos y los deseo adoptar

  Escenario: Filtro perros correcto
    Cuando El Usuario da click en la opcion perros
    Entonces debe ver los perros en petbook

  Escenario: Filtro gatos correcto
    Cuando El Usuario da click en la opcion gatos
    Entonces debe ver los gatos en petbook
