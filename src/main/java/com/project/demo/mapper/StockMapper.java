package com.project.demo.mapper;

import com.project.demo.model.Stock;
import com.project.demo.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setCode(dto.getCode());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());
        return stock;

    }

    public StockDTO toDto(Stock stock) {
        StockDTO dto = new StockDTO();
        dto.setId(stock.getId());
        dto.setName(stock.getName());
        dto.setCode(stock.getCode());
        dto.setPrice(stock.getPrice());
        dto.setVariation(stock.getVariation());
        dto.setDate(stock.getDate());
        return dto;
    }

    public List<StockDTO> toDto(List<Stock> listStock) {
        return listStock.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
