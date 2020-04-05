package pl.wylezek.shopservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wylezek.shopservice.model.ShopItem;

import java.util.Optional;

@Repository
public interface ShopItemRepository extends JpaRepository<ShopItem, Long> {

    public Optional<ShopItem> findByName(String name);
}
