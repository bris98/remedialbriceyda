package controllers;

import models.ModelAscendente;
import views.ViewAscendente;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author Briceyda Angeles
 */
public class ControllerAscendente implements KeyListener {
    private final ModelAscendente model_ascendente;
    private final ViewAscendente view_ascendente;
    
    public ControllerAscendente(ModelAscendente model_ascendente, Object views[]){
        this.model_ascendente = model_ascendente;
        this.view_ascendente = (ViewAscendente) views[0];
        initView();
    }
    
    public void initView(){
        view_ascendente.jtf_numero_insertado.setText("" +  model_ascendente.getNumero_Insertado());
        view_ascendente.jtf_numero_insertado.addKeyListener(this);
        view_ascendente.jbtn_insertar.addActionListener(e -> jbtn_insertarMouseClicked());
        view_ascendente.jbtn_ascendente.addActionListener(e -> jbtn_ascendenteMouseClicked());
        view_ascendente.jbtn_promedio.addActionListener(e -> jbtn_promedioMouseClicked());
        model_ascendente.Crear_Modelo_Lista();
        view_ascendente.jli_lista_numeros.setModel(model_ascendente.getModelo_Lista_Numeros());
        
    }
    
     @Override
    public void keyPressed(KeyEvent e){
       if(e.getKeyCode() == 10){
           jbtn_insertarMouseClicked();
       }
        //System.out.println(e.getKeyCode());
    }
    
    @Override
    public void keyReleased(KeyEvent e){
        //
    }
    
    @Override
    public void keyTyped(KeyEvent e){
        //
    }
    
    public void jbtn_insertarMouseClicked(){
        model_ascendente.setNumero_Insertado(Double.parseDouble(view_ascendente.jtf_numero_insertado.getText()));
        model_ascendente.Insertar_Valor();
    }
    
    public void jbtn_ascendenteMouseClicked(){
        model_ascendente.Ordenar_Ascendente();
        view_ascendente.jli_lista_numeros.setModel(model_ascendente.getModelo_Lista_Numeros());
    }
    
    public void jbtn_promedioMouseClicked(){
        model_ascendente.Promediar_Lista();
        view_ascendente.jlb_resultado.setText("Promedio: " + model_ascendente.getPromedio());
    }
    
}