def x = 1
println x.class

x = 'hola'
println x.class


def list = [1,2,3]

for(num in list) {
    println num
}

list.each { println it}

