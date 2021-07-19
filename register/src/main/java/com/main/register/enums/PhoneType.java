package com.main.register.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    NOME("Nome"),
    MOBILE("Mobile"),
    COMERCIAL("Comercial");

    private  final String description;
}
