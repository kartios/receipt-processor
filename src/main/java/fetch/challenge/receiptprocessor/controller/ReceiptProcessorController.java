package fetch.challenge.receiptprocessor.controller;

import fetch.challenge.receiptprocessor.controller.data.GetPointsResponse;
import fetch.challenge.receiptprocessor.controller.data.ProcessReceiptRequest;
import fetch.challenge.receiptprocessor.controller.data.ProcessReceiptResponse;
import fetch.challenge.receiptprocessor.domain.ReceiptProcessor;
import fetch.challenge.receiptprocessor.domain.data.Receipt;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/receipts")
public class ReceiptProcessorController {

    private final ReceiptProcessor receiptProcessor;

    @PostMapping("/process")
    public ProcessReceiptResponse processReceipt(@RequestBody @Valid ProcessReceiptRequest request) {
        Receipt receipt = RequestMapper.map(request);
        UUID id = receiptProcessor.processReceipt(receipt);
        return ResponseMapper.map(id);
    }

    @GetMapping("/{id}/points")
    public GetPointsResponse getPoints(@PathVariable String id) {
        int points = receiptProcessor.getPoints(UUID.fromString(id));
        return ResponseMapper.map(points);
    }
}
