package guru.springframework.msscbeerinventoryservice.web.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.msscbeerinventoryservice.services.BeerInventoryService;
import guru.springframework.msscbeerinventoryservice.web.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/inventories")
@RestController
public class BeerInventoryController {
	
	private final BeerInventoryService beerInventoryService;

    
    @GetMapping("/beer/{beerId}/inventory")
    public ResponseEntity<List<BeerInventoryDto>> listBeersById(@PathVariable UUID beerId) {
    	
        log.debug(new StringBuilder("Finding Inventory for beerId: [").append(beerId).append("]").toString());

        return new ResponseEntity<List<BeerInventoryDto>>(this.beerInventoryService.findByBeerId(beerId), HttpStatus.OK);
    }

}
