package fetch.challenge.receiptprocessor.controller.data;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Valid
@Value
@Builder
public class ProcessReceiptRequest {

    @NotEmpty
    @Pattern(regexp = "^[\\w\\s]+$")
    String retailer;
    String purchaseDate;
    String purchaseTime;
    List<ItemRequest> items;
    String total;
}
