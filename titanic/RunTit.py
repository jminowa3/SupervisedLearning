import weka
import weka.filters.Filter as Filter
import weka.filters.unsupervised.attribute.Remove as Remove
import weka.core.converters.ConverterUtils.DataSource as DS
import os

data = DS.read(os.environ.get("tit_data")+os.sep+"10tit.csv")
dataNew = Filter.userFilter(data)
print(dataNew)