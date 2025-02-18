package fetch.challenge.receiptprocessor.domain.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Receipt {
    private UUID id;
    private String retailer;
    private LocalDate purchaseDate;
    private LocalTime purchaseTime;
    private List<Item> items;
    private String total;
}
