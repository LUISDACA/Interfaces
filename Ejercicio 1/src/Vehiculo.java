public class Vehiculo {
    protected int gasolina;
    protected String tipo;
    protected String articulo;

    public void Conducir() {
        if (gasolina > 0) {
            System.out.println(articulo + " " + tipo + " se puede conducir");
        } else {
            System.out.println(articulo + " " + tipo + " no tiene suficiente gasolina para conducir");
        }
    }

    public boolean Retanquear(int cantidad) {
        if (cantidad > 0) {
            gasolina += cantidad;
            System.out.println("Se agregaron " + cantidad + " galones de gasolina. Total: " + gasolina + " galones");
            return true;
        }
        return false;
    }
}