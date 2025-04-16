Feature: Validación de Formato de Archivo

  Scenario: Subir archivo con formato erróneo
    Given El usuario selecciona un archivo con formato erróneo
    When El usuario intenta cargar el archivo
    Then El sistema muestra un mensaje de formato de archivo inválido