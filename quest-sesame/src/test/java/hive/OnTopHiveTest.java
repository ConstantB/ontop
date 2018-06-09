package hive;

import junit.framework.TestCase;
import org.openrdf.model.Statement;
import org.openrdf.query.*;
import org.openrdf.query.resultio.text.tsv.SPARQLResultsTSVWriter;
import org.openrdf.repository.Repository;
import org.openrdf.repository.RepositoryConnection;
import sesameWrapper.SesameVirtualRepo;

import java.io.FileOutputStream;
import java.io.InputStream;


public class OnTopHiveTest extends TestCase{

    public void test() throws Exception {

        RepositoryConnection con = null;
        Repository repo = null;

        String obdafile = this.getClass().getResource("/hive/hive_test.obda").getPath();
        String owlfile = this.getClass().getResource("/general/dummy.owl").getPath();
        System.out.println(obdafile);
        System.out.println(owlfile);

        repo = new SesameVirtualRepo("my_name", owlfile, obdafile, false, "TreeWitness");
        repo.initialize();

        con = repo.getConnection();

        String prefixes = //"prefix ex: <http://meraka/moss/exampleBooks.owl#> \n "
                 "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \n"
                //+ "PREFIX cd: <http://melodiesproject.eu/CityDistricts/ontology#> \n"
                + "PREFIX geo: <http://www.opengis.net/ont/geosparql#> \n"
                //+ "PREFIX f: <http://melodiesproject.eu/field/ontology#> \n "
                + "Prefix lgd:<http://linkedgeodata.org/ontology#> \n";

        ///query repo

        try {

            String test = prefixes + "select distinct ?x where {" +
                    "?x lgd:hasName ?y . "+
                    "?x geo:asWKT ?geo " +
                    "}";

            String spatial_join = prefixes + "select distinct ?x ?geo where {" +
                    "?x lgd:hasName ?y . "+
                    "?x geo:asWKT ?geo . " +
                    "?x1 lgd:hasName ?y1 . "+
                    "?x1 geo:asWKT ?geo1 . " +
                    "FILTER(<http://www.opengis.net/def/function/geosparql/sfIntersects>(?geo,?geo1))" +
                    //"FILTER(?x='1')"+
                    "}";

            TupleQuery tupleQuery = con.prepareTupleQuery(QueryLanguage.SPARQL, spatial_join);
            TupleQueryResult result = tupleQuery.evaluate();

            while (result.hasNext()) {
                BindingSet bindingSet = result.next();
                System.out.println("Query Result: "+bindingSet.toString());
            }

            con.close();

            System.out.println("Closing...");

            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Done.");
    }

}
