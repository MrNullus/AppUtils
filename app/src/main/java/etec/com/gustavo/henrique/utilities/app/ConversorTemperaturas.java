package etec.com.gustavo.henrique.utilities;

/**
* 
*/
public class ConversorTemperatura {

	//---------------- Celsius
	/**	
	 * [CelsiusToKelvin description]
	 * @param  celsius [description]
	 * @return         [description]
	 */
	public static float CelsiusToKelvin(float celsius) {
		return celsius + 273.15f;
	}
	
	/**
	 * [CelsiusToFahre description]
	 * @param  celsius [description]
	 * @return         [description]
	 */
	public static float CelsiusToFahre(float celsius) {
		return (celsius * 1.8f) + 32f;
	}


	//----------------- Kelvin
	/**
	 * [KelvinToCelsius description]
	 * @param  kelvin [description]
	 * @return        [description]
	 */
	public static float KelvinToCelsius(float kelvin) {
		return kelvin - 273.15f;
	}

	/**
	 * [KelvinToFahre description]
	 * @param  kelvin [description]
	 * @return        [description]
	 */
	public static float KelvinToFahre(float kelvin) {
		return (( kelvin - 273.15f ) * 1.8f ) + 32f;
	}	


	//----------------- Fahre
	/**
	 * [FahreToKelvin description]
	 * @param  fahre [description]
	 * @return       [description]
	 */
	public static float FahreToKelvin(float fahre) {
		return ((fahre - 32f) * 0.55555f) + 273.15f;
	}

	/**
	 * [FahreToKelvin description]
	 * @param  fahre [description]
	 * @return       [description]
	 */
	public static float FahreCelsius(float fahre) {
		return (fahre - 32f) * 0.55555f;
	}

}

