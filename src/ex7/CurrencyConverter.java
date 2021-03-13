package ex7;

public class CurrencyConverter {

    public Dollar convert(Dram dram, Dollar dollar) {
        dollar.setCurr(dram.getCurr() / 520);
        return dollar;
    }
    public Dollar convert(Ruble ruble, Dollar dollar) {

        dollar.setCurr(ruble.getCurr() * 0.013);
        return dollar;
    }

    public Ruble convert(Dram dram, Ruble ruble) {

        ruble.setCurr(dram.getCurr() / 7.35);
        return ruble;
    }
    public Ruble convert(Dollar dollar, Ruble ruble) {

        ruble.setCurr(dollar.getCurr() * 70.99);
        return ruble;
    }
    public Dram convert(Ruble ruble, Dram dram) {

        dram.setCurr(ruble.getCurr() * 7.3);
        return dram;
    }
    public Dram convert(Dollar dollar, Dram dram) {

        dram.setCurr(dollar.getCurr() * 520);
        return dram;
    }
}
