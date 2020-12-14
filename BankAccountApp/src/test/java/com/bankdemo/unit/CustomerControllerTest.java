package com.bankdemo.unit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.bankdemo.controller.CustomerController;
import com.bankdemo.service.CustomerService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CustomerController.class)
class CustomerControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	CustomerService customerService;

	@Test
	void addPayee_givenMissingInpute_thenVerifyBadRequest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/customer/add-payee").contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	void addPayee_InvalidInput_thenVerifyBadRequest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/customer/add-payee").content(
				"{\"payeeID\": \"P00010\",\"custId\": \"Test\",\"payeeNo\":\"Test\",\"payeeFirstNamne\":\"Test\",\"payeeLastName\":\"Test\",\"payeeBankName\":\"9876543210\",\"payeeBankIFSC\":\"sample@mail.com\",\"payeeBankAcNo\":\"Business\",\"payeeStatus\":\"SampleDate\",\"createdOn\":\"test\"}")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	void addPayee_validInput_thenVerifyOk() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/customer/add-payee").content(
				"{\"payeeID\": \"P00010\",\"custId\": \"Test\",\"payeeNo\":1,\"payeeFirstNamne\":\"Test\",\"payeeLastName\":\"Test\",\"payeeBankName\":\"9876543210\",\"payeeBankIFSC\":\"sample@mail.com\",\"payeeBankAcNo\":\"Business\",\"payeeStatus\":\"SampleDate\",\"createdOn\":\"2012-04-23T18:25:43.511Z\"}")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());

	}
	
	@Test
	void updatePayee_givenMissingInpute_thenVerifyBadRequest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/customer/update-payee").contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	void updatePayee_InvalidInput_thenVerifyBadRequest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/customer/update-payee").content(
				"{\"payeeID\": \"P00010\",\"custId\": \"Test\",\"payeeNo\":\"Test\",\"payeeFirstNamne\":\"Test\",\"payeeLastName\":\"Test\",\"payeeBankName\":\"9876543210\",\"payeeBankIFSC\":\"sample@mail.com\",\"payeeBankAcNo\":\"Business\",\"payeeStatus\":\"SampleDate\",\"createdOn\":\"test\"}")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	void updatePayee_validInput_thenVerifyOk() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/customer/update-payee").content(
				"{\"payeeID\": \"P00010\",\"custId\": \"Test\",\"payeeNo\":1,\"payeeFirstNamne\":\"Test\",\"payeeLastName\":\"Test\",\"payeeBankName\":\"9876543210\",\"payeeBankIFSC\":\"sample@mail.com\",\"payeeBankAcNo\":\"Business\",\"payeeStatus\":\"SampleDate\",\"createdOn\":\"2012-04-23T18:25:43.511Z\"}")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());

	}
	
}
