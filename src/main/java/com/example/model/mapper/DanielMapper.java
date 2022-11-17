package com.example.model.mapper;

import com.example.model.entity.DanielDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DanielMapper implements RowMapper<DanielDto> {

    @Override
    public DanielDto mapRow(ResultSet rs, int rownum) throws SQLException {
        DanielDto oDto = new DanielDto();
        oDto.setId(rs.getInt("ID"));
        oDto.setNombre1(rs.getString("NOMBRE_1"));
        oDto.setNombre2(rs.getString("NOMBRE_2"));
        oDto.setAperllido1(rs.getString("APELLIDO_1"));
        oDto.setAperllido2(rs.getString("APELLIDO_2"));
        oDto.setSexo(rs.getString("SEXO"));
        oDto.setCedula(rs.getString("CEDULA"));
        oDto.setEdad(rs.getInt("EDAD"));
        return oDto;
    }
}
