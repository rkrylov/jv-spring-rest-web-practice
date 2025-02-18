package mate.academy.spring.service;

import mate.academy.spring.model.MovieSession;
import mate.academy.spring.model.ShoppingCart;
import mate.academy.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUserId(Long userId);

    void registerNewShoppingCart(User user);

    void clearShoppingCart(ShoppingCart cart);
}
