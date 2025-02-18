package fetch.challenge.receiptprocessor.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import fetch.challenge.receiptprocessor.domain.data.Receipt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ReceiptProcessorTest {

    @Autowired
    private ReceiptProcessor receiptProcessor;

    @Test
    void testGetPointsTarget() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("receiptTarget.json");
        Receipt receipt = objectMapper.readValue(inputStream, Receipt.class);
        receipt.setId(UUID.randomUUID());

        receiptProcessor.processReceipt(receipt);
        int points = receiptProcessor.getPoints(receipt.getId());

        assertThat(points).isEqualTo(28);
    }

    @Test
    void testGetPointsMM() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("receiptMM.json");
        Receipt receipt = objectMapper.readValue(inputStream, Receipt.class);
        receipt.setId(UUID.randomUUID());

        receiptProcessor.processReceipt(receipt);
        int points = receiptProcessor.getPoints(receipt.getId());

        assertThat(points).isEqualTo(109);
    }
}