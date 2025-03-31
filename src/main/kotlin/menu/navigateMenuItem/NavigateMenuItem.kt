package menu.navigateMenuItem

import menu.MenuItem

abstract class NavigateMenuItem: MenuItem() {

    val menuMap: MutableMap<String, () -> MenuItem> = mutableMapOf()

    private fun checkInvalidInputCommand(command: String) : Boolean {
        if (command.isEmpty())
            return true

        val number = command.toIntOrNull() ?: return true

        if (number < 1)
            return true

        if (number > menuMap.size)
            return true

        return false
    }

    override fun commandProcessing(): MenuItem? {
        val inputCommand = getMenuNumber()

        menuMap.forEach{entry ->
            run {
                if (entry.key.contains("${inputCommand}."))
                    return entry.value.invoke()
            }
        }
        return null
    }

    private fun getMenuNumber(): String {
        while (true) {
            print("\nВыберите пункт меню: ")
            val command = scanner.nextLine()
            println()

            if (checkInvalidInputCommand(command)) {
                println("Введён не корректный пункт меню")
                continue
            }

            return command
        }
    }
}