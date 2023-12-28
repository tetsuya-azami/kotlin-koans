package collections.allanyandotherpredicates

// Return true if all customers are from a given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { e -> e.city == city }

// Return true if there is at least one customer from a given city
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { e -> e.city == city }

// Return the number of customers from a given city
fun Shop.countCustomersFrom(city: City): Int = customers.count { e -> e.city == city }

// Return a customer who lives in a given city, or null if there is none
fun Shop.findCustomerFrom(city: City): Customer? = customers.find { e -> e.city == city }