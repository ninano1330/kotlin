//class Car(val make: String, val model: String, val numberOfDoors: Int)
//
//abstract class Product(val name: String, var price: Double) {
//    // Abstract property for the product category
//    abstract val category: String
//
//    // A function that can be shared by all products
//    fun productInfo(): String {
//        return "Product: $name, Category: $category, Price: $price"
//    }
//}
//class Electronic(name: String, price: Double, val warranty: Int) : Product(name, price) {
//    override val category = "Electronic"
//}
//
//interface PaymentMethod {
//    // Functions are inheritable by default
//    fun initiatePayment(amount: Double): String
//}
//interface PaymentType {
//    val paymentType: String
//}
//
//class CreditCardPayment(val cardNumber: String, val cardHolderName: String, val expiryDate: String) : PaymentMethod, PaymentType {
//    override fun initiatePayment(amount: Double): String {
//        // Simulate processing payment with credit card
//        return "Payment of $$amount initiated using Credit Card ending in ${cardNumber.takeLast(4)}."
//    }
//    override val paymentType: String = "Credit Card"
//}
//
//fun main(){
//    val car1 = Car("Toyota", "Corolla", 4)
//    println("Car1: make=${car1.make}, model=${car1.model}, numberOfDoors=${car1.numberOfDoors}")
//    // Car1: make=Toyota, model=Corolla, numberOfDoors=4
//
//    val laptop = Electronic(name = "Laptop", price = 1000.0, warranty = 2)
//    println(laptop.productInfo())
//
//    val paymentMethod = CreditCardPayment("1234 5678 9012 3456", "John Doe", "12/25")
//    println(paymentMethod.initiatePayment(100.0))
//    // Payment of $100.0 initiated using Credit Card ending in 3456.
//
//    println("Payment is by ${paymentMethod.paymentType}")
//}