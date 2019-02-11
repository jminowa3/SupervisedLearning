# Project1
Used Weka gui to run the following datasets: Titanic and adult which are included in the github repository https://github.com/jminowa3/SupervisedLearning. The datasets have been preprocessed, but the original files can be found the following links.


Titanic: https://www.kaggle.com/dmilla/introduction-to-decision-trees-titanic-dataset?fbclid=IwAR0WZdBrq296WxXGUpWrSpdBHXXMN8b6Mp0uSK9C_rkd_aniSmsq1OCDiM4


Adult: http://archive.ics.uci.edu/ml/datasets/Adult


The combined data sheets with testing cross validation and training accuracy and other data used in graphs are saved in these google sheets
https://docs.google.com/spreadsheets/d/15WZhfrUXd4xYVRBqwS8NkSmnuL9e3wVeenjXUMdAqF0/edit?usp=sharing
https://docs.google.com/spreadsheets/d/15WZhfrUXd4xYVRBqwS8NkSmnuL9e3wVeenjXUMdAqF0/edit?usp=sharing


If you use the files provided which is the 10% 20% ... 80%, randomized, and test .arff files 
https://github.com/jminowa3/SupervisedLearning


Using the randomized files for each data, we open them in Weka and run cross validation 10 fold for the classifiers: multilayer perceptron, IBK, J48, SMO, and AdaBoost1. I then tune the hyper parameters. This is done under the classify tab, where you click choose for classifier. Right clicking them will allow you to choose the parameters, and proceed to run different hyper parameters based on each of the algorithms and find the one with the highest accuracy. This is done for each algorithm for both data sets for a total of 12 iterations of fine tuning


With the decided hyperparameters, open each of the 10% to 80% files and train them three times while recording the summary section with the data breakdown.
        1. Run 10 fold cross validation to receive accuracy 
        2. Run the data against itself using the training set option for test
        3. Run all percentages of data against the last 20% test data that was not used for training