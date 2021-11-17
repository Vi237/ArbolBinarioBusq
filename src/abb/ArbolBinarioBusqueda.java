package abb;

public class ArbolBinarioBusqueda {
    private Nodo raiz;
    //
    public ArbolBinarioBusqueda(){
        raiz=null;
    }
    //EL ARBOL ESTA VACIO O NO ?
    public boolean estaVacio(){
        return raiz==null;
    }
    //METODO RECURSIVO PARA INSERTAR UN NODO A NUESTRO ABB
    private void insertar (Nodo padre, Nodo hijo,int dato){
        if(hijo==null){//CASO BASE
            Nodo nuevo=new Nodo(null,dato,null);
            if(dato>= padre.getDato()){
                padre.setDerecho(nuevo);
            }else {
                padre.setIzquierdo(nuevo);
            }
        }else {//LLAMADA RECURSIVA
            if(dato>= padre.getDato()){
                insertar(hijo,hijo.getDerecho(),dato);
            }else {
                insertar(hijo,hijo.getIzquierdo(),dato);
            }
        }
    }
    //METODO AUXILIAR PARA INSERTAR UN NUEVO NODO AL ABB
    public void insertar(int dato){
        if(estaVacio()){
            Nodo nuevo=new Nodo(null,dato,null);
            raiz=nuevo;
        }else {
            if(dato>= raiz.getDato()){
                insertar(raiz,raiz.getDerecho(),dato);
            }else {
                insertar(raiz,raiz.getIzquierdo(),dato);
            }
        }
    }
    //METODO RECURSIVO PARA RECORRER/MOSTRAR EL ARBOL EN ORDEN
    private void mostrarInOrden(Nodo nodo){
        if(nodo==null){//CASO BASE
        }else {//LLAMADA RECURSIVA
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato()+" ");
            mostrarInOrden(nodo.getDerecho());
        }
    }
    //METODO AUXILIAR PARA RECORRRER/MOSTRAR EL ARBOL InOrden
    public void mostrarInOrden(){
        Nodo temp=raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }
}
