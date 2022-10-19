package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class JenkinsControllerTest {

	private MockMvc mockMvc;

	@Autowired
	JenkinsController target;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(target).build();
	}

	@Test
	public void indexTest() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("index"))
				.andExpect(model().hasNoErrors());
	}

	/*
	// テスト開始前に1回だけ実行される
	@BeforeAll
	static void beforeAll() {
		System.out.println("JenkinsControllerTest 開始");
	}
	
	// テスト開始後に1回だけ実行される
	@AfterAll
	static void afterAll() {
		System.out.println("JenkinsControllerTest 終了");
	}
	
	// 各テストメソッド開始前に実行される
	@BeforeEach
	void beforeEach() {
		System.out.println("JenkinsControllerTest のテストメソッドをひとつ開始");
	}
	
	// 各テストメソッド開始後に実行される
	@AfterEach
	void afterEach() {
		System.out.println("JenkinsControllerTest のテストメソッドをひとつ終了");
	}
	*/
}
