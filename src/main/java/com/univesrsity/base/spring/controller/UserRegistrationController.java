package com.univesrsity.base.spring.controller;

import com.univesrsity.base.spring.service.UserService;
import com.univesrsity.base.spring.service.dto.UserRegistrationDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

  private UserService userService;

  @ModelAttribute("user")
  public UserRegistrationDto userRegistrationDto() {
    return new UserRegistrationDto();
  }

  @GetMapping
  public String showRegistrationForm() {
    return "registration";
  }

  @PostMapping
  public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
    userService.save(registrationDto);
    return "redirect:/registration?success";
  }
}