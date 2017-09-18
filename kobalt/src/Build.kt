import com.beust.kobalt.plugin.application.application
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.project

val p = project {
    name = "application"
    version = "0.0.1"
    directory = "application"
    sourceDirectories {
        path("src/main/kotlin")
    }
    val MAIN_CLASS =  "com.park9eon.MainKt"
    application {
        mainClass = MAIN_CLASS
    }
    assemble {
        jar {
            manifest {
                attributes("Main-Class", MAIN_CLASS)
            }
        }
    }
}