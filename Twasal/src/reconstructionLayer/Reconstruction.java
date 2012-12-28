package reconstructionLayer;

import parsingLayer.ParssingTree;

public interface Reconstruction {

	/**
	 * reconstruct the parse tree and generate the correct stream of words
	 * @param tree
	 * @return
	 */
	public TokenStream reconstruct (ParssingTree tree);
	
}
