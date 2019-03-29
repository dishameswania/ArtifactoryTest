
artifactory('Art1'){
   localRepository("maven-local-dev") {
     packageType "maven"
     description "This is my Maven repository for development"
   }
}
