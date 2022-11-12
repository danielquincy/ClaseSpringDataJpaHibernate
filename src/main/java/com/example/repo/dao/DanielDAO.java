package com.example.repo.dao;

import com.example.entity.DanielDto;

import java.util.List;

public interface DanielDAO {
    List<DanielDto> buscarTodos();
    DanielDto buscarPorId(Integer prId);
    void insert(DanielDto oData);

    void update(DanielDto oData);
}
