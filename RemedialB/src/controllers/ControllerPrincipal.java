package controllers;

import models.ModelPrincipal;
import views.*;

/**
 *
 * @author Briceyda Angeles
 */
public class ControllerPrincipal {
    private final ModelPrincipal model_principal;
    private final ViewAscendente view_ascendente;
    private final ViewEditorTexto view_editor_texto;
    private final ViewMayor3Numeros view_mayor3_numeros;
    private final ViewOperaciones view_operaciones;
    private final ViewPrincipal view_principal;
    
    public ControllerPrincipal(ModelPrincipal model_principal, Object views[]){
        this.model_principal = model_principal;
        this.view_ascendente = (ViewAscendente) views[0];
        this.view_editor_texto = (ViewEditorTexto) views[1];
        this.view_mayor3_numeros = (ViewMayor3Numeros) views [2];
        this.view_operaciones = (ViewOperaciones) views[3];
        this.view_principal = (ViewPrincipal) views[4];
        initView();
    }
    
    public void initView(){
        view_principal.setTitle("REMEDIAL");
        view_principal.jmi_ascendente.addActionListener(e -> jmi_ascendenteMouseClicked());
        view_principal.jmi_editor_texto.addActionListener(e -> jmi_editor_textoMouseClicked());
        view_principal.jmi_mayor3_numeros.addActionListener(e -> jmi_mayor3_numerosMouseClicked());
        view_principal.jmi_operaciones.addActionListener(e -> jmi_operacionesMouseClicked());
        view_principal.jmi_salir.addActionListener(e -> jmi_salirMouseClicked());
        view_principal.setLocationRelativeTo(null);
        view_principal.setVisible(true);
    }
    
    public void jmi_ascendenteMouseClicked(){
        view_principal.setContentPane(view_ascendente);
        view_principal.revalidate();
        view_principal.repaint();
    }
    
    public void jmi_editor_textoMouseClicked(){
        view_principal.setContentPane(view_editor_texto);
        view_principal.revalidate();
        view_principal.repaint();
    }
    
    public void jmi_mayor3_numerosMouseClicked(){
        view_principal.setContentPane(view_mayor3_numeros);
        view_principal.revalidate();
        view_principal.repaint();
    }
    
    public void jmi_operacionesMouseClicked(){
        view_principal.setContentPane(view_operaciones);
        view_principal.revalidate();
        view_principal.repaint();
    }
    
    public void jmi_salirMouseClicked(){
        view_principal.dispose();
    }
    
}
