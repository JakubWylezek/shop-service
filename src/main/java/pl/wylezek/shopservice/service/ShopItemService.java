package pl.wylezek.shopservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.wylezek.shopservice.exception.custom.EntityNotFound;
import pl.wylezek.shopservice.model.ShopItem;
import pl.wylezek.shopservice.repository.ShopItemRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ShopItemService {

    private ShopItemRepository shopItemRepository;

    public ShopItem getItemByName(String name) {
        return shopItemRepository.findByName(name).orElseThrow(EntityNotFound::new);
    }

    public List<ShopItem> getAllItems() {
        return shopItemRepository.findAll();
    }

    public void addNewItem(ShopItem shopItem) {
        shopItemRepository.save(shopItem);
    }
}
