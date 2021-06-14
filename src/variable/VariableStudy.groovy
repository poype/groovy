package variable

int a = 10
println a.class   // class java.lang.Integer

double b = 3.14
println b.class   // class java.lang.Double


// 定义弱类型的变量
// 使用def关键字定义弱类型变量，编译器会根据value推断出变量的类型
def x = 10
println x.class   // class java.lang.Integer

def y = 3.14
println y.class   // class java.math.BigDecimal

// 重新对变量x赋值string, 变量的类型就动态变成了java.lang.String
x = "abcdefg"
println x.class   // class java.lang.String