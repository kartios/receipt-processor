package fetch.challenge.receiptprocessor.controller.data;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Valid
@Value
@Builder
public class ProcessReceiptRequest {

    @NotEmpty
    @Pattern(regexp = "^[\\w\\s\\-&]+$")
    String retailer;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate purchaseDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    LocalTime purchaseTime;

    @Valid
    List<ItemRequest> items;

    @NotEmpty
    @Pattern(regexp = "^\\d+\\.\\d{2}$")
    String total;
}
