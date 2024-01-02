package sk.aboutyoudemo.entity.product;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "product_category")
    private String product_category;
    @Column(name = "product_name")
    private String product_name;
    @Column(name = "product_price")
    private BigDecimal product_price;
    @Column(name = "product_color")
    private String product_color;
    @Column(name = "product_size")
    private String product_size;
    @Column(name = "product_design")
    private String product_design;
    @Column(name = "product_cut")
    private String product_cut;
    @Column(name = "product_material")
    private String product_material;
    @Column(name = "product_availability")
    private int product_availability;
    @Column(name = "product_image")
    private String product_image;
    @Column(name = "tstamp")
    private Timestamp tstamp;

    public Product() {
        super();
    }

    public Product(long id, String product_category, String product_name, BigDecimal product_price, String product_color, String product_size, String product_design, String product_cut, String product_material, int product_availability, String product_image, Timestamp tstamp) {
        this.id = id;
        this.product_category = product_category;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_color = product_color;
        this.product_size = product_size;
        this.product_design = product_design;
        this.product_cut = product_cut;
        this.product_material = product_material;
        this.product_availability = product_availability;
        this.product_image = product_image;
        this.tstamp = tstamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public BigDecimal getProduct_price() {
        return product_price;
    }

    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getProduct_design() {
        return product_design;
    }

    public void setProduct_design(String product_design) {
        this.product_design = product_design;
    }

    public String getProduct_cut() {
        return product_cut;
    }

    public void setProduct_cut(String product_cut) {
        this.product_cut = product_cut;
    }

    public String getProduct_material() {
        return product_material;
    }

    public void setProduct_material(String product_material) {
        this.product_material = product_material;
    }

    public int getProduct_availability() {
        return product_availability;
    }

    public void setProduct_availability(int product_availability) {
        this.product_availability = product_availability;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public Timestamp getTstamp() {
        return tstamp;
    }

    public void setTstamp(Timestamp tstamp) {
        this.tstamp = tstamp;
    }
}
