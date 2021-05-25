package pl.sda.mybudget.service;

import pl.sda.mybudget.dto.IncomeDTO;

import java.util.List;

public interface IncomeService {
    List<IncomeDTO> findAllIncomes();

    IncomeDTO findIncomeById(Long idik);

    IncomeDTO saveIncome(IncomeDTO incomeToSave);
}
