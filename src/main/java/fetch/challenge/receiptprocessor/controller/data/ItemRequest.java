package fetch.challenge.receiptprocessor.controller.data;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ItemRequest {
    String shortDescription;
    String price;
}
