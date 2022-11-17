package com.example.model.repo.dao;

import com.example.model.entity.DanielDto;

import java.util.List;

public interface DanielDAO {
    List<DanielDto> buscarTodos();
    DanielDto buscarPorId(Integer prId);
    void insert(DanielDto oData);

    void update(DanielDto oData);
}
