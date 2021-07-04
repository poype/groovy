package file

def file = new File("./fileStudy.groovy")

file.eachLine {line ->
    println line
}

println '------------------------------'

// 直接获取文件的内容
println file.getText()


def testFuncInvoke(int a, int b) {
    println a
    println b
}
testFuncInvoke 100, 200