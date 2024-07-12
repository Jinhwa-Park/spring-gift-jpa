package gift.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class MemberDTO {

    @Email(message = "?�효???�메??주소�??�력?�주?�요.")
    @NotEmpty(message = "?�메?��? ?�수 ??��?�니??")
    public String email;

    @Size(min = 6, message = "비�?번호??최소 6???�상?�어???�니??")
    @NotEmpty(message = "비�?번호???�수 ??��?�니??")
    public String password;

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

