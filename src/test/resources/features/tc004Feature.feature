Feature: Manejo de Archivo Corrupto o Dañado

  Scenario: Intentar cargar un archivo corrupto
    Given el usuario selecciona un archivo corrupto
    When el usuario intenta cargar el archivo
    Then el sistema informa sobre la corrupción del archivo y la carga falla