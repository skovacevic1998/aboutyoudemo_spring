package sk.aboutyoudemo.services;

import org.springframework.stereotype.Service;
import sk.aboutyoudemo.entity.Category;
import sk.aboutyoudemo.repository.CategoryRepository;

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

