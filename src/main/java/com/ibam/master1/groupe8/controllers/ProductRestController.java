package com.ibam.master1.groupe8.controllers;

import com.ibam.master1.groupe8.entities.Produit;
import com.ibam.master1.groupe8.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
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
    public ResponseEntity<List<Produit>> getAllProduits() {
        return ResponseEntity.ok(produitRepository.findAll());
    }
    @PostMapping()
    public ResponseEntity<Produit> createProduit(@RequestBody Produit produit) {
        return ResponseEntity.ok(produitRepository.save(produit));
    }
    @PutMapping("/{id_produit}")
    public ResponseEntity<Produit> findProduit(@PathVariable("id-produit") Long idProduit, @RequestBody Produit produit) {
        return ResponseEntity.ok(produitRepository.save(produit));
    }
}
