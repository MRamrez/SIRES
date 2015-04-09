/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Estudiante;
import modelo.RegistroEstudiante;
import vista.GUIEstudiantes;
import vista.GUIInforme;
import vista.PanelBotones;
import vista.PanelEstudiante;
import vista.GUIFiltro;

/**
 *
 * @author aaron
 */
public class ControlEstudiante implements ActionListener,MouseListener, ItemListener{

    private RegistroEstudiante registroEstudiante;
    private PanelEstudiante panelData;
    private PanelBotones panelBtn;
    private GUIEstudiantes guiEstudiante;
//    private GUIInforme informe;
    private GUIFiltro guifiltro;

    public ControlEstudiante(PanelEstudiante panelEstudiante, PanelBotones panelBtn,RegistroEstudiante registroEstudiante,GUIEstudiantes guiEstudiante) {
        this.registroEstudiante = registroEstudiante;
        this.panelData = panelEstudiante;
        this.panelBtn = panelBtn;
        this.guiEstudiante=guiEstudiante;
    }

    public void actionPerformed(ActionEvent evento) {

        if (evento.getActionCommand().equalsIgnoreCase(PanelBotones.BTN_AGREGAR)) {
            if (panelData.getTxtCarnet().equalsIgnoreCase("")) {
                GUIEstudiantes.mensaje("El campo carnet no tiene información, por favor, agregue el carnet del estudiante!");
            } else if (panelData.getTxtNombre().equalsIgnoreCase("")) {
                GUIEstudiantes.mensaje("El campo nombre no tiene información, por favor, agregue el nombre del estudiante!");
            } else if (panelData.getTxtEdad() == 0) {
                GUIEstudiantes.mensaje("El campo edad no tiene información, por favor, agregue la edad del estudiante!");

            } else {
                GUIEstudiantes.mensaje(
                        registroEstudiante.addEstudiante(
                                new Estudiante(panelData.getTxtNombre(), panelData.getTxtEdad(), panelData.getTxtCarnet())));
                panelData.limpiar();
            }

        }//Fin del if BTN-AGREGAR

        if (evento.getActionCommand().equalsIgnoreCase(PanelEstudiante.BTN_BUSCAR)) {

            Estudiante estudiante = registroEstudiante.consultar(panelData.getTxtCarnet());
            if (estudiante != null) {
                panelData.setTxtCarnet(estudiante.getCarnet());
                panelData.setTxtNombre(estudiante.getNombre());
                panelData.setTxtEdad(estudiante.getEdad());
                panelBtn.enableEliMod(true);
            } else {
                GUIEstudiantes.mensaje("El estudiante no se encuentra registrado!");
                panelData.limpiar();
            }
        }//FIN DEL EVENTO BUSCAR

        if (evento.getActionCommand().equalsIgnoreCase(PanelBotones.BTN_ELIMINAR)) {

            Estudiante estudianteEliminar = new Estudiante(panelData.getTxtNombre(), panelData.getTxtEdad(), panelData.getTxtCarnet());
            GUIEstudiantes.mensaje(registroEstudiante.deleteEstudiante(estudianteEliminar));
            panelData.limpiar();
            panelBtn.enableEliMod(false);

        }//FIN DEL EVENTO ELIMINAR

        if (evento.getActionCommand().equalsIgnoreCase(PanelBotones.BTN_CONSULTAR)) {
            
            //GUIReporte guiRepo=new GUIReporte();
            //guiRepo.setVisible(true);
            //guiRepo.setTxaReporte(registroEstudiante.consultarAll());
            GUIInforme informe=new GUIInforme();
            informe.setValores(registroEstudiante.getMatrizEstudiante(),Estudiante.getEtiquetas());
            informe.show();
            informe.escucharTabla(this);
        }

        if (evento.getActionCommand().equalsIgnoreCase(PanelBotones.BTN_SALIR)) {
            guiEstudiante.dispose();
        }
    }//FIN DE SALIR

    
    public void mouseClicked(MouseEvent me) {
//        String[] datos=informe.getDatosFila();
//        GUIEstudiantes.mensaje(informe+"");
//        GUIEstudiantes.mensaje(datos[0]);
    }

    public void mousePressed(MouseEvent me) {
        
    }

    
    public void mouseReleased(MouseEvent me) {
        
    }

    public void mouseEntered(MouseEvent me) {
        
    }

    
    public void mouseExited(MouseEvent me) {
        
    }


    public void itemStateChanged(ItemEvent ie) {
       if(ie.getStateChange() == ItemEvent.SELECTED){
//           if(this.guiFiltro)
       }
    }

}
