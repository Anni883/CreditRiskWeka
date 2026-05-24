package edu.creditrisk;

import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Discretize;
import weka.associations.Apriori;

public class AsscociationRunner {

    public static void runApriori(Instances data) throws Exception {
        Discretize disc = new Discretize();
        disc.setInputFormat(data);
        Instances discData = Filter.useFilter(data, disc);

        Apriori apriori = new Apriori();
        apriori.setNumRules(20);          // top number of rules
        apriori.setLowerBoundMinSupport(0.1);  // minimum support
        apriori.setMinMetric(0.9);        // minimum confidence
        apriori.buildAssociations(discData);

        System.out.println(apriori);
    }
}
