package com.ibam.master1.groupe8.controllers;

import com.ibam.master1.groupe8.dto.PageResponse;
import com.ibam.master1.groupe8.entities.Produit;
import com.ibam.master1.groupe8.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author S. Lamoussa OUATTARA
 * @date 28/08/2024
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/produits")
public class ProductRestController {
    private final ProduitRepository produitRepository;
    @GetMapping()
    public ResponseEntity<PageResponse<Produit>> getAllProduits(@RequestParam(name = "page", defaultValue = "0", required = false) int page,
                                                        @RequestParam(name = "size", defaultValue = "10", required = false) int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("idProduit").descending());
        Page<Produit> produitPage = produitRepository.findAll(pageable);
        PageResponse<Produit> products = new PageResponse<>(
                produitPage.stream().toList(),
                produitPage.getNumber(),
                produitPage.getSize(),
                produitPage.getTotalElements(),
                produitPage.getTotalPages(),
                produitPage.isFirst(),
                produitPage.isLast()
        );
        return ResponseEntity.ok(products);
    }
    @PostMapping()
    public ResponseEntity<Produit> createProduit(@RequestBody Produit produit) {
        return ResponseEntity.ok(produitRepository.save(produit));
    }
    @PutMapping("/{id-produit}")
    public ResponseEntity<Produit> findProduit(@PathVariable("id-produit") Long idProduit, @RequestBody Produit produit) {
        return ResponseEntity.ok(produitRepository.save(produit));
    }

    @GetMapping("/{id-produit}")
    public ResponseEntity<Produit> findProduit(@PathVariable("id-produit") Long idProduit) {
        return ResponseEntity.ok(produitRepository.findById(idProduit).get());
    }
    @DeleteMapping("/{id-produit}")
    public void deleteProduct(@PathVariable("id-produit") Long idProduit) {
        produitRepository.deleteById(idProduit);
    }
}
