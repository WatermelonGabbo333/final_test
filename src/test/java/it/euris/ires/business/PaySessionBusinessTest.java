package it.euris.ires.business;

import static org.mockito.ArgumentMatchers.any;

import it.euris.ires.dataObject.*;
import it.euris.ires.entity.PaySession;
import it.euris.ires.exception.PaySessionException;
import it.euris.ires.service.IPaymentSessionService;
import it.euris.ires.util.PaySessionStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)

class PaySessionBusinessTest {

    PaySessionBusiness paySessionBusiness;

    @Mock
    IPaymentSessionService iPaymentSessionService;

    @BeforeEach
    void init() {
        paySessionBusiness = new PaySessionBusiness(iPaymentSessionService);
    }

    @Test
    void createPaySession() {
        CreatePaySessionRequest request = new CreatePaySessionRequest();
        PaySession paySession = new PaySession();
        paySession.setStatus(PaySessionStatus.CREATED);
        assertEquals(iPaymentSessionService.createWebPaySession(request),paySession );
    }
}