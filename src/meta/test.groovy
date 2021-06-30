package meta

import object.Dog

def dog = new Dog();
dog.laugh()  // invokeMethod会被调用


def func() {
    println "new method"
}

Dog.metaClass.age = 14   // 动态给类添加一个property
def dog2 = new Dog()
println dog2.age

Dog.metaClass.laugh = {         // 利用闭包动态添加一个方法
    println "metaClass method"
}
def dog3 = new Dog()
dog3.laugh()

Dog.metaClass.static.testStaticMethod = {String param ->  // 注入一个静态方法
    println param
}
Dog.testStaticMethod('test static method')