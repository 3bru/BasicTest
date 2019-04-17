package BasicTest;

public class  test1{
	
	public int square(int x) {
		return x*x;
	}
	
	public int countWord(java.lang.String word) {
		int sayac = 0;
		for( int i=0; i < word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A') {
				sayac++;
			}
		}
		return sayac;
	}
}