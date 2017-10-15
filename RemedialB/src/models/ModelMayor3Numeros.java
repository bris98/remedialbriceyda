package models;

/**
 *
 * @author Briceyda Angeles
 */
public class ModelMayor3Numeros {
    private double numero_1 = 6.0;
    private double numero_2 = 6.0;
    private double numero_3 = 6.0;
    private double numero_mayor = 6.0;
    
    public double getNumero_1(){
        return numero_1;
    }
    
    public double getNumero_2(){
        return numero_2;
    }
    
    public double getNumero_3(){
        return numero_3;
    }
    
    public double getNumero_Mayor(){
        return numero_mayor;
    }
    
    public void setNumero_1(double numero_1){
        this.numero_1 = numero_1;
    }
    
    public void setNumero_2(double numero_2){
        this.numero_2 = numero_2;
    }
    
    public void setNumero_3(double numero_3){
        this.numero_3 = numero_3;
    }
    
    public void setNumero_Mayor(double numero_mayor){
        this.numero_mayor = numero_mayor;
    }
    
    public void CalcularMayor(){
        numero_mayor = numero_1;
        if(numero_mayor < numero_2){
            numero_mayor = numero_2;
        }
        if(numero_mayor < numero_3){
            numero_mayor = numero_3;
        }
    }
}