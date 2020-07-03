package bla.controlllers;

import bla.models.Role;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;

import javax.validation.Valid;

@Validated
@Controller("/roles")
public class RoleController {
    @Post
    public Role create(@Body @Valid Role role) {
        return role;
    }
}
