package listeners;

import models.loan.LoanReply;
import models.loan.LoanRequest;

public interface LoanReplyListener {

    void onLoanReplyArrived(LoanRequest loanRequest, LoanReply reply);
}
