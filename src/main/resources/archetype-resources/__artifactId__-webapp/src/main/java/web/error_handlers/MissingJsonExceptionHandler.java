#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.error_handlers;

import ${package}.web.support.exceptions.MissingJsonException;
import com.bellotapps.utils.error_handler.ErrorHandler;
import com.bellotapps.utils.error_handler.ExceptionHandler;
import com.bellotapps.utils.error_handler.ExceptionHandlerObject;

/**
 * {@link ExceptionHandler} in charge of handling {@link MissingJsonException}.
 * Will result in the return value of
 * {@link JsonProcessingExceptionHandler${symbol_pound}jsonProcessingExceptionHandlingResult()}.
 */
@ExceptionHandlerObject
/* package */ class MissingJsonExceptionHandler implements ExceptionHandler<MissingJsonException> {

    @Override
    public ErrorHandler.HandlingResult handle(MissingJsonException exception) {
        return JsonProcessingExceptionHandler.jsonProcessingExceptionHandlingResult();
    }
}
