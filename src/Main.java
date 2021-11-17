import abb.ArbolBinarioBusqueda;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb=new ArbolBinarioBusqueda();
        //INSERTAR ELEMENTO
        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);
        //RECORREMOS/MOSTRAMOS LOS ELEMENTOS DEL ARBOL INoRDEN
        abb.mostrarInOrden();
    }
}
