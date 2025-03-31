package menu.contentMenuItem

import menu.MenuItem

abstract class ContentMenuItem: MenuItem() {

    fun getInputString(): String {
        var text: String
        while (true) {
            text = scanner.nextLine()

            if (text.isEmpty()) {
                println("Введена пустая строка!")
                continue

            } else return text
        }

    }
}