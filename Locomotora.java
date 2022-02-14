package Practicas.ferroviaria.maquinaria;

import Practicas.ferroviaria.personal.Mecánico;

public class Locomotora {

    //ATRIBUTOS
    protected String matricula;
    protected String potenciaMotores;
    protected String antiguedad;
    protected Mecánico mecanico; //inicializando variable, porque la variable está en otra carpeta

    //CONSTRUCTOR

    public Locomotora(String matricula, String potenciaMotores, String antiguedad, Mecánico mecanico) {
        this.matricula = matricula;
        this.potenciaMotores = potenciaMotores;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
    }

    //METODO

    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potenciaMotores='" + potenciaMotores + '\'' +
                ", antiguedad='" + antiguedad + '\'' +
                ", mecanico=" + mecanico +
                '}';
    }

    //METODO

    public void imprimir(){
        System.out.println(toString());
    }
}
