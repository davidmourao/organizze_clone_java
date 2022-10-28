package david_com.example.organizze.helper;

import java.text.SimpleDateFormat;

public class DateCustom {

    public static String dataAtual(){
        long data = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/M/yyyy");
        String dataString = simpleDateFormat.format(data);
        return dataString;


    }

    public static String mesAnoDataEscolhida(String data){
        String retornodata[] = data.split("/");
        String dia = retornodata[0]; //dia
        String mes = retornodata[1]; //mês
        String ano = retornodata[2]; //ano

        String mesAno = mes + ano;
        return mesAno;

    }
}
