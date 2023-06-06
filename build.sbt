
ThisBuild / scalaVersion := "2.13.11"


val jupiterInterfaceVersion = "0.10.0"
val junitJupiterVersion = "5.8.2"
val junitPlatformVersion = "1.8.2" 
val jupiterInterface = "net.aichler" % "jupiter-interface" % jupiterInterfaceVersion % Test
val junitJupiterApi = "org.junit.jupiter" % "junit-jupiter-api" % junitJupiterVersion % Test
val junitJupiterEngine = "org.junit.jupiter" % "junit-jupiter-engine" % junitJupiterVersion % Test
val junitJupiterParams = "org.junit.jupiter" % "junit-jupiter-params" % junitJupiterVersion % Test
val junitPlatformLauncher = "org.junit.platform" % "junit-platform-launcher" % junitPlatformVersion % Test
val junitPlatformRunner = "org.junit.platform" % "junit-platform-runner" % junitPlatformVersion % Test


val java = (project in file("java"))

val reproducer = (project in file("."))
.settings(libraryDependencies ++= Seq(
    jupiterInterface,
    junitJupiterApi,
    junitJupiterEngine,
    junitJupiterParams,
    junitPlatformLauncher,
    junitPlatformRunner,
    )
).dependsOn(java)

