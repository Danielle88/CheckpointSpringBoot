package br.com.fiap.epictaskapi.Dto;

public record UserDto (

    String name,
    String email
    
){
    public UserDto(String name, String email){
        this(name,email);
    }
}
