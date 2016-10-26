package com.thalisoft.controller;

import com.thalisoft.ejb.AfiliadoFacadeLocal;
import com.thalisoft.model.Afiliado;
import com.thalisoft.model.Afiliado_;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "afiliadoController")
@ViewScoped
public class AfiliadoController implements Serializable {

    @EJB
    private AfiliadoFacadeLocal afiliadoEJB;
    private Afiliado afiliado;

    @PostConstruct
    public void init() {
        afiliado = new Afiliado();
    }

    public void registrar() {
        try {
            afiliadoEJB.create(afiliado);
        } catch (Exception e) {
        }
    }

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    
}
