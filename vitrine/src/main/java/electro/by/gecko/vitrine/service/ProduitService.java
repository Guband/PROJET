package electro.by.gecko.vitrine.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProduitService {

    private final ProduitRepository produitRepository;

    public void placeholder(ProduuitRequest produuitRequest) {
    Produit produit = new Produit();
    produit.setProduitNumber(UUID.randomUUID().toString());

    list<ProduitLineItems> produitLineItems =produuitRequest.getProduitLineItemsDtoList().stream()
            .map(this::mapToDto)
            .toList();
    produit.setProduitLineItemsList(produitLineItems);
produitRepository.save(produit);

    }

    private produitLineItems mapToDto(produitLineItmsDto produitLineItemsDto) {
        ProduitLineItems produitLineItems = new ProduitLineItems();
    }
}
