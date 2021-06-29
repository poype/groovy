package variable

def range = 1..10

println range[0]

println range.contains(10)

println range.from // 起始值
println range.to // 终止值

// 遍历一，推荐方式
range.each {
    println it
}

println '---------------------'

// 遍历二
for (i in range)
    println i


def getGrade(Number number) {
    def result
    switch (number) {
        case 0..<60: // [0, 60)
            result = '不及格'
            break
        case 60..<70:
            result = '及格'
            break
        case 70..<80:
            result = '良好'
            break
        case 80..100:
            result = '优秀'
            break
    }
    result // return关键字可以省略，直接写result就相当于return result
}

println getGrade(10)
println getGrade(66)
println getGrade(82)
println getGrade(77)












