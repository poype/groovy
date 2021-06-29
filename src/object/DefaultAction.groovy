package object

/*
 * Trait与接口类似，但是可以有默认方法
 */
trait DefaultAction {

    def run() {
        println 'default run'
    }

    def eat() {
        println 'default eat'
    }
}