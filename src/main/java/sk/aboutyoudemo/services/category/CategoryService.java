package sk.aboutyoudemo.services.category;

import org.springframework.stereotype.Service;
import sk.aboutyoudemo.entity.category.Category;
import sk.aboutyoudemo.repository.category.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategoriesByLabel(String label) {
        return categoryRepository.findByCategoryLabel(label);
    }
}

