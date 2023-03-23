package etec.com.gustavo.henrique.utilities;

import android.widget.EditText;

/**
 * Classe para Validar dados
 */
public class Valida {

	/**
	 * [camposObrigatorios description]
	 * @param  edtUm   [description]
	 * @param  edtDois [description]
	 * @return         [description]
	 */
	public static boolean camposObrigatorios(EditText edtUm, EditText edtDois) {
		if (edtUm.getText().toString().isEmpty()) 
		{
      edtUm.setError("Campo obrigatório!");
      edtUm.requestFocus();

      return false;
    } 
    else if (edtDois.getText().toString().isEmpty()) 
    {
      edtDois.setError("Campo obrigatório!");
      edtDois.requestFocus();

      return false;
    }

		return true;
	}

	/**
	 * [campoObrigatorio description]
	 * @param  edtUm   [description]
	 * @param  edtDois [description]
	 * @return         [description]
	 */
	public static boolean campoObrigatorio(EditText edt) {
		if (edt.getText().toString().isEmpty()) 
		{
      edt.setError("Campo obrigatório!");
      edt.requestFocus();

      return false;
    } 

		return true;
	}	

}


