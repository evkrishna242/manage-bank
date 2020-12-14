package com.bankdemo.unit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.bankdemo.controller.BankEmployeeController;
import com.bankdemo.service.BankEmployeeService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BankEmployeeController.class)
public class BankEmployeeControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	BankEmployeeService bankEmployeeService;

	@Test
	void addCustomer_InvalidInput_thenVerifyBadRequest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/bank-employee/add-new-customer").content(
				"{\"custId\": \"100010\",\"firstName\": \"Test\",\"middleName\":\"Test\",\"lastName\":\"Test\",\"city\":\"Test\",\"mobileNo\":\"9876543210\",\"email\":\"sample@mail.com\",\"occupation\":\"Business\",\"dob\":\"SampleDate\"}")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	void addCustomer_withValid_thenVerifyOk() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/bank-employee/add-new-customer").content(
				"{\"custId\": \"100010\",\"firstName\": \"Test\",\"middleName\":\"Test\",\"lastName\":\"Test\",\"city\":\"Test\",\"mobileNo\":\"9876543210\",\"email\":\"sample@mail.com\",\"occupation\":\"Business\",\"dob\":\"2012-04-23T18:25:43.511Z\"}")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	void addAccount_InvalidInput_thenVerifyBadRequest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/bank-employee/add-new-customer").content(
				"{\"custId\": \"100010\",\"firstName\": \"Test\",\"middleName\":\"Test\",\"lastName\":\"Test\",\"city\":\"Test\",\"mobileNo\":\"9876543210\",\"email\":\"sample@mail.com\",\"occupation\":\"Business\",\"dob\":\"SampleDate\"}")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isBadRequest());
	}

	@Test
	void addAccount_withValid_thenVerifyOk() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/bank-employee/add-new-customer").content(
				"{\"custId\": \"100010\",\"firstName\": \"Test\",\"middleName\":\"Test\",\"lastName\":\"Test\",\"city\":\"Test\",\"mobileNo\":\"9876543210\",\"email\":\"sample@mail.com\",\"occupation\":\"Business\",\"dob\":\"2012-04-23T18:25:43.511Z\"}")
				.contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk());
	}
}
