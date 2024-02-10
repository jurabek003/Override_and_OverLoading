class Sub: Parent() {
    override var age: Int
        get() = super.age
        set(value) {}

    override val jop: String
        get() = super.jop

    override val name: String
        get() = super.name

    override fun eating(): String {
        return super.eating()
    }

    override fun working(work:String): String {
        return super.working(work)
    }


    override fun toString(): String {
        return "Sub(age=$age, jop='$jop', name='$name')"
    }


}
