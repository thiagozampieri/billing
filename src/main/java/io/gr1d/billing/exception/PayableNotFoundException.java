package io.gr1d.billing.exception;

import io.gr1d.core.exception.Gr1dHttpException;
import org.springframework.http.HttpStatus;

public class PayableNotFoundException extends Gr1dHttpException {

    public PayableNotFoundException(final String uuid) {
        super(HttpStatus.UNPROCESSABLE_ENTITY.value(), "io.gr1d.billing.payableNotFound", new Object[] { uuid });
    }

}
