package ua.com.pahaoks.store.entities;

import java.util.Queue;

import static java.lang.Thread.sleep;

/**
 * Created by lutsishinpa on 13.06.2017.
 */
public class CashDesk implements Runnable {
    private final int number;
    private final Queue<Customer> customers;
    private final Cashier cashier;

    public CashDesk(Cashier cashier, Queue<Customer> queue, int number) {
        this.cashier = cashier;
        this.customers = queue;
        this.number = number;
    }

    private void internalSleep(int milis) {
        try {
            sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        int totalTime = 0;
        int numOfCust = 0;
        int customerCount = 0;
        Customer customer;

        while(true) {
            synchronized (customers) {
                customer = customers.poll();
                customerCount = customers.size();
            }
            if (customer != null) {
                totalTime = 0;
                System.out.println("CashDesk number " + number + " start work with client");
                Strategy<Customer> cashierStrategy = cashier.strategy(customer.getClass());
                totalTime += cashierStrategy.communicate(customer);
                Strategy<Cashier> customerStrategy = customer.strategy(cashier.getClass());
                totalTime += customerStrategy.communicate(cashier);
                numOfCust++;

                internalSleep(totalTime * 1000);
                System.out.println("CashDesk number " + number + " finished work with client for " + totalTime + " seconds. Left " + customerCount);
            }
            internalSleep(1000);
        }
    }
}
