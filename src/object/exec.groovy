package object

def dog = new Dog(name:"Jack")
dog.run()
dog.eat()

def cat = new Cat(name:"Jim")
cat.run()
cat.eat() // default eat

cat.name = 'winfred'
cat.run()