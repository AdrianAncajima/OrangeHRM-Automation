Feature: Iniciar sesión y crear empleado en OrangeHRM
  Scenario: Crear un nuevo empleado
    Given que accedo a OrangeHRM
    When inicio sesion con "Admin" y "admin123"
    And navego a la seccion PIM
    And creo un nuevo empleado con el primer nombre "Adrian", segundo nombre "Jose", apellido "Ancajima" y codigo "62436255"
    And navego a la seccion PIM
    Then busco y valido el empleado con nombre "Adrian Jose Ancajima"
