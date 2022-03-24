package com.capgemini.Junit;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

	@Mock EmployeeService employeeService;
	EmployeeController employeeController;
	String expectedResponse;

	@BeforeEach
	public void setUp() {
		//employeeService = new EmployeeService();
		employeeController = new EmployeeController(employeeService);
	}

	@Test
	public void testCreateEmployee() {
		expectedResponse = "Created EMployee";
		Mockito.when(employeeService.createEMployee()).thenReturn(expectedResponse);
		String actualResponse = employeeController.createEMployee();
		Assertions.assertEquals(expectedResponse, actualResponse);
	}
	
	@Test
	public void testUpdatingEMployeeException() throws Exception  {
		Mockito.when(employeeService.updatingEMployee()).thenThrow(Exception.class);
		Assertions.assertThrows(Exception.class, () -> employeeController.updateEmployee());
	}
	
	@Test
	public void testCreateEMployeeOriginalMethod() {
		EmployeeService employeeService=Mockito.spy(EmployeeService.class);
		Assertions.assertNotNull(employeeService.createEMployee());
	}

}
