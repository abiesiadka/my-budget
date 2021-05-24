package pl.sda.mybudget.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.mybudget.converter.IncomeConverter;
import pl.sda.mybudget.dto.IncomeDTO;
import pl.sda.mybudget.repository.IncomeRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Slf4j
public class IncomeServiceImpl implements IncomeService {

    private final IncomeRepository incomeRepository;
    private final IncomeConverter incomeConverter;

    public IncomeServiceImpl(final IncomeRepository incomeRepository, final IncomeConverter incomeConverter) {
        this.incomeRepository = incomeRepository;
        this.incomeConverter = incomeConverter;
    }

    @Override
    public List<IncomeDTO> findAllIncomes() {
        log.info("finding all incomes");
        return incomeRepository.findAll()
                .stream()
                //.map(income -> incomeConverter.fromEntity(income))
                .map(incomeConverter::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public IncomeDTO findIncomeById(Long idik) {
        log.info("trying to find income with id: [{}]", idik);
        return incomeRepository.findById(idik)
                .map(incomeConverter::fromEntity)
                .orElseThrow(()-> new NoSuchElementException("No income with id: " + idik));
    }

    @Override
    public IncomeDTO saveIncome(IncomeDTO incomeToSave) {
        log.info("trying to save: [{}]", incomeToSave);
        var entityToSave = incomeConverter.fromDTO(incomeToSave);
        return incomeConverter.fromEntity(incomeRepository.save(entityToSave));
    }
}
