enum class Daypart{
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)


fun main(){

    val listOfEvents = mutableListOf<Event>(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    val listOfShortEvents = listOfEvents.filter { it.durationInMinutes < 60 }

    println("You have ${listOfShortEvents.size} short events.")

    val groupedEvents = listOfEvents.groupBy { it.daypart }


    groupedEvents.forEach{(daypart,events)->
        println("$daypart: ${events.size} events")
    }

    println("Last event of the day: ${listOfEvents.last().title}")
}
