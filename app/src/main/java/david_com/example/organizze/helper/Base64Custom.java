package david_com.example.organizze.helper;

import android.util.Base64;

import java.nio.charset.StandardCharsets;

public class Base64Custom {

    public static String codificarBase64(String texto){
        return Base64.encodeToString(texto.getBytes(),Base64.NO_WRAP)
                .replace("(\\n|\\r)","");
    }

    public static String decodificarBase64(String textoCodificado){
        return new String(Base64.decode(textoCodificado, Base64.DEFAULT));
    }
}
