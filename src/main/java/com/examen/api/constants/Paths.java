package com.examen.api.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Paths {
    // GENERAL
    public static final String API_1 = "/api";

    // USUARIOS
    public static final String USERS_PATH = API_1 + "/users";
    public static final String LOGIN_PATH = "/login";

    // PROVINCIAS
    public static final String PROVINCIAS_PATH = API_1 + "/provincias";
    public static final String PROVINCIA_BY_NAME_PATH = "/getByName";
}
