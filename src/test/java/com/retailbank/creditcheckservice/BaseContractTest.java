package com.retailbank.creditcheckservice;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import static com.retailbank.creditcheckservice.CreditCheckResponse.Score.HIGH;
import static org.mockito.Mockito.*;

public class BaseContractTest {

    @Before
    public void setup(){
        final CreditCheckService creditCheckService = mock(CreditCheckService.class);
        when(creditCheckService.doCreditCheck(1234)).thenReturn(new CreditCheckResponse(HIGH));
        RestAssuredMockMvc.standaloneSetup(new CreditCheckController(creditCheckService));
    }
}
