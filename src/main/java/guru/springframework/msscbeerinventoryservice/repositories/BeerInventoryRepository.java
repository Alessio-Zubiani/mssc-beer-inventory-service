package guru.springframework.msscbeerinventoryservice.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.msscbeerinventoryservice.domain.BeerInventory;

@Repository
public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {

	List<BeerInventory> findAllByBeerId(UUID beerId);
	
}
