package com.example.productexample

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@ExtendWith(SpringExtension::class)
@AutoConfigureMockMvc
class ProductExampleApplicationTests {

	@Autowired
	private lateinit var mockMvc: MockMvc

	@Test
	fun findAll() {
		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/product"))
				.andExpect(status().isOk)
	}

}
