package fetch.challenge.receiptprocessor.controller;

import fetch.challenge.receiptprocessor.controller.data.ErrorResponse;
import fetch.challenge.receiptprocessor.domain.ReceiptNotFoundException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class RequestExceptionHandler {

    @ResponseBody
    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorResponse handleReceiptValidationError(MethodArgumentNotValidException ex) {
        return new ErrorResponse("The receipt is invalid.");
    }

    @ResponseBody
    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(ReceiptNotFoundException.class)
    public ErrorResponse handleReceiptNotFound(ReceiptNotFoundException ex) {
        return new ErrorResponse(ex.getMessage());
    }
}
