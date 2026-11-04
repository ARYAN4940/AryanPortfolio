package com.example.portfolio.controller;

import com.example.portfolio.model.Skill;
import com.example.portfolio.model.Project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("name", "Aryan Patel");

        model.addAttribute("role",
            "Java Backend Developer");

        model.addAttribute("intro",
            "I am a passionate software developer.");

        model.addAttribute("about",
            "I have completed B.Tech in Computer Science. " +
            "I am interested in Java, Spring Boot, " +
            "Web Development and Software Engineering.");

        List<Skill> skills = List.of(
            new Skill("Java", "Advanced"),
            new Skill("Spring Boot", "Intermediate"),
            new Skill("HTML", "Advanced"),
            new Skill("CSS", "Intermediate"),
            new Skill("JavaScript", "Intermediate"),
            new Skill("MySQL", "Intermediate")
        );

        model.addAttribute("skills", skills);

        List<Project> projects = List.of(

            new Project(
                "Student Management System",
                "A web application to manage student records.",
                "Java, Spring Boot, MySQL"
            ),

            new Project(
                "Todo Application",
                "An application to create and manage daily tasks.",
                "Java, Spring Boot, MySQL, HTML, CSS"
            )
        );

        model.addAttribute("projects", projects);

        model.addAttribute("email", "ap2005aryanpatel@gmail.com");

        model.addAttribute("github",
            "https://github.com/ARYAN4940");

        model.addAttribute("linkedin",
            "https://www.linkedin.com/");

        return "index";
    }
}