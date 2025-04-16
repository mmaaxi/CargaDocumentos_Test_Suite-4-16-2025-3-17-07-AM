Feature: Prueba de Rendimiento en Cargas Pesadas

  Scenario: Cargar un archivo grande
    Given el usuario está en la página de carga de archivos
    When selecciona un archivo grande
    Then el archivo es reconocido como de gran tamaño
    When inicia la carga del archivo
    Then el sistema gestiona la carga en un tiempo aceptable sin crasheos