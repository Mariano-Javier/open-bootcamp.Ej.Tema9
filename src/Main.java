public class Main {
    public static void main(String[] args) {

        Cliente usuario = new Cliente();
        usuario.nombre = "Juan";
        usuario.edad = 25;
        usuario.telefono = "12-5434-4345";
        usuario.credito = 2000;

        System.out.println("Hola me llamo "+ usuario.nombre+", tengo "+usuario.edad+" años, mi número telefónico es: "+usuario.telefono+" y tengo un crédito de: "+usuario.credito+" euros.");

        Trabajador nuevoTrabajador = new Trabajador();
        nuevoTrabajador.nombre = "Pedro";
        nuevoTrabajador.edad = 33;
        nuevoTrabajador.telefono = "12-5678-4678";
        nuevoTrabajador.salario = 3000;

        System.out.println("Hola me llamo "+ nuevoTrabajador.nombre+", tengo "+nuevoTrabajador.edad+" años, mi número telefónico es: "+nuevoTrabajador.telefono+" y tengo un salario de: "+nuevoTrabajador.salario+" euros.");
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int salario;
}
