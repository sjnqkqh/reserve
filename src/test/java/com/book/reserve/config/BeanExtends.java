package com.book.reserve.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@WebAppConfiguration
@SpringBootTest
@AutoConfigureMockMvc
public class BeanExtends {

	@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
	@Autowired
	protected MockMvc mockMvc;

}
