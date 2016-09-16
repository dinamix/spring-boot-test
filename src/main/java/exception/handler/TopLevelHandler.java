package exception.handler;

import exception.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class TopLevelHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler({NotFoundException.class})
    protected ResponseEntity<Object> catchNotFoundHandler(RuntimeException e, WebRequest request) {
        NotFoundException nfe = (NotFoundException) e;
        ErrorResource error = new ErrorResource();
        error.setMessage("Server error: " + e.getMessage());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return handleExceptionInternal(e, error, headers,
                HttpStatus.NOT_FOUND, request);
    }
}
