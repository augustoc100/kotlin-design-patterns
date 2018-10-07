fun  leaf() {
    val leaf = Leaf()

    leaf.execute()
    println("----------------------------")
}

fun simples_component() {
    val component = Composite("Component")
    val leaf = Leaf()

    component.add(leaf)

    component.execute()
    println("----------------------------")
}

fun remove_leaf() {
    val component = Composite("Remove Leaf")
    val leaf = Leaf()

    component.add(leaf)
    component.remove(leaf)

    component.execute()
    println("----------------------------")
}

fun big_component() {
    val big_component = Composite("Big Component")
    val component = Composite("Component")
    val leaf = Leaf()

    component.add(leaf)
    big_component.add(leaf)
    big_component.add(component)

big_component.execute()
    println("----------------------------")
}

fun super_component() {
    val super_component = Composite("Super Component")
    val big_component = Composite("Big Component")
    val component = Composite("Component")
    val leaf = Leaf()

    component.add(leaf)
    big_component.add(leaf)
    big_component.add(component)
    super_component.add(big_component)

    super_component.execute()
    println("----------------------------")
}

fun main(args: Array<String>) {
    leaf()
    simples_component()
    big_component()
    super_component()

    remove_leaf()
}