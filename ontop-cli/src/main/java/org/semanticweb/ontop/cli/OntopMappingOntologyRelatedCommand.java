package org.semanticweb.ontop.cli;

import com.github.rvesse.airline.Option;
import com.github.rvesse.airline.OptionType;


public abstract class OntopMappingOntologyRelatedCommand implements OntopCommand {

    @Option(type = OptionType.COMMAND, name = {"-t", "--ontology"}, title = "ontologyFile",
            description = "OWL ontology file")
    protected String owlFile;

    @Option(type = OptionType.COMMAND, name = {"-m", "--mapping"}, title = "mappingFile",
            description = "Mapping file in R2RML (.ttl) or in Ontop native format (.obda)", required = true)
    protected String mappingFile;

    @Option(type = OptionType.COMMAND, name = {"-u", "--username"}, title = "jdbcUserName",
            description = "user name for the jdbc connection (only for R2RML mapping)")
    protected String jdbcUserName;

    @Option(type = OptionType.COMMAND, name = {"-p", "--password"}, title = "jdbcPassword",
            description = "password for the jdbc connection  (only for R2RML mapping)")
    protected String jdbcPassword;

    @Option(type = OptionType.COMMAND, name = {"-l", "--url"}, title = "jdbcURL",
            description = "jdbcURL for the jdbc connection  (only for R2RML mapping)")
    protected String jdbcURL;

    @Option(type = OptionType.COMMAND, name = {"-d", "--driver-class"}, title = "jdbcDriver",
            description = "class name of the jdbc Driver (only for R2RML mapping)")
    protected String jdbcDriverClass;
}
