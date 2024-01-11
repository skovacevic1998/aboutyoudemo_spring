package sk.aboutyoudemo.controllers.product;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sk.aboutyoudemo.entity.product.Product;
import sk.aboutyoudemo.services.product.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{categoryForAPI}")
    public Page<Product> getProductsByPage(@PathVariable String categoryForAPI,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "8") int size){
        return productService.getProductsByCategoryAndPage(categoryForAPI, page, size);
    }
}
