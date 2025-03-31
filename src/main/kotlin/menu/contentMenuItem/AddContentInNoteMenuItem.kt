package menu.contentMenuItem

import entities.Note
import menu.MenuItem
import menu.navigateMenuItem.SelectNoteMenuItem

class AddContentInNoteMenuItem(val note: Note): ContentMenuItem() {

    override fun print() {
        println("Добавление текста в заметку")
    }

    override fun commandProcessing(): MenuItem {
        print("Введите текст заметки: ")
        val newContent = getInputString()
        note.content += newContent
        return SelectNoteMenuItem(note.archiveName)
    }
}