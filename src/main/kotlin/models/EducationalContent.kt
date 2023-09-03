package models

data class EducationalContent(val id: Int, val name: String, val duration: Int = 60) {
    override fun toString(): String {
        return "\n|============================|\n" +
                "Id: $id\n" +
                "Nome: $name\n" +
                "Duração: $duration minutos"
    }
}