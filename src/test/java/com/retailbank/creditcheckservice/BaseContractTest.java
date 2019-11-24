package com.retailbank.creditcheckservice;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

import static com.retailbank.creditcheckservice.CreditCheckResponse.Score.HIGH;
import static com.retailbank.creditcheckservice.CreditCheckResponse.Score.LOW;
import static org.mockito.Mockito.*;

public class BaseContractTest {

    @Before
    public void setup(){
        final CreditCheckService creditCheckService = mock(CreditCheckService.class);
        when(creditCheckService.doCreditCheck(1234)).thenReturn(new CreditCheckResponse(HIGH, "66ce29f3-ae87-4097-94e8-60b3b10c3855"));
        when(creditCheckService.doCreditCheck(4444)).thenReturn(new CreditCheckResponse(LOW, "66ce29f3-ae87-4097-94e8-60b3b10c3855"));

        RestAssuredMockMvc.standaloneSetup(new CreditCheckController(creditCheckService));
    }
}
