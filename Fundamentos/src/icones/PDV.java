package icones;

import java.text.DateFormat;
import java.util.Date;

public class PDV {

	public static void main(String[] args) {
		//Date -> trabalhar com Data
		Date data = new Date();
        //Formatar a data
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(formatador.format(data));
	}

}
