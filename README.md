# labPOO: gr7 & gr8

- fiecare exercitiu (in afara celor care necesita importarea de fisiere) va fi scris intr-o functie separata
- pentru simplitate, numele functiei va fi numarul exercitiului. exemplu: ex1(), ex2()
- pentru a vedea outputul unui exercitiu, tot ce trebuie sa faceti este sa apelati metoda respectiva
- pentru exercitiile care necesita importarea anumitor fisiere, se va face un pachet separat
exemplu: lab1 -> people
  
- pentru fiecare laborator, se va face un branch separat
- pe main, fiind branchul principal in git, nu se va publica direct cod, ci se va actualiza folosind pull request-uri


**Instructiuni**

1. **Create diagrama UML:**
   
   File -> New -> Diagram -> Java class diagram
   
2. **Generare javadoc:**
   
   Help -> Generate Javadoc -> select output directory browsing sa fie full path
   
3. **Generare jar:**
   
   Project Structure ->Artifacts -> + -> Jar -> From modules -> select Main Class -> bifati "extract to the target JAR" -> OK -> bifati "include in project build"-> Apply

4. **Rulare jar:**

   Build project -> Deschide folderul unde s-a generat jarul (out/artifacts/people_jar) -> Open in terminal <br>
   In terminal scrieti comanda: java -jar lab-POO-gr7-8.jar
 