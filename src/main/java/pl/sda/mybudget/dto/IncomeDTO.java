package pl.sda.mybudget.dto;


import lombok.Value;
import pl.sda.mybudget.model.enumeration.IncomeType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

// data transfer Object
//dtos should be immutable
@Value
public class IncomeDTO {
     Long id;
     long amountInPolishGrosz;
     LocalDate incomeDate;
     String incomeSource;
     String incomeType;
}
