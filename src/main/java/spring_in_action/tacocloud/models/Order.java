package spring_in_action.tacocloud.models;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class Order {

    private Long id;
    private Date placedAt;

    @NotBlank(message = "Name required")
    private String name;

    @NotBlank(message = "Street required")
    private String street;

    @NotBlank(message = "City required")
    private String city;

    @NotBlank(message = "State required")
    private String state;

    @NotBlank(message = "Zip required")
    private String zip;

    @CreditCardNumber(message = "Not a valid credit card")
    private String ccNumber;

    @Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
                message = "Must be formatted MM/YY")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "Invalid CCV")
    private String ccCVV;
}
