package hello.login.web.login;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class LoginForm {

    @NotEmpty
    private String LoginId;

    @NotEmpty
    private String password;
}
