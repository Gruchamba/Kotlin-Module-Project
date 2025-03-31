package repository

import entities.Note

object DataStorage {

    val archiveMap: MutableMap<String, MutableList<Note>> = mutableMapOf()

    fun getMapForList(archiveName: String) : Map<String, Note>? {
        return archiveMap.get(archiveName)?.associateBy({ it.name }, { it })
    }
}