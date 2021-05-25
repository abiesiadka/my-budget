package pl.sda.mybudget.controller.rest;

import org.springframework.web.bind.annotation.*;
import pl.sda.mybudget.dto.IncomeDto;
import pl.sda.mybudget.service.IncomeService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/rest/incomes")
public class IncomeRestController {

    private final IncomeService incomeService;

    public IncomeRestController(final IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    // Select all
    @GetMapping
    List<IncomeDto> getAllIncomes() {
        return incomeService.findAllIncomes();
    }

    // Select by id
    // /rest/incomes/1
    // /rest/incomes/2
    // /rest/incomes/n - id of income goes here
    @GetMapping("/{id}")
    IncomeDto findById(@PathVariable("id") Long idik) {
        return incomeService.findIncomeById(idik);
    }

    // send json to save inside request body
    @PostMapping
    IncomeDto createNewIncome(@RequestBody IncomeDto incomeToSave) {
        return incomeService.saveIncome(incomeToSave);
    }
}
