package ex7;

public class Main7 {
    public static void main(String[] args) {

        CurrencyConverter converter=new CurrencyConverter();
        Dram dram=new Dram();
        Dram dram1=new Dram();
        dram.setCurr(500);

        Dollar dollar=new Dollar();
        Dollar dollar1=new Dollar();
        dollar.setCurr(1);

        Ruble ruble=new Ruble();
        Ruble ruble1=new Ruble();
        ruble.setCurr(78);


        System.out.println((dram.getCurr()+" dram is "+converter.convert(dram, dollar1).getCurr()+" dollar"));
        System.out.println((dram.getCurr()+" dram is "+converter.convert(dram, ruble1).getCurr())+" ruble");

        System.out.println(dollar.getCurr()+" dollar is "+converter.convert(dollar,dram1).getCurr()+" dram");
        System.out.println(dollar.getCurr()+" dollar is "+converter.convert(dollar,ruble1).getCurr()+" ruble");

        System.out.println(ruble.getCurr()+" ruble is "+converter.convert(ruble,dram1).getCurr()+" dram");
        System.out.println(ruble.getCurr()+" ruble is "+converter.convert(ruble,dollar1).getCurr()+" dollar");
    }
}
