# gradle-precompiled-scripts

inspect failing precompiled script in package

related to [this stackoverflow question](https://stackoverflow.com/questions/55847469/how-can-i-get-a-gradle-5-precompiled-script-plugin-get-to-work-when-it-is-in-a-p)


## Steps to reproduce

1. run `gradle hello-world` -  you'll see "hello world" printed on console
2. uncomment line in `/build.gradle.kts`
3. expected: I can run `gradle foo` - result: error.
