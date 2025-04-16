Feature: Carga Múltiple de Documentos

  Scenario: Carga de varios documentos de manera exitosa
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona varios archivos válidos
    Then los archivos seleccionados se muestran preparados para la carga múltiple
    When el usuario realiza la acción de cargar
    Then todos los documentos se cargan correctamente
    And se muestran mensajes de confirmación para cada documento cargado