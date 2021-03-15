import groovy.transform.ToString

@ToString(includeFields = true, includeNames = true, excludes = "last")
class Customer {
    String first
    String last
}


def customer1 = new Customer(first: 'Samuel', last: 'Zuniga')
def customer2 = new Customer(first: 'Sam', last: 'Zuniga')

//assert customer1 == customer2


//customer.first = "hola"
//customer.last = "mundo"

println customer1
