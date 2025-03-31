package menu.contentMenuItem

import menu.MenuItem
import menu.navigateMenuItem.SelectArchiveMenuItem
import repository.DataStorage

class CreateArchiveMenuItem: ContentMenuItem() {

    override fun print() {
        println("Меню создания архива")
    }

    override fun commandProcessing(): MenuItem {
        print("Введите имя архива: ")
        val archiveName = getInputString()
        DataStorage.archiveMap.put(archiveName, mutableListOf())
        return SelectArchiveMenuItem()
    }

}