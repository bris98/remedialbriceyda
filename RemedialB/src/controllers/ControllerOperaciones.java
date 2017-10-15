package controllers;

import models.ModelOperaciones;
import views.ViewOperaciones;


/**
 *
 * @author Briceyda Angeles
 */
public class ControllerOperaciones {
    private final ModelOperaciones model_operaciones;
    private final ViewOperaciones view_operaciones;
    
    public ControllerOperaciones(ModelOperaciones model_operaciones, Object views[]){
        this.model_operaciones = model_operaciones;
        this.view_operaciones = (ViewOperaciones) views[3];
        initView();
    }
    
    public void initView(){
        view_operaciones.jbtn_suma.addActionListener(e -> jbtn_sumarMouseClicked());
        view_operaciones.jbtn_resta.addActionListener(e -> jbtn_restaMouseClicked());
        view_operaciones.jbtn_multiplicacion.addActionListener(e -> jbtn_multiplicacionMouseClicked());
        view_operaciones.jbtn_division.addActionListener(e -> jbtn_divisionMouseClicked());
        view_operaciones.jtf_numero_1.setText("" + model_operaciones.getNumero_1());
        view_operaciones.jtf_numero_2.setText("" + model_operaciones.getNumero_2());
        view_operaciones.jlb_resultado.setText("" + model_operaciones.getResultado());
    }
    
    public void jbtn_sumarMouseClicked(){
        model_operaciones.setNumero_1(Double.parseDouble(view_operaciones.jtf_numero_1.getText()));
        model_operaciones.setNumero_2(Double.parseDouble(view_operaciones.jtf_numero_2.getText()));
        model_operaciones.Sumar();
        view_operaciones.jlb_resultado.setText("" + model_operaciones.getResultado());
    }
    
    public void jbtn_restaMouseClicked(){
        model_operaciones.setNumero_1(Double.parseDouble(view_operaciones.jtf_numero_1.getText()));
        model_operaciones.setNumero_2(Double.parseDouble(view_operaciones.jtf_numero_2.getText()));
        model_operaciones.Restar();
        view_operaciones.jlb_resultado.setText("" + model_operaciones.getResultado());
    }
    
    public void jbtn_multiplicacionMouseClicked(){
        model_operaciones.setNumero_1(Double.parseDouble(view_operaciones.jtf_numero_1.getText()));
        model_operaciones.setNumero_2(Double.parseDouble(view_operaciones.jtf_numero_2.getText()));
        model_operaciones.Multiplicar();
        view_operaciones.jlb_resultado.setText("" + model_operaciones.getResultado());
    }
    
    public void jbtn_divisionMouseClicked(){
        model_operaciones.setNumero_1(Double.parseDouble(view_operaciones.jtf_numero_1.getText()));
        model_operaciones.setNumero_2(Double.parseDouble(view_operaciones.jtf_numero_2.getText()));
        model_operaciones.Dividir();
        view_operaciones.jlb_resultado.setText("" + model_operaciones.getResultado());
    }  
}