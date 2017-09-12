package nag.arvind.gudiseva;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class AlphabetCount {

	public AlphabetCount() {}

	public AlphabetCount(String sentence) {
		
		/* A Map that further provides a total ordering on its keys.
		 * The map is ordered according to the natural ordering of its keys, or by a Comparator typically provided at sorted map creation time.
		 */
		SortedMap<Character, Integer> charMap = new TreeMap<Character, Integer>(
				new Comparator<Character>() {

					@Override
					public int compare(Character o1, Character o2) {
						// Sort by Descending Order
						return o2.compareTo(o1);
					}
					
				});

		/*
		 * Convert String to char array without spaces
		 * \s A whitespace character: [ \t\n\x0B\f\r]
		 * java.util.regex.Pattern has all the predefined classes
		 */
		for(char alphabet: sentence.replaceAll("\\s+", "").toLowerCase().trim().toCharArray()){
		
			if(charMap.containsKey(alphabet)) {
				charMap.put(alphabet, charMap.get(alphabet) + 1);
			} else{
				charMap.put(alphabet, 1);			
			}
		}
		
		//System.out.println("Map" + charMap);
		printMap(charMap);
	}

	public static void main(String[] args) {

		new AlphabetCount("Life is beautiful ... by ... \n Nag \t Arvind Gudiseva");

	}

    //pretty print a map
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}
