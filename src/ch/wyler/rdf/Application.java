package ch.wyler.rdf;

import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.util.ModelBuilder;
import org.eclipse.rdf4j.rio.RDFFormat;
import org.eclipse.rdf4j.rio.Rio;

public class Application {

    public static void main(final String[] args) {
        final ModelBuilder builder = new ModelBuilder();
        final Model model = builder
                .setNamespace("ex", "http://schema.example.org/")
                .subject("ex:person/Lorenz_Lustig")
                .add("ex:name", "Lorenz")
                .add("ex:hatGeschwister", "ex:person/Lisa_Lustig")
                .add("ex:besucht", "ex:kurs/kochkurs")
                .subject("ex:person/Lisa_Lustig")
                .add("ex:name", "Lisa")
                .add("ex:hatGeschwister", "ex:person/Lorenz_Lustig")
                .add("ex:besucht", "ex:kurs/kochkurs")
                .build();

        Rio.write(model, System.out, RDFFormat.TURTLE);
    }

}
