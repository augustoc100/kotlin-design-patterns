class Composite(val name: String) : Component {
    val list = ArrayList<Component>()

    override fun execute() {
        list.forEach { it.execute() }

        println(name)
    }

    fun add(component: Component) {
        list.add(component)
    }

    fun remove(component: Component) {
        list.remove(component)
    }
}