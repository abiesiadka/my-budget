package pl.sda.mybudget.converter;


public interface DataConverter<E, D>{
    D fromEntity(E entity);
    E fromDTO(D dto);


}
