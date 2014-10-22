package reybarcajavier_tarea3;


public class Racional {
    int numerador;
    int denominador;
    
    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador != 0 ? denominador : 1;
    }
    
    public Racional multipicar( Racional r1, Racional r2){
        this.numerador = (r1.numerador * r2.numerador);
        this.denominador = (r1.denominador * r2.denominador);
        return new Racional(numerador, denominador);
    }
    
    public Boolean igual (Racional r1){
        return (this.numerador == r1.numerador && this.denominador == r1.denominador);
    }
    
    @Override
    public String toString(){
        return this.numerador + "/" + this.denominador;
    }
}