#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.controller.dtos.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data transfer object to be used to transfer login credentials from a client.
 */
public final class LoginCredentialsDto {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
