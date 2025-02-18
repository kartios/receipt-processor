package fetch.challenge.receiptprocessor.controller.data;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Value;

@Valid
@Value
@Builder
public class ItemRequest {
    @NotEmpty
    @Pattern(regexp = "^[\\w\\s\\-]+$")
    String shortDescription;

    @NotEmpty
    @Pattern(regexp = "^\\d+\\.\\d{2}$")
    String price;
}
