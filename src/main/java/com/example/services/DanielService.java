package com.example.services;

import com.example.model.entity.DanielDto;
import com.example.model.repo.dao.DanielDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanielService {

    private final DanielDAO oDanielDao;

    @Autowired
    public DanielService(DanielDAO oDanielDao) {
        this.oDanielDao = oDanielDao;
    }

    public List<DanielDto> buscarTodos(){
        return oDanielDao.buscarTodos();
    }

   public DanielDto buscarPorId(Integer prId){
        return oDanielDao.buscarPorId(prId);
   }

   public void insert(DanielDto oData){
        oDanielDao.insert(oData);
   }

   public void update(DanielDto oData){
        oDanielDao.update(oData);
   }
}
