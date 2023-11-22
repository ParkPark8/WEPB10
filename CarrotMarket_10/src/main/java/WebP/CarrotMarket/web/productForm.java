package WebP.CarrotMarket.web;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class productForm {
    private String name;
    private int price;
    private String status;
    private String trade;
}
