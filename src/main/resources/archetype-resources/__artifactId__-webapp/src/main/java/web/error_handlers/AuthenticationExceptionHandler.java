#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.error_handlers;

import ${package}.exceptions.UnauthenticatedException;
import com.bellotapps.utils.error_handler.ErrorHandler;
import com.bellotapps.utils.error_handler.ExceptionHandler;
import com.bellotapps.utils.error_handler.ExceptionHandlerObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;

import javax.ws.rs.core.Response;

/**
 * {@link ExceptionHandler} in charge of handling {@link UnauthenticatedException}.
 * Will result in the return value of {@link UnauthenticatedExceptionHandler${symbol_pound}unauthenticatedResult()}.
 */
@ExceptionHandlerObject
/* package */ class AuthenticationExceptionHandler implements ExceptionHandler<AuthenticationException> {

    /**
     * The {@link Logger} object.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationExceptionHandler.class);

    @Override
    public ErrorHandler.HandlingResult handle(AuthenticationException exception) {
        LOGGER.debug("A user was not authenticated during spring security authentication mechanism. " +
                "AuthenticationException message: {}", exception.getMessage());
        LOGGER.trace("UnauthenticatedException Stack trace: ", exception);

        return UnauthenticatedExceptionHandler.unauthenticatedResult();
    }
}
