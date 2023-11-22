package WebP.CarrotMarket.jpa.DTO;

import WebP.CarrotMarket.domain.Category;
import WebP.CarrotMarket.domain.Product;
import WebP.CarrotMarket.domain.ProductStatus;
import WebP.CarrotMarket.domain.Trade;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private int price;
    private LocalDateTime date;
    private ProductStatus status;
    private ProductStatus isSelled;
    private Trade trade;
    private List<Category> categories;

    public ProductDTO(Product product){
        this.id = product.getId();
        this.price = product.getPrice();
        this.date = product.getDate();
        this.status = product.getStatus();
        this.trade = product.getTrade();
        this.categories = product.getCategories();
    }

}
