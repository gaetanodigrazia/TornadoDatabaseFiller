# TornadoDatabaseFiller

## Introduction


## Step to make it work
### First step

Adding the dependency to the pom
```
<dependency>
         <groupId>com.tornadomicroservice.databasefiller</groupId>
         <artifactId>tornado-database-filler</artifactId>
         <scope>system</scope>
         <version>0.1.0</version>
         <systemPath>Your\Path\To\The\Jar\TornadoFilter.jar</systemPath>
</dependency>
```

### Second step
Add the code below to your RestController class
```
@GetMapping(value ="/fill")
  public void fillDatabase(){
    userService.fillDatabase();
}
```

### Final step
You can now digit:
```
	localhost:8080/your/path/to/the/controller/fill
```
