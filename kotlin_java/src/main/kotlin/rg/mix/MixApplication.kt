package rg.mix

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MixApplication

fun main(args: Array<String>) {
	runApplication<MixApplication>(*args)
}
