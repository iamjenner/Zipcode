public class Zipcode{

    private int zip;
    private String barcode = "";
    private String bar1 = ":::||";
    private String bar2 = "::|:|";
    private String bar3 = "::||:";
    private String bar4 = ":|::|";
    private String bar5 = ":|:|:";
    private String bar6 = ":||::";
    private String bar7 = "|:::|";
    private String bar8 = "|::|:";
    private String bar9 = "|:|::";
    private String bar0 = "||:::";

    public Zipcode(int code){
        zip = code;
    }

    public Zipcode(String bar){
        barcode = bar;
    }

    public String getBarcode(){
       barcode = getBar(getCheckDigit()) + "|";
       int code = zip;
           for(int i = 0; i < 5 ; i++){
                int num = code%10;
                String temp = getBar(num);
                barcode = temp + barcode;
                code /= 10;     
            }
            barcode = "|" + barcode;
            return barcode;

    }

    public String getBar(int x){
        switch(x){
            case 1: 
                return bar1;
            case 2:
                return bar2;
            case 3:
                return bar3;
            case 4: 
                return bar4;
            case 5:
                return bar5;
            case 6:
                return bar6;
            case 7:
                return bar7;
            case 8:
                return bar8;
            case 9:
                return bar9;
            case 0:
                return bar0;
            default:
            return "";
        }
    }

    public int getCheckDigit(){
        int sum = 0;
        int code = zip;
        for(int i = 0; i < 5; i++){
            int num = code%10;
            sum += num;
            code /= 10;
        }
        int digit = 0;
        while((sum+digit)%10 != 0){
            digit++;
        }
        return digit;
    }

    public String convertBarToDigit(String bar){
        if(bar.equals(bar1)){
            return "1";
        }
        if(bar.equals(bar2)){
            return "2";
        }
        if(bar.equals(bar3)){
            return "3";
        }
        if(bar.equals(bar4)){
            return "4";
        }
        if(bar.equals(bar5)){
            return "5";
        }
        if(bar.equals(bar6)){
            return "6";
        }
        if(bar.equals(bar7)){
            return "7";
        }
        if(bar.equals(bar8)){
            return "8";
        }
        if(bar.equals(bar9)){
            return "9";
        }
        if(bar.equals(bar0)){
            return "0";
        }
        else{
            return "ERROR";
        }
    }

    public String getZIPcode(){
        String code = "";
        for(int i = 1; i < barcode.length() - 6; i = i+5){
            String temp = barcode.substring(i, i+5);
            code += convertBarToDigit(temp);
        }

        return code;
    }


}
