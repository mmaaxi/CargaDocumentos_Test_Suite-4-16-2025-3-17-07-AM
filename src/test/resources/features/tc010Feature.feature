Feature: Registro en Bitácora de la Operación de Carga

  Scenario: Cargar un documento y verificar el registro en la bitácora
    Given el usuario está en la página de carga de documentos
    When el usuario carga un documento exitosamente
    Then se muestra un mensaje de éxito
    And la operación queda registrada en la bitácora del sistema con detalles