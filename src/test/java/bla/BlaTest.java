package bla;

import bla.models.Role;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.inject.Inject;

@MicronautTest
public class BlaTest {
    @Inject
    @Client("/")
    private RxHttpClient client;

    @Test
    void testItWorks() {
        Role build = Role.builder()
            .id("id")
            .name("name")
            .build();

        // update user
        Role result = client.toBlocking().retrieve(
            HttpRequest.POST("/roles", build),
            Role.class
        );

        Assertions.assertEquals(build.getId(), result.getId());
    }
}
