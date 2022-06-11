package com.sasstyle.userservice.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Schema(description = "회원가입 응답 DTO")
@Getter
@AllArgsConstructor
public class JoinResponse {

    @Schema(description = "사용자 번호", example = "1")
    private Long userId;

    @Schema(description = "아이디", example = "sasstyle")
    private String username;
}