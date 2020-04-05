package pl.wylezek.shopservice.exception.custom;

public class EntityNotFound extends RuntimeException {

    public EntityNotFound() {
        super("Not found such entity");
    }
}
