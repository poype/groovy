package object

class Cat implements DefaultAction {

    String name

    @Override
    def run() {
        println "Cat ${this.name} is running"
    }
}
