Feature: Login
  Yo como cliente de la tienda de swaglabs
  Deseo autenticarme en la aplicación web de swag labs
  Para ver la lista de procductos y comprar productos

  Scenario: Autenticacion exitosa
    Given Pablo se encuentra en el formulario de acceso
    When Pablo ingresa las credenciales correctas
    Then Pablo debera ver la lista de productos