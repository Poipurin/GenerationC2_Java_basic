package cl.generation.f20221024;

public class ConversiónDatos {

	public static void main(String[] args) {

		/*
		 * Integer numero3 = 50; Long numero4 = 15445657474L; Float numero5 = 63465732F;
		 * Double numero6 = 245463223D;
		 */

		// System.out.println(numero3.getClass());

		/*
		 * System.out.println((numero3).longValue());
		 * System.out.println((numero3).floatValue());
		 * System.out.println((numero3).doubleValue());
		 * System.out.println((numero5).intValue());
		 * System.out.println((numero5).longValue());
		 * System.out.println((numero5).doubleValue());
		 * System.out.println((numero4).intValue());
		 * System.out.println((numero4).floatValue());
		 * System.out.println((numero4).doubleValue());
		 * System.out.println((numero6).intValue());
		 * System.out.println((numero6).floatValue());
		 * System.out.println((numero6).longValue());
		 */

		// cambio Int
		System.out.println("Transformación de Integer a:");
		Integer numero1 = 32524364;

		Long integerToLong = Long.valueOf(numero1);
		Double integerToDouble = Double.valueOf(numero1);
		Float integerToFloat = Float.valueOf(numero1);
		String integerToString = String.valueOf(numero1);

		System.out.println("Long " + integerToLong);
		System.out.println("Double " + integerToDouble);
		System.out.println("Float " + integerToFloat);
		System.out.println("String " + integerToString);

		// Cambio de Long
		System.out.println("                              ");
		System.out.println("Transformación de Long a:");
		Long numero2 = 123L;

		Double longToDouble = Double.valueOf(numero2);
		Float longToFloat = Float.valueOf(numero2);

		System.out.println("Double " + longToDouble);
		System.out.println("Float " + longToFloat);

		// Cambio de Float
		System.out.println("                              ");
		System.out.println("Transformación de Float a:");
		Float numero3 = 123.34634F;
		
		Integer floatToInteger = Integer.valueOf(numero3.intValue());
		
		
		System.out.println("Integer " + floatToInteger);
	}

	// Long intafloat = Long.parseLong(numero1+ ""); // EVITAR

}
