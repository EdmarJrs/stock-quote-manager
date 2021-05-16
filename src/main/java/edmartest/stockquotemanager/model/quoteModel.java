package edmartest.stockquotemanager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "quote")
public class quoteModel {
    @Id
    public int id;
    @Column
    public String[] quotes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getQuotes() {
        return quotes;
    }

    public void setQuotes(String[] quotes) {
        this.quotes = quotes;
    }
}
