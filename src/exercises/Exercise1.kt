package nullableTypes

import kotlin.test.assertEquals

const val SOLUTION = "CUACCUUGAACUGAUGCAUUUAA"

fun main(args: Array<String>) {
    /**
     * http://exercism.io/exercises/kotlin/rna-transcription/readme
     * http://rosalind.info/problems/rna/
     *
     * Given a DNA strand, return its RNA complement (per RNA transcription).
     *
     * Both DNA and RNA strands are a sequence of nucleotides.
     * The four nucleotides found in DNA are adenine (A), cytosine (C), guanine (G) and thymine (T).
     *
     *   Given a DNA strand, its transcribed RNA strand is formed by
     *   replacing each nucleotide with its complement:
     *
     *   G -> C
     *   C -> G
     *   T -> A
     *   A -> U
     */

    val dna = "GATGGAACTTGACTACGTAAATT"
    val rna = complement(dna)
    println(rna)
    assertEquals(SOLUTION, rna)
}

fun complement(dna: String): String {
    var rna = ""
    for (c in dna) {
        rna += when (c) {
            'G' -> "C"
            'C' -> "G"
            'T' -> "A"
            'A' -> "U"
            else -> throw UnsupportedOperationException("value bust be: G, C, T, A")
        }
    }
    return rna
}
