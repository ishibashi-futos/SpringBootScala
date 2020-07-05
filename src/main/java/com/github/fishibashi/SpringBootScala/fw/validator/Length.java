package com.github.fishibashi.SpringBootScala.fw.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {LengthConstraint.class})
public @interface Length {
  String message() default "length error";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
  int max() default 65535;
  int min() default 0;
}
