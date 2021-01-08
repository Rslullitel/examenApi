package com.examen.api.service;

import com.examen.api.model.User;
import com.examen.api.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User(1L, "rama", "12345");
    }

    @Test
    public void ShouldFindUser_AndReturn_User(){
        when(repository.findByUsername(user.getUsername())).thenReturn(Optional.of(user));

        String username = service.login(user.getUsername());

        verify(repository).findByUsername(user.getUsername());
        assertThat(username).isEqualTo(user.getUsername());
    }

    @Test
    public void ShouldNotFindUser_AndThrows_ResponseStatusException(){
        when(repository.findByUsername("dummy")).thenReturn(Optional.of(user));

        String username = service.login("dummy");

        assertThatThrownBy(() -> service.login(username))
                .isInstanceOf(ResponseStatusException.class)
                .hasMessageContaining("User not found");

    }

}
