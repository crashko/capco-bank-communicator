package com.capco.communicator.schema;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Payment {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Bank bank;

    @ManyToOne
    private Account account;

    private long credit;

    private long debit;

    private String iban;

    private String notice;

    private boolean confirmation;

    private String reference;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public long getDebit() {
        return debit;
    }

    public void setDebit(long debit) {
        this.debit = debit;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public boolean isConfirmation() {
        return confirmation;
    }

    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", bank=" + bank +
                ", account=" + account +
                ", credit=" + credit +
                ", debit=" + debit +
                ", iban='" + iban + '\'' +
                ", notice='" + notice + '\'' +
                ", confirmation=" + confirmation +
                ", reference='" + reference + '\'' +
                '}';
    }
}
