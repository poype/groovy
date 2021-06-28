package variable


def colors = [
        red: '0000',
        green: '1111',
        blue: '2222'
]

println colors.red
println colors['red']

// 添加一个新的key
colors.yellow = '3333'
println colors.yellow

// 修改原有key的值
colors.red = '5555'
println colors.red

println colors.getClass() // 打印 class java.util.LinkedHashMap

// 通过闭包遍历
colors.each {
    println "${it.key} ---> ${it.value}"
}
