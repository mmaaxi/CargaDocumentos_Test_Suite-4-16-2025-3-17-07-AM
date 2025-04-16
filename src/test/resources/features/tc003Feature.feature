Feature: Verificación de Tamaño Máximo Permitido

  Scenario: Cargar un archivo que supere el tamaño máximo permitido
    Given El usuario está en la página de carga de archivos
    When Selecciona un archivo que supera el tamaño máximo permitido
    And Intenta cargar el archivo
    Then Se muestra un mensaje de error indicando que el archivo excede el límite de tamaño