Feature: Cancelación Durante el Proceso de Carga

  Scenario: Cancelar la carga de un documento
    Given el usuario tiene un documento listo para cargar
    When el usuario inicia la carga del documento
    Then el documento comienza a cargarse
    When el usuario presiona el botón 'Cancelar'
    Then el proceso se detiene y se regresa a la pantalla inicial sin almacenar el documento