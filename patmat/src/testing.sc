import patmat.Huffman._

times(string2Chars("proob"))
decode(Fork(Leaf('c', 1), Leaf('a', 1), List('a', 'c'), 2), List(1))

times(string2Chars(" fska;fask;dfja;lfajl; safdasfasfdsalalala ole beto que le pasa a esta coursera de mierda"))

decode(frenchCode, secret)
encode(frenchCode)(string2Chars("huffmanestcool")) == secret
//val huffTree = createCodeTree(string2Chars("Lorum impsum huffman est"))
//

createCodeTree(string2Chars("Lorum impsum huffman est"))
//decode(huffTree, encode(huffTree)(string2Chars("huffmanestcool")))
//
//
//
val table = convert(frenchCode)
////val table: CodeTable = List(('a', List(1,1,1)))
//codeBits(table)('a')
//
//quickEncode(frenchCode)(string2Chars("huffmanestcool"))









