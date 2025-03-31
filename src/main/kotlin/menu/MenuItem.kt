package menu

import java.util.Scanner

abstract class MenuItem {

    val scanner = Scanner(System.`in`)

    abstract fun print()

    abstract fun commandProcessing(): MenuItem?

}