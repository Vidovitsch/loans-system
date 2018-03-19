package models.loan;

import correlation.Correlatable;

/**
 *
 * This class stores all information about a bank offer
 * as a response to a client loan request.
 */
public class LoanReply implements Correlatable {

    private double interest; // the interest that the bank offers
    private String bankID; // the unique quote identification

    private String correlationId;

    public LoanReply(double interest, String quoteID) {
        super();
        this.interest = interest;
        this.bankID = quoteID;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getQuoteID() {
        return bankID;
    }

    public void setQuoteID(String quoteID) {
        this.bankID = quoteID;
    }

    @Override
    public String getCorrelationId() {
        return correlationId;
    }

    @Override
    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    @Override
    public String toString(){
        return " interest="+String.valueOf(interest) + " quoteID="+String.valueOf(bankID);
    }
}