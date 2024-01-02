package sk.aboutyoudemo.controllers.category;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.aboutyoudemo.entity.category.Category;
import sk.aboutyoudemo.services.category.CategoryService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final CategoryService categoryService; 

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/{label}")
    public ResponseEntity<List<Category>> getCategoriesByLabel(@PathVariable String label) {
        return ResponseEntity.ok(new ArrayList<Category>(categoryService.getCategoriesByLabel(label)));
    }
}
