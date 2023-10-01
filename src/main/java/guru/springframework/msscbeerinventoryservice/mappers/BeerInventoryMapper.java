package guru.springframework.msscbeerinventoryservice.mappers;

import org.mapstruct.Mapper;

import guru.springframework.msscbeerinventoryservice.domain.BeerInventory;
import guru.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;

@Mapper(uses = { DateMapper.class } )
public interface BeerInventoryMapper {
	
	BeerInventoryDto beerInventoryToDto(BeerInventory beerInventory);

    BeerInventory dtoToBeerInventory(BeerInventoryDto dto);

}
