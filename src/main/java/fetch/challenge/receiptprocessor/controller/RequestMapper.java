package fetch.challenge.receiptprocessor.controller;

import fetch.challenge.receiptprocessor.controller.data.ItemRequest;
import fetch.challenge.receiptprocessor.controller.data.ProcessReceiptRequest;
import fetch.challenge.receiptprocessor.domain.data.Item;
import fetch.challenge.receiptprocessor.domain.data.Receipt;
import lombok.experimental.UtilityClass;

import java.util.UUID;
import java.util.stream.Collectors;

@UtilityClass
public class RequestMapper {

    public Receipt map(ProcessReceiptRequest request) {
        return Receipt.builder()
                .id(UUID.randomUUID())
                .retailer(request.getRetailer())
                .purchaseDate(request.getPurchaseDate())
                .purchaseTime(request.getPurchaseTime())
                .items(request.getItems().stream()
                        .map(RequestMapper::map)
                        .collect(Collectors.toList()))
                .total(request.getTotal())
                .build();
    }

    public Item map(ItemRequest request) {
        return Item.builder()
                .shortDescription(request.getShortDescription())
                .price(request.getPrice())
                .build();
    }
}
