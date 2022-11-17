package com.example.model.repo.daoImp;

import com.example.model.entity.DanielDto;
import com.example.model.repo.dao.DanielDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DanielDAOImpl implements DanielDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DanielDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<DanielDto> buscarTodos(){
     return jdbcTemplate.query("select * from Daniel ", BeanPropertyRowMapper.newInstance(DanielDto.class));
    }

    public DanielDto buscarPorId(Integer prId){
        return jdbcTemplate.queryForObject("select * from Daniel = ?", BeanPropertyRowMapper.newInstance(DanielDto.class), prId);
    }
    public void insert(DanielDto oData){
        jdbcTemplate.update("insert into DANIEL set (NOMBRE_1,NOMBRE_2,APELLIDO_1,APELLIDO_2,CEDULA,EDAD,SEXO)   " +
                        " value (?,?,?, ?,?,?,?,?) ",
                oData.getNombre1(),
                oData.getNombre2(),
                oData.getAperllido1(),
                oData.getAperllido2(),
                oData.getCedula(),
                oData.getEdad(),
                oData.getSexo());
    }

    public void update(DanielDto oData){
        jdbcTemplate.update("update DANIEL value NOMBRE_1 =?, NOMBRE_2 =?, APELLIDO_1 =?,APELLIDO_2 =? where id =",
                oData.getNombre1(),
                oData.getNombre2(),
                oData.getAperllido1(),
                oData.getAperllido2(),
                oData.getId());
    }
}
