package nicestring

fun String.isNice(): Boolean {


    val containsVoyel = "aeiou".sumBy { ch ->
        this.count{s -> s==ch}
    } >= 3

    val notContainSubString = this.indexOfAny(mutableListOf("bu", "ba", "be"), 0, false) == -1

    fun containDoubleLetterFun (x: String): Boolean {
        val doubleLetters = mutableListOf<String>("aa", "bb"
                , "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk", "ll"
                , "mm", "nn", "oo", "pp", "qq", "rr", "ss", "tt", "uu", "vv", "xx", "yy", "zz")
        val idx = x.indexOfAny(strings = doubleLetters);
        return idx > -1
    }

    val containDoubleLetter = containDoubleLetterFun(this)

    val numberConditionTrue = mutableListOf(containsVoyel,  notContainSubString, containDoubleLetter).count { b -> b == true }

    return numberConditionTrue >= 2
}