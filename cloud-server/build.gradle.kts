tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies{
    implementation("org.springframework.cloud:spring-cloud-config-server")
}