package excercise.taxes.cart.model;

import java.math.BigDecimal;

/**
 * @author sveneruso
 */
public class CartItem {

    private String productCode;
    private Integer quantity;
    private BigDecimal productUnitPrice;
    private BigDecimal productTax;
    private BigDecimal grossPrice;

    public CartItem() {
    }

    public CartItem(String productCode, Integer quantity, BigDecimal productUnitPrice, BigDecimal productTax,
                    BigDecimal grossPrice) {
        this.productCode = productCode;
        this.quantity = quantity;
        this.productUnitPrice = productUnitPrice;
        this.productTax = productTax;
        this.grossPrice = grossPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(BigDecimal productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public BigDecimal getProductTax() {
        return productTax;
    }

    public void setProductTax(BigDecimal productTax) {
        this.productTax = productTax;
    }

    public BigDecimal getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(BigDecimal grossPrice) {
        this.grossPrice = grossPrice;
    }
}
