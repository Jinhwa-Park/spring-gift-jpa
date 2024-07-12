package gift.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class Member {
    private Long id;

    @Email(message = "?�메???�식???�바르�? ?�습?�다.")
    @NotEmpty(message = "?�메?��? ?�수 ??��?�니??")
    private String email;

    @NotEmpty(message = "비�?번호???�수 ??��?�니??")
    private String password;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

