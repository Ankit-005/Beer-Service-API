package ankit.springframework.spring6restmvc.mappers;

import ankit.springframework.spring6restmvc.entities.Beer;
import ankit.springframework.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}