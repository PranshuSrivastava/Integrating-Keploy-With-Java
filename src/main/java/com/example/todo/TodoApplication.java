package com.example.todo;

import io.keploy.ksql.KDriver;
import io.keploy.servlet.KeployMiddleware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.sql.SQLException;

@SpringBootApplication
@Import(KeployMiddleware.class)
public class TodoApplication {
	public static void main(String[] args) throws SQLException {
		KDriver.WrapDriver();
		SpringApplication.run(TodoApplication.class, args);
	}
}
