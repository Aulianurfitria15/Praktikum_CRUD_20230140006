package com.example.Praktikum1.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserAddRequest {

    @NotBlank(message = "Nama tidak boleh kosong") // Mencegah string kosong atau hanya spasi
    private String name;

    @NotNull(message = "Umur harus diisi")
    @Min(value = 1, message = "Umur minimal 1 tahun") // Memastikan umur masuk akal
    private int age;
}
