package com.newlight77.kata.survey.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MailServiceConfig {

  private String from;

  private String[] to;

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String[] getTo() {
    return to;
  }

  public void setTo(String[] to) {
    this.to = to;
  }  
}
