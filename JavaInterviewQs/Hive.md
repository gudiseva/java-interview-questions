# Hive Interview Questions:

### 1. How do we copy a Hive Table from One Cluster to Another Cluster?
Answer: If Hive Table is external, we can copy using distcp

## Saggezza

### Indexes in Hive

### Query parser for Partitioned Tables

### Determiner number of mappers in Hive
Ans. The number of maps is usually driven by the total size of the inputs, that is, the total number of blocks of the input files. Say, 10TB of input data and have a blocksize of 128MB, you'll end up with 82,000 maps.
The right number of reducers seems to be 0.95 or 1.75 multiplied by (<no. of nodes> * set mapred.job.reduce).
So, in short mappers are decided by HDFS and reducers can be customized.

### Performance optimization in Hive
- Map Side Joins
- Compression, Bucketing

##

Storm - Throttle
How to design the Spouts and Bolts?  How many Spouts and Bolts?

Caching of Data in Java Application

Security and Authentication of REST API / Web Services

HBase - Keys - rowkey strategies

