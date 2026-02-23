val root = (project in file("."))
  .settings(
    name := "dfdl-vcard",

    organization := "com.ibm",

    version := "0.0.1-SNAPSHOT"
  )
  .daffodilProject()
