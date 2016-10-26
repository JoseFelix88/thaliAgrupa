package com.thalisoft.ejb;

import com.thalisoft.model.Afiliado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class AfiliadoFacade extends AbstractFacade<Afiliado> implements AfiliadoFacadeLocal {
    @PersistenceContext(unitName = "thaligroupPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AfiliadoFacade() {
        super(Afiliado.class);
    }
    
}
