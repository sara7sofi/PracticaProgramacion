package Practicas.ferroviaria.maquinaria;

public class Vagon {
    //ATRIBUTOS
    //PROTECTED para todas las clases del mismo paquete y subclases
    protected int id;
    protected double cargaMaxima;
    protected double cargaActual;
    protected Mercancia mercancia; //porque llamamos al enumerado
    //solo se pone getter y setter si es private
    //CONSTRUCTOR

    public Vagon(int id, double cargaMaxima, double cargaActual, Mercancia mercancia) {
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }

    //METODO

    @Override
    public String toString() {
        return "Vagon{" +
                "id=" + id +
                ", cargaMaxima=" + cargaMaxima +
                ", cargaActual=" + cargaActual +
                ", mercancia=" + mercancia +
                '}';
    }

    //METODO

    public void imprimir(){
        System.out.println(toString());
    }
}
