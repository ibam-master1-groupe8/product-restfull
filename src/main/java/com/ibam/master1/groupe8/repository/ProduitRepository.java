package com.ibam.master1.groupe8.repository;

import com.ibam.master1.groupe8.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author S. Lamoussa OUATTARA
 * @date 28/08/2024
 */
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
