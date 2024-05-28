public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        System.out.println("Puestos libres: "+parqueadero.calcularPuestosLibres());

        parqueadero.entrarCarro( "PPP-001");
        parqueadero.entrarCarro( "PPP-002");

        System.out.println("Puestos libres: "+ parqueadero.calcularPuestosLibres());
        System.out.println("Promedio horas: "+ parqueadero.darTiempoPromedio());
        System.out.println("Carro con mas horas: " +parqueadero.DevuelveCarroMayorTiempo().darPlaca());
        System.out.println("Existe auto mas de ocho horas: "+parqueadero.hayCarroMasDeOchoHoras());

    }
}