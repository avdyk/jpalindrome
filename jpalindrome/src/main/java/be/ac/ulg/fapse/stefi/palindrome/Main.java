package be.ac.ulg.fapse.stefi.palindrome;

/**
 * Cette classe lance le jeu du palindrome.
 * <div>Utilisation: <code>java -jar palindrome.jar MOT [...]</code></div>
 * <dl>
 * <dt>MOT</dt>
 * <dd>le mot qui est peut-être un palindrome</dd>
 * </dl>
 * @author <a href="mailto:avandyck@gmail.com">Arnaud Vandyck</a>
 * @version 1.0
 */
public class Main {
		
		/**
		 * Point d'entrée de la classe. Voir la définition de la classe.
		 * @param args le ou les mots qui est/sont peut-être un, des palindromes.
		 */
		public static void main(String[] args) {
        Palindrome[] p = new Palindrome[args.length];
				int i=0;
				for (String mot: args) {
						p[i] = new Palindrome(mot);
						i++;
				}
				for (Palindrome pal: p) {
						if (pal.estPalindrome()) {
								System.out.println( pal.getMot() + " est un palindrome");
						} else {
								System.out.println( pal.getMot() + " n'est pas un palindrome");
						}
				}
		}

}
