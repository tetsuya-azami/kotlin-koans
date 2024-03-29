package collections.rere.foldandreduce

// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> =
    customers.map(Customer::getOrderedProducts).reduce { orderedByAll, product ->
        orderedByAll.intersect(product)
    }

fun Customer.getOrderedProducts(): Set<Product> = orders.flatMap(Order::products).toSet()