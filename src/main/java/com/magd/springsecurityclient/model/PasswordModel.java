package com.magd.springsecurityclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PasswordModel {

    private String email;
    private String oldPassword;
    private String newPassword;
}
