package com.udeateampro.controller.dto;

import java.util.List;

public record CreateKitSolucionRequest(
        String nombre,
        String descripcion,
        Boolean estado,
        List<ComponenteKitDTO> componentes) {
    
    public record ComponenteKitDTO(
            Long id_producto,
            Integer cantidad,
            String instrucciones,
            Boolean estado) {
    }
}
