package sub

tasks.register("foo") {
  doLast {
    println("Hello world!")
  }
}
