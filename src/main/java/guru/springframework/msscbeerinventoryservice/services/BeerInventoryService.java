package guru.springframework.msscbeerinventoryservice.services;

import java.util.List;
import java.util.UUID;

import guru.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;

public interface BeerInventoryService {
	
	List<BeerInventoryDto> findByBeerId(UUID beerId);

}
