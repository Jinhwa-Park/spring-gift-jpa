package gift.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class ProductDTO {

    @Size(max = 15, message = "?ν ?΄λ¦? μ΅λ? 15?κΉμ§ ?λ ₯?????μ΅?λ€.")
    @Pattern(
            regexp = "^[a-zA-Z0-9 ()\\[\\]+,&/_-]*$",
            message = "?ν ?΄λ¦?λ ?λ¬Έ?? ?«μ, κ³΅λ°±, (), [], +, -, &, /, _ λ§??¬μ©?????μ΅?λ€."
    )
    public String name;

    @NotNull(message = "?ν κ°κ²©μ? ?μ ??ͺ©?λ??")
    public Integer price;

    @NotEmpty(message = "?΄λ?μ§ URL? ?μ ??ͺ©?λ??")
    public String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.contains("μΉ΄μΉ΄??)) {
            throw new IllegalArgumentException("?ν ?΄λ¦??'μΉ΄μΉ΄??κ° ?¬ν¨??κ²½μ° ?΄λΉ MD? ?μκ° ?μ?©λ??");
        }
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

