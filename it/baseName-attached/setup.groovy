import org.apache.commons.io.FileUtils

{ project ->
    File f = new File("${project.repositories.mavenLocal().url}/org/gradle/plugins/shadow/its/bna/" - 'file:')
    FileUtils.deleteDirectory(f)
}