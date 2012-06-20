package be.ac.ulg.fapse.stefi.palindrome;

/**
 * Cette classe représente un mot et on peut analyser si il s'agit
 * d'un palindrome.
 * @author <a href="mailto:avandyck@gmail.com">Arnaud Vandyck</a>
 * @version 1.0
 */
public class Palindrome {
		
		/**
		 * Le mot que l'on veut tester.
		 */
		private String mot = null;

		private boolean palindrome = false;

		/**
		 * Le constructeur ne retourne pas de valeur et porte le même nom
		 * que la classe.
		 *
		 * @param m le mot.
		 */
		public Palindrome(String m) {
				super();
				this.mot = m;
				StringBuilder st = new StringBuilder(mot);
				st.reverse();
				palindrome = mot.equals(st.toString());
		}

		/**
		 * Retourne le mot.
		 *
		 * @return le mot.
		 */
		public String getMot() {
				return this.mot;
		}

		/**
		 * Retourne le résultat du test pour savoir si le mot est un
		 * palindrome.
		 *
		 * @return <code>true</code> si il s'agit d'un palindrome.
		 */
		public boolean estPalindrome() {
				return this.palindrome;
		}

}
