package variable

// 闭包就是一个代码块
def myClouser = {
    println "Hello Groovy"
}

// 闭包执行的两种方式：一、在闭包上调用call方法，二、类似函数调用的方式
myClouser.call()
myClouser()

// 带参数的闭包， -> 用于分割param和body
def paramClouser = { String name->
    println "Hello ${name}"
}
paramClouser.call('groovy!!!')
paramClouser("groovy!")

// 有多个参数的闭包
def multipleParamClouser = {String name, String sex, int age ->
    println "Hello ${name}, you are ${age} and you are ${sex}"
}
multipleParamClouser.call("Poype", 'M', 22)

// 所有闭包都有一个默认参数叫做it，如果显示定义了参数，那么就没有it这个默认参数了
def defaultClouser = {
    println "Hello ${it}, default param"
}
defaultClouser("Poype")

// 闭包的返回值，与方法不同，闭包一定是有返回值的
def result = defaultClouser()   // 可以定义一个变量接收无return语句闭包的返回值，返回null
println "result: ${result}"

def returnClouser = {
    return "return value"
}
result = returnClouser()
println result

//---------------------------------------------------------------

def fab(int num) {
    int result = 1
    // 闭包参数放在括号内
    1.upto(num, {
        result *= it
    })
    return result
}
println(fab(5))

def fab2(int number) {
    int result = 1
    // 闭包参数放在括号内和放在括号外的效果是一样的
    number.downto(1) {
        result *= it
    }
    return result
}
println fab2(5)

def cal(int count) {
    int result = 0
    // 将闭包参数放在方法外，是groovy最常用的写法
    count.times {int num ->
        result += num
    }
    return result
}
println cal(10)