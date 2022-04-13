@stories
Feature:
  Yo como usuario quiero poder visualizar las compras que he realizado
  para poder tener un reporte financiero propio

  @scenario1
  Scenario: Ver mi historial de compras
    Given Nikka esta logueada en la pagina yourlogo y en la pantalla principal
      | user             | password |
      | ejemplo@dummy.co | prueba1  |
    When Escoge una prenda para comprar y da click en Add to cart y en el boton proceed to checkout
    When escoge una direccion de entrega y da click en proceed to checkout
    When acepta terminos y condiciones y da click en proceed to checkout
    When escoge una forma de pago y da click en i confirm my order
    When se dirige a la seccion mi cuenta y da click en order history and details
    Then Verifica que aparezca su nueva compra en el historial
      | fecha      |
      | 04/11/2022 |
  @scenario2
  Scenario: Ver a detalle cada compra y descargar la informacion en pdf
    Given Nikka esta logeada en YourLogo y realizó una compra anteriormente
      | user             | password |
      | ejemplo@dummy.co | prueba1  |
    When Ella va a la sección my account y da clic en Order History and Details
    When Da click en Details de alguna compra
    When Dentro de los detalles escoge la opcion Download you invoice as a Pdf file
    When En la tabla de historial de compras escoger la columna invoice y dar click en PDF
    Then verifica que dirección, prenda y fecha se muestren
      | direccion        | date       | prenda                      |
      | Delivery address | 04/11/2022 | Faded Short Sleeve T-shirts |