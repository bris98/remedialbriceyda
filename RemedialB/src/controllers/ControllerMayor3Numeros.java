package controllers;

import models.ModelMayor3Numeros;
import views.ViewMayor3Numeros;


/**
 *
 * @author Briceyda Angeles
 */
public class ControllerMayor3Numeros {
private final ModelMayor3Numeros model_mayor3_numeros;
private final ViewMayor3Numeros view_mayor3_numeros;

public ControllerMayor3Numeros(ModelMayor3Numeros model_mayor3_numeros, Object views[]){
    this.model_mayor3_numeros = model_mayor3_numeros;
    this.view_mayor3_numeros = (ViewMayor3Numeros) views[2];
    initView();
}

public void initView(){
        view_mayor3_numeros.jtf_numero_1.setText("" + model_mayor3_numeros.getNumero_1());
        view_mayor3_numeros.jtf_numero_2.setText("" + model_mayor3_numeros.getNumero_2());
        view_mayor3_numeros.jtf_numero_3.setText("" + model_mayor3_numeros.getNumero_3());
        view_mayor3_numeros.jbtn_calcular.addActionListener(e -> jbtn_calcularMouseClicked());
    }
    
    public void jbtn_calcularMouseClicked(){
        model_mayor3_numeros.setNumero_1(Double.parseDouble(view_mayor3_numeros.jtf_numero_1.getText()));
        model_mayor3_numeros.setNumero_2(Double.parseDouble(view_mayor3_numeros.jtf_numero_2.getText()));
        model_mayor3_numeros.setNumero_3(Double.parseDouble(view_mayor3_numeros.jtf_numero_3.getText()));
        model_mayor3_numeros.CalcularMayor();
        view_mayor3_numeros.jlb_resultado.setText("Mayor: " + model_mayor3_numeros.getNumero_Mayor());
    }
}
