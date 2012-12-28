package parsingLayer;

public interface Parser {

	/**
	 * parse the text to generate the parse tree
	 * and return parssing tree
	 * @param text
	 * @return
	 */
	public ParssingTree parse (String text);
	
}
