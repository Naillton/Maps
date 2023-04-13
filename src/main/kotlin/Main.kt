// A estrutura de dados map usa chave e valores para fazer suas referencias
// diferente dos sets e as lists no map eu defino os valores do nosso map e suas chaves
// e quando formos percorrer o map teremos que percorrer passando a sua chave par acessar
// o elemento desejado, os maps tambem podem ser mutaveis ou imutaveis
fun main() {
    //imutMap()
    multMap()
}

fun imutMap() {
    // definindo map imutavel de um determinado tipo
    // note que temos que definir o tipo da chave e do valor
    //val imutMap = mapOf<Int, Int>(1 to 1, 2 to 2, 3 to 3, 4 to 200)
    /*imutMap.forEach{
        // ao imprimir o resultado passando a nosso parametro it
        // ele nos tras o valor chave e valor do map e nao so o valor
        //println(it)
        // usando o parametor podemos acessar tanto a chave como o valor
        println(it.value)
        println(it.key)
    }*/
    // definindo map imutavel de um tipo generico
    val imutMap = mapOf(1 to 100, 2 to "goku", 3 to true)
    // difente do exemplo acima usaremos um for para interar sobre os valors do map
    // note que podemos passar tanto o value quanto a key para nosso paremtro
    // nesse caso usamos a .keys para poder acessar os valores passando suas chaves
    for ( key in imutMap.keys ) {
        // passando a key como acesso retornamos os valores do map
        println(imutMap[key])
    }
    // passando o vaslues
    println("---------------------")
    // note que temos o mesmo resultado
    for ( value in imutMap.values) {
        println(value)
    }
}

fun multMap() {
    // definindo um map multavel de dois tipos diferentes chave : valor
    val multMap = mutableMapOf<Int, String>(1 to "hdjs", 2 to "fhsf", 3 to "jshfj")
    // agora vamos adcionar mais valores ao nosso map mutavel
    // ao contrario das outras duas estruturas o map usa o put para adcionar valores
    // passando a key e o valor que desejamos
    multMap.put(4, "hjjsh")
    // para remover um valor usamos o remove passando a sua chave
    multMap.remove(1)
    /*for ( itens in multMap) {
        println(itens)
    }*/
    multMap.forEach{
        println(it.value)
    }
}