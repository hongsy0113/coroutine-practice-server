package coroutinepractice.server.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/server")
class NumberController {

    @GetMapping("/numbers/{number}")
    fun number(@PathVariable number: Int): String {
        Thread.sleep(100)
        return number.toString()
    }
}