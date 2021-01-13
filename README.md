# RDF4J Basic example

# Exercise 1
Use the RDF4J ModelBuilder for creating a Turtle file which is equal to the target output.

Turtle serialization: https://rdf4j.org/documentation/tutorials/getting-started/#example-07-writing-to-turtle-and-other-formats

## Target output

    BASE <http://data.example.org/>
    PREFIX ex: <http://schema.example.org/>
    
    <person/Lorenz_Lustig> ex:hatGeschwister <person/Lisa_Lustig> ;
        ex:name "Lorenz" ;
        ex:besucht <kurs/Kochkurs> .
    
    <person/Lisa_Lustig> ex:hatGeschwister <person/Lorenz_Lustig> ;
        ex:name "Lisa" ;
        ex:besucht <kurs/Kochkurs> .

## Output

    @prefix ex: <http://schema.example.org/> .
    @prefix xsd: <http://www.w3.org/2001/XMLSchema#> .
    
    <http://schema.example.org/person/Lorenz_Lustig> ex:besucht <http://schema.example.org/kurs/kochkurs>;
      ex:hatGeschwister <http://schema.example.org/person/Lisa_Lustig>;
      ex:name "Lorenz" .
    
    <http://schema.example.org/person/Lisa_Lustig> ex:besucht <http://schema.example.org/kurs/kochkurs>;
      ex:hatGeschwister <http://schema.example.org/person/Lorenz_Lustig>;
      ex:name "Lisa" .
