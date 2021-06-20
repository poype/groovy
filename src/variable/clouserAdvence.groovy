package variable

def clouser = {
    println "this: " + this
    println "owner: " + owner
    println "delegate: " + delegate
}

// 本次三条println语句的输出结果相同
clouser()
println '----------------------------'

/**
 * this 代表闭包定义处的类
 * owner 代表闭包定义处的类或者对象
 * delegate 代表任意对象，默认值是owner
 */

// 相当于在clouserAdvence中定义了一个内部类
class Person {
    def static classClouser = {
        println "this: " + this
        println "owner: " + owner
        println "delegate: " + delegate
    }

    def static say() {
        def classClouser = {
            println "this: " + this
            println "owner: " + owner
            println "delegate: " + delegate
        }
        classClouser()
    }
}
Person.classClouser()
Person.say()

println '--------------------------------'

def outClouser = {
    def innerClouser = {
        println "this: " + this
        println "owner: " + owner
        println "delegate: " + delegate
    }
    // 修改delegate指向其它对象
    innerClouser.delegate = Object
    innerClouser()
}
outClouser()

// 闭包的委托策略
class Student {
    String name
    def pretty = {
        "My name is ${name}"
    }

    String toString() {
        pretty.call()
    }
}

class Teacher {
    String name
}

def stu = new Student(name: 'poype')
def tea = new Teacher(name: 'lucy')
println stu

stu.pretty.delegate = tea
stu.pretty.resolveStrategy = Closure.DELEGATE_FIRST
println stu   // 输出老师的名字



