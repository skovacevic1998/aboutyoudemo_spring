package sk.aboutyoudemo.controllers.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.aboutyoudemo.entity.product.Product;
import sk.aboutyoudemo.services.product.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/{categoryForAPI}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String categoryForAPI) {
        return ResponseEntity.ok(new ArrayList<Product>(productService.getProductsByCategory(categoryForAPI)));
    }
}
