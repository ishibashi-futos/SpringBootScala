package com.github.fishibashi.SpringBootScala.fw.validator;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class LengthConstraint implements ConstraintValidator<Length, String> {
  private int max;
  private int min;
  @Override
  public void initialize(Length constraintAnnotation) {
    this.min = constraintAnnotation.min();
    this.max = constraintAnnotation.max();
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    return value.length() >= min && value.length() <= max;
  }
}
