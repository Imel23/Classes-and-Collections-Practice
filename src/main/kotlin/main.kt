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

    var listOfEvents = mutableListOf<Event>(
        Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0),
        Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15),
        Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30),
        Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60),
        Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10),
        Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
    )

    var listOfShortEvents = listOfEvents.filter { it.durationInMinutes < 60 }

    println("You have ${listOfShortEvents.size} short events.")

    val morningNumber = listOfEvents.filter { it.daypart == Daypart.MORNING }.size
    val afternoonNumber = listOfEvents.filter { it.daypart == Daypart.AFTERNOON }.size
    val eveningNumber = listOfEvents.filter { it.daypart == Daypart.EVENING }.size

    println("Morning: $morningNumber events")
    println("Afternoon: $afternoonNumber events")
    println("Evening: $eveningNumber events")
}
