package models

data class User(val id: Int, val firstName: String, val lastName: String, val email: String) {
    override fun toString(): String {
        return "Id: $id\nNome: $firstName $lastName\nEmail: $email"
    }
}