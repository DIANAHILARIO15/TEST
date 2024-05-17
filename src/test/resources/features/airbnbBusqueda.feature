Feature: Airbnb

  @test
  Scenario Outline: : Busqueda de hospedaje
    Given cierro popUp
    When clic en el boton busqueda
    And ingreso el destino "<hotel>"
    And clic en la primera opcion
    And clic en el boton siguiente
    And clic en el boton buscar
    Then valido que me muestre el mensaje "<mensaje>"
    Examples:
      | hotel                | mensaje                                 |
      | Hoteles en Vichayito | Más de 1000 alojamientos en el map area |