package ku.cs.crwseal.model;


import lombok.Data;


@Data
public class SignupRequest {
    private String username;
    private String password;
    private String name;
}
