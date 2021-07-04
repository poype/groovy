package json

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import object.Dog

def list = [new Dog(name: "one"), new Dog(name: "two")]

// 把对象转化为json
def jsonStr = JsonOutput.toJson(list)
println jsonStr   // [{"name":"one"},{"name":"two"}]

JsonOutput.prettyPrint(jsonStr)

def jsonSlurper = new JsonSlurper()
def a = jsonSlurper.parseText("[{\"name\":\"one\"},{\"name\":\"two\"}]")
println a[0].name
