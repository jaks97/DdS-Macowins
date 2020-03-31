# Requerimientos
* Saber el precio de venta de una prenda determinada
* Saber el estado de una prenda (Nueva, Promoción, Liquidación)
* El precio consiste en un precio base modificado según el estado de la prenda
  * Nueva: en este caso no modifican el precio base.
  * Promoción: Le resta un valor fijo decidido por el usuario.
  * Liquidación: Es un 50% del valor del producto.
* Saber el tipo de una prenda determinada (Saco, Camisa, Pantalón)
* Registrar las ventas de las prendas
* Una venta consiste en las prendas vendidas, su cantidad y la fecha
* Las ventas pueden ser con efectivo o con tarjeta (con la posibilidad de cuotas)
  * Efectivo: No se le aplica recargo
  * Tarjeta: Se le aplica un recargo *(cantidad de cuotas * un coeficiente fijo + 0.01 del valor de cada prenda)*
* Conocer las ganancias de un determinado día
