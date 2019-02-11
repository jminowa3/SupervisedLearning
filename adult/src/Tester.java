
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.classifiers.functions.SMO;
import weka.classifiers.lazy.IBk;
import weka.classifiers.meta.AdaBoostM1;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.ConverterUtils.DataSource;
public class Tester {
    public static void main(String[] args) throws Exception {
        DataSource testSource = new DataSource("testSet.csv");
        Instances testData = testSource.getDataSet();
        String[] filePaths = { "tenPercent.csv", "twentyPercent.csv", "thirtyPercent.csv"
                , "fourtyPercent.csv", "fiftyPercent.csv", "sixtyPercent.csv", "seventyPercent.csv", "eightyPercent.csv"};
        Classifier[] classifiers = {};
        J48 tree = new J48();
        MultilayerPerceptron neural = new MultilayerPerceptron();
        IBk knn = new IBk();
        SMO svm1 = new SMO();
        SMO svm2 = new SMO();
        AdaBoostM1 boosting = new AdaBoostM1();
        tree.setOptions();
        for (String path : filePaths) {
            DataSource source = new DataSource(path);
            Instances data = source.getDataSet();
            testData.setClassIndex(data.numAttributes() - 1);
            data.setClassIndex(data.numAttributes() - 1);


            Instances train = new Instances(data);
            Instances test = new Instances(testData);



            for (Classifier cls : classifiers) {
                cls.buildClassifier(train);
                Evaluation eval = new Evaluation(train);
                eval.evaluateModel(cls, test);
                System.out.println(eval.toSummaryString("\nResults\n======\n", false));
            }
        }
    }
}

