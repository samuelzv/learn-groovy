assert (0..10).contains(0)
assert (0..10).contains(5)
assert (0..10).contains(10)


assert !(0..10).contains(-1)
assert !(0..10).contains(11)

assert (0..<10).contains(9)
assert !(0..<10).contains(10)

def a = 0..10
assert a instanceof Range
assert a.contains(5)

//Explicit construction
def b = new IntRange(0,10)
assert b.contains(5)

// Bounds checking
assert (0.0..1.0).contains(1.0)
assert (0.0..1.0).containsWithinBounds(0.5)

// Date ranges
def today = new Date()
def yesterday = today - 1
assert (today..yesterday).size() == 2

// String ranges
assert ('a'..'c').contains('b')

// for in range
def log = ''
for (element in 5..9) {
    log += element
}
assert log == '56789'


// loop with reverse range
log = ''
for (element in 9..5) {
    log += element
}
assert log == '98765'

// half-exclusive reverse, each with closure
log = ''
(9..<5).each { element ->
    log += element
}
assert log == '9876'



