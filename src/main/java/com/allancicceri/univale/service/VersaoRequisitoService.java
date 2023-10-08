package com.allancicceri.univale.service;

import com.allancicceri.univale.model.entity.VersaoRequisito;
import java.util.List;

public interface VersaoRequisitoService {
    VersaoRequisito create(VersaoRequisito versaoRequisito);
    VersaoRequisito Update(int id, VersaoRequisito versaoRequisito);
    VersaoRequisito FindById(int id);
    List<VersaoRequisito> FindAll();
    void Delete(int id);
}
