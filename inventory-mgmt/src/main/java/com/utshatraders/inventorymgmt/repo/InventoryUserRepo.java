package com.utshatraders.inventorymgmt.repo;

import com.utshatraders.inventorymgmt.model.InventoryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryUserRepo extends JpaRepository<InventoryUser, Integer> {

}
