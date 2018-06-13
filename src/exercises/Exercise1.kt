package nullableTypes

import kotlin.test.assertEquals

const val SOLUTION = "CUACCUUGAACUGAUGCAUUUAA"

/*
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

// Write a function "complement" that does what described over here
fun complement(dna: String): String {
    var rna = ""
    for (c in dna) {
        rna += when (c) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> throw UnsupportedOperationException("value must be G, C, T or A")
        }
    }
    
    return rna
}

// Do not change anything from this point on
fun main(args: Array<String>) {


    val dna = "GATGGAACTTGACTACGTAAATT"

    assertEquals(SOLUTION, complement(dna))
}

