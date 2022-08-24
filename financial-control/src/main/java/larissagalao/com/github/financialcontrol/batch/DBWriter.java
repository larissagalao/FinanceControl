package larissagalao.com.github.financialcontrol.batch;

import larissagalao.com.github.financialcontrol.entities.Bills;
import larissagalao.com.github.financialcontrol.repositories.BillsRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Bills> {

    private BillsRepository billRepository;

    @Autowired
    public DBWriter (BillsRepository billRepository) {
        this.billRepository = billRepository;
    }

    @Override
    public void write(List<? extends Bills> bill) throws Exception{
        System.out.println("Data Saved for Users: " + bill);
        billRepository.saveAll(bill);
    }
}
