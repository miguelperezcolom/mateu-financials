package io.mateu.financials.client;

import io.mateu.financials.domain.model.*;
import io.mateu.mdd.core.annotations.MateuUI;
import io.mateu.mdd.shared.annotations.MenuOption;

@MateuUI(path = "")
public class Intranet {

    @MenuOption
    Class companies = Company.class;

    @MenuOption
    Class offices = Office.class;

    @MenuOption
    Class taxes = Tax.class;

    @MenuOption
    Class agents = FinancialAgent.class;

    @MenuOption
    Class customers = Customer.class;

    @MenuOption
    Class providers = Provider.class;

    @MenuOption
    Class commissionAgents = CommissionAgent.class;

    @MenuOption
    Class items = Item.class;

    @MenuOption
    Class quotations = Quotation.class;

    @MenuOption
    Class orders = Order.class;

    @MenuOption
    Class invoices = Invoice.class;

    @MenuOption
    Class commissions = Commission.class;

    @MenuOption
    Class litigations = Litigation.class;

    @MenuOption
    Class mathodsOfPayment = MethodOfPayment.class;

    @MenuOption
    Class accounts = Account.class;

    @MenuOption
    Class payments = Payment.class;
}

