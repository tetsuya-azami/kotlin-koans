package collections.groupby

// Build a map that stores the customers living in a given city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy({ k -> k.city }, { v -> v })