package com.ibam.master1.groupe8.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @author S. Lamoussa OUATTARA
 * @date 28/08/2024
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "produits")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produit", nullable = false, unique = true)
    private Long idProduit;
    @Column(name = "nom", nullable = false, length = 100)
    private String nom;
    @Column(name = "prix_achat", nullable = false)
    private Double prixAchat;
    @Column(name = "prix_vente", nullable = false)
    private Double prixVente;
    @Column(name = "quantite_stock", nullable = false, columnDefinition = "integer default 0")
    private Integer quantiteStock;
    @Column(name = "seuil_minimum", nullable = false, columnDefinition = "integer default 5")
    private Integer seuilMinimum;
    @Column(name = "date_entree_stock", nullable = false)
    private LocalDate dateEntreeStock;
    @Column(name = "date_peremption", nullable = false)
    private LocalDate datePeremption;
    @Column(name = "statut_disponibilite", nullable = false)
    private String statutDisponibilite;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "description")
    private String description;
}
