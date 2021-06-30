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

    def invokeMethod(String name, Object args) {
        println "the method name is ${name}, the args is ${args}"
    }
}
