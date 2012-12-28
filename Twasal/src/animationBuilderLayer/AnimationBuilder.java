package animationBuilderLayer;

import wordsPreprocessingLayer.WordsStream;

public interface AnimationBuilder {

	/**
	 * connect to database and generate the animator code with timing 
	 * @param stream
	 * @return
	 */
	public Code buildAnimator (WordsStream stream);
	
}
