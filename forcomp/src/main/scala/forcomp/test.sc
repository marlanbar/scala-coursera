import forcomp.Anagrams._

val myWord: Word = "corre "
val otherWord: Word = "negro!"

val mySentence: Sentence = List(myWord, otherWord)
val occurrence: Occurrences = List(('a', 2), ('b', 2))

//val aWord = dictionaryByOccurrences(occurrence)(0).toLowerCase

//(for (y <- 0 to aWord.length) yield aWord.combinations(y).toList)
//  .flatten
//  .toList
//  .map(wordOccurrences(_))
//
//combinations(List())

val aWord = dictionaryByOccurrences(List())(0).toLowerCase