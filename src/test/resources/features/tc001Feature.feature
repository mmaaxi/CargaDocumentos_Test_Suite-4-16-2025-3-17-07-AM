Feature: Carga Exitosa de Documento

  Scenario: Usuario carga un documento válido con éxito
    Given El usuario está en la página de carga de documentos
    When El usuario selecciona un archivo válido
    And El usuario hace clic en 'Cargar'
    Then El documento se carga correctamente y se muestra un mensaje de éxito