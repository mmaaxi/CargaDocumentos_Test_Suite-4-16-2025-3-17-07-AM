Feature: File upload validation
  Scenario: Notificación de Error por Extensión Inválida
    Given un archivo con extensión ".xyz"
    When el usuario intenta cargar el archivo
    Then el sistema debe mostrar un mensaje de error indicando que la extensión no es admitida