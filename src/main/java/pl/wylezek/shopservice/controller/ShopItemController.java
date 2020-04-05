package pl.wylezek.shopservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.wylezek.shopservice.model.ShopItem;
import pl.wylezek.shopservice.service.ShopItemService;

import java.util.List;

@RestController
@RequestMapping("/shopitems")
@AllArgsConstructor
public class ShopItemController {

    private ShopItemService shopItemService;

    @GetMapping("/all")
    public ResponseEntity<List<ShopItem>> getAllShopItems() {
        return new ResponseEntity<>(shopItemService.getAllItems(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<ShopItem> getByName(@RequestParam("name") String name) {
        return new ResponseEntity<>(shopItemService.getItemByName(name), HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity addNewItem(@RequestBody ShopItem shopItem) {
        shopItemService.addNewItem(shopItem);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
