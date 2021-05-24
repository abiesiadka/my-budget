package pl.sda.mybudget.converter;

import pl.sda.mybudget.dto.IncomeDTO;
import pl.sda.mybudget.model.Income;
import pl.sda.mybudget.model.enumeration.IncomeType;

public class IncomeConverter implements DataConverter<Income, IncomeDTO> {

    @Override
    public IncomeDTO fromEntity(Income entity) {
        return new IncomeDTO(entity.getId(),
                entity.getAmountInPolishGrosz(),
                entity.getIncomeDate(),
                entity.getIncomeSource(),
                entity.getIncomeType().name());
    }

    @Override
    public Income fromDTO(IncomeDTO dto) {
        return new Income(dto.getId(),
                dto.getAmountInPolishGrosz(),
                dto.getIncomeDate(),
                dto.getIncomeSource(),
                IncomeType.valueOf(dto.getIncomeType())
                );
    }
}

