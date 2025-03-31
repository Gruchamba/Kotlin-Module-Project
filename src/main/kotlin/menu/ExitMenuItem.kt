package menu

import menu.navigateMenuItem.NavigateMenuItem

class ExitMenuItem: NavigateMenuItem() {

    override fun print() {
        println("Завершение работы программу")
        System.exit(0)
    }
}