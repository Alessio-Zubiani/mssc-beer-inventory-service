package guru.springframework.msscbeerinventoryservice.services;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import guru.springframework.msscbeerinventoryservice.mappers.BeerInventoryMapper;
import guru.springframework.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import guru.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BeerInventoryServiceImpl implements BeerInventoryService {
	
	private final BeerInventoryRepository beerInventoryRepository;
	private final BeerInventoryMapper beerInventoryMapper;
	

	@Override
	public List<BeerInventoryDto> findByBeerId(UUID beerId) {
		
		return this.beerInventoryRepository.findAllByBeerId(beerId)
				.stream()
				.map(this.beerInventoryMapper::beerInventoryToDto)
				.collect(Collectors.toList());
	}

}
