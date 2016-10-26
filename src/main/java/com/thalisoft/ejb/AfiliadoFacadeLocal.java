package com.thalisoft.ejb;

import com.thalisoft.model.Afiliado;
import java.util.List;
import javax.ejb.Local;

@Local
public interface AfiliadoFacadeLocal {

    void create(Afiliado afiliado);

    void edit(Afiliado afiliado);

    void remove(Afiliado afiliado);

    Afiliado find(Object id);

    List<Afiliado> findAll();

    List<Afiliado> findRange(int[] range);

    int count();
    
}
