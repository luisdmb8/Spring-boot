package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoriId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),
    })
    Category toCategory(Category categoria);

    @InheritConfiguration
    @Mapping(target = "productos", ignore = true)
    Category toCategoria(Category categoria);


}
