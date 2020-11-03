package it.unibo.oop.lab.exception2;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
    	
    	AccountHolder accH1 = new AccountHolder("Mario", "Rossi", 6274902);
    	AccountHolder accH2 = new AccountHolder("Franco", "Blanchi", 6214754);
    	
    	StrictBankAccount strBH1 = new StrictBankAccount(accH1.getUserID(), 10000, 10);
    	StrictBankAccount strBH2 = new StrictBankAccount(accH2.getUserID(), 10000, 10);
    	
    	try {
    		strBH1.withdrawFromATM(accH1.getUserID(), 45454533);
    	}catch(TransactionsOverQuotaException | WrongAccountHolderException | NotEnoughFoundsException e) {
    		System.out.println(e.toString());
    	}
    	
    	
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         * 
         * 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    }
}
