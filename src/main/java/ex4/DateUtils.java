package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	/**
	 * Formate une date selon le motif spécifié.
	 *
	 * @param pattern le motif de formatage
	 * @param date    la date à formater
	 * @return la date formatée sous forme de chaîne
	 */
	public static String format(String pattern, Date date) {
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);
	}

	/**
	 * Formate une date selon le format par défaut "dd/MM/yyyy HH:mm:ss".
	 *
	 * @param date la date à formater
	 * @return la date formatée sous forme de chaîne
	 */
	public static String formatDefaut(Date date) {
		// Utilisation de la méthode format avec le motif par défaut
		return format("dd/MM/yyyy HH:mm:ss", date);
	}
}
