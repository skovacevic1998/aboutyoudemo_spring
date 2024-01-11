package sk.aboutyoudemo.services.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import sk.aboutyoudemo.entity.product.Product;
import sk.aboutyoudemo.repository.product.ProductRepository;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Page<Product> getProductsByCategoryAndPage(String categoryForAPI, int page, int size){
        PageRequest pageable = PageRequest.of(page, size);
        return productRepository.findByProductCategory(categoryForAPI, pageable);
    }
}
