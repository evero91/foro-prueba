/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evero91.foro.controladores;

import com.evero91.foro.modelo.DataManager;
import com.evero91.foro.modelo.Pregunta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ever
 */
@ManagedBean
@ViewScoped
public class PreguntasBean {

    public List<Pregunta> preguntas = new ArrayList<Pregunta>();
    private final DataManager dataManager = new DataManager();
    
    @PostConstruct
    public void init() {
        preguntas = dataManager.generarPreguntasPrueba();
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
}
