/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evero91.foro.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ever
 */
public class DataManager {
    
    public List<Pregunta> generarPreguntasPrueba() {
        List<Pregunta> preguntas = new ArrayList<Pregunta>();
        
        for (int i = 0; i < 10; i++) {
            Pregunta pregunta = new Pregunta();
            pregunta.setIdPregunta(i + 1);
            pregunta.setPregunta("Pregunta " + (i + 1));
            pregunta.setDetalle("El detalle de la pregunta:\nPregunta " + (i + 1));
            preguntas.add(pregunta);
        }
        
        return preguntas;
    }
    
}
