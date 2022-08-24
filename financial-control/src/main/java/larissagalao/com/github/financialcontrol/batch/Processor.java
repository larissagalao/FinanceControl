package larissagalao.com.github.financialcontrol.batch;

import larissagalao.com.github.financialcontrol.entities.Bills;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class Processor implements ItemProcessor<Bills, Bills> {

    @Override
    public Bills process(Bills bill) throws Exception {
        return bill;
    }
}

