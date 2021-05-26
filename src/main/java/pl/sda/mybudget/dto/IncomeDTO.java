package pl.sda.mybudget.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.time.LocalDate;

// data transfer Object
//dtos should be immutable
@Value
public class IncomeDTO {
     @JsonProperty("idik")
     Long id;

     @JsonProperty("kwota")
     long amountInPolishGrosz;

     @JsonProperty("dzien wyplaty")
     LocalDate incomeDate;

     @JsonProperty("zrodlo")
     String incomeSource;

     @JsonProperty("typ")
     String incomeType;
}
