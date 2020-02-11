class Human {
    var name: String? = null

    class Student {
        private val studentId: Int? = null
        fun sayId() {
            println("My id is $studentId")
        }
    }

    inner class Teacher {
        var homeWorkId: Int? = null

        fun sayHello() {
            println("My name is $name")
        }

        fun giveHomeWork() {
            println("Homework id is ${homeWorkId ?: 14}")


        }
    }
}
