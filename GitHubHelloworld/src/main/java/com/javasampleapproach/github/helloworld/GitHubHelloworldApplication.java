package com.javasampleapproach.github.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubHelloworldApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication.run(GitHubHelloworldApplication.class, args);
	}
}