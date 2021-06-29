package object

class Dog implements Action {

    String name

    @Override
    def eat() {
        println "Dog ${this.name} is eatting"
    }

    @Override
    def run() {
        println "Dog ${this.name} is running"
    }
}
