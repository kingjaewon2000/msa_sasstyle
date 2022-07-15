package com.sasstyle.orderservice.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OrderRequest {

    @Schema(description = "주문 상품 목록", required = true)
    private List<OrderProductRequest> data;
}