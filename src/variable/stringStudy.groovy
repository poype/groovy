package variable

import org.codehaus.groovy.runtime.StringGroovyMethods

// 单引号定义的String与java中双引号定义的String完全一样
def name = 'test string'
println name.class      // class java.lang.String

// 三个单引号定义的String
def description = '''this is another string'''
println description.class   // class java.lang.String

// 三引号定义的字符串可以便于定义格式，避免了复杂的字符串拼接操作
description = '''first line
secone line
third line'''
println description

// 双引号定义的字符串叫做可扩展字符串，可扩展字符串是groovy中的GString
def sayHello = "Hello, ${name}"
println sayHello
println sayHello.class   //  class org.codehaus.groovy.runtime.GStringImpl

// GString中的${}中可以包含任意的表达式
def expression = "the sum is ${5 + 3}"
println expression

// 方法的参数是String类型，但仍然可以接受GString类型的字符串。GString可以和String互换
void echo(String message) {
    println message
}
echo(expression)
echo(sayHello)
echo(description)

/* ==================字符串的方法和操作符================== */
/*
Groovy中字符串方法的来源：
1. java.lang.String
2. DefaultGroovyMethods   Groovy对所有对象的扩展
3. StringGroovyMethods    重写了很多DefaultGroovyMethods中的方法, 又可以分为普通参数类型和闭包参数类型
*/

// 字符串可以直接比较
def str1 = "abc"
def str2 = "abe"
println str1 > str2

// 打印单个字符
println str1[0]
println str1[1]
println str1[2]

// 子字符串, 都是闭区间，下面会打印abe三个字母
println str2[0..2]







