package fetch.challenge.receiptprocessor.controller;

import fetch.challenge.receiptprocessor.controller.data.GetPointsResponse;
import fetch.challenge.receiptprocessor.controller.data.ItemRequest;
import fetch.challenge.receiptprocessor.controller.data.ProcessReceiptRequest;
import fetch.challenge.receiptprocessor.controller.data.ProcessReceiptResponse;
import fetch.challenge.receiptprocessor.domain.data.Item;
import fetch.challenge.receiptprocessor.domain.data.Receipt;
import lombok.experimental.UtilityClass;

import java.util.UUID;
import java.util.stream.Collectors;

@UtilityClass
public class ResponseMapper {

    public static ProcessReceiptResponse map(UUID id) {
        return new ProcessReceiptResponse(id.toString());
    }

    public static GetPointsResponse map(int points) {
        return new GetPointsResponse(points);
    }
}
