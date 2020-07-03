package bla.models;

import io.micronaut.core.annotation.Introspected;
import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;

@Value
@Builder
@Introspected
public class Role {
    @With
    private String id;

    @NotNull
    private String name;

    private String description;

    private Map<Permission, List<Action>> permissions;

    @NotNull
    private boolean deleted = false;
}
