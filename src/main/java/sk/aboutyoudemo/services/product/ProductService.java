package sk.aboutyoudemo.services.product;

import org.springframework.stereotype.Service;
import sk.aboutyoudemo.entity.product.Product;
import sk.aboutyoudemo.repository.product.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getProductsByCategory(String categoryName){
        return productRepository.findProductsByCategory(categoryName);
    }
}
