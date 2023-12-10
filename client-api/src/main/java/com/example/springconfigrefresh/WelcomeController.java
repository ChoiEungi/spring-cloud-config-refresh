package com.example.springconfigrefresh;

import com.example.springconfigrefresh.application.ConfigRefreshScheduler.TestValueProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WelcomeController {

  private final TestValueProperties testValueProperties;

  @GetMapping("/")
  public String welcome(){
    return "Welcome to Spring Config Refresh!";
  }

  @GetMapping("/my")
  public String my(){
    return testValueProperties.getValue();
  }


}
