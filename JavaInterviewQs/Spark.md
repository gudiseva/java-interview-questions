# Apache Spark Interview Questions:

## Aditazz

### 1. What are Spark Transformations?  List them.
Answer:
Transformation functions produce a new Resilient Distributed Dataset (RDD).  Resilient distributed datasets are Spark's main programming abstraction.
RDDs are automatically parallelized across the cluster.

_map_**
	*MAP(FUNC)*	- Pass each element of the RDD through the supplied function; i.e. func.

_flatMap_**
	*FLATMAP(FUNC)* - Similar to map, but each input item can be mapped to 0 or more output items (so func should return a Seq rather than a single item).

_filter_**
	*FILTER(FUNC)* - Filter creates a new RDD by passing in the supplied func used to filter the results.  It may be helpful think of filter as the where clause in a SQL statement.
	
_mapPartitions_**
	*MAPPARTITIONS(FUNC)* - It's a tool for performance optimization.  It's the same as map, but works with Spark RDD partitions.  It is distributed over partitions.

_mapPartitionsWithIndex_**
	*MAPPARTITIONSWITHINDEX(FUNC)* - Similar to mapPartitions, but also provides a function with an Int value to indicate the index position of the partition.
	"Return a new RDD by applying a function to each partition of this RDD, while tracking the index of the original partition.
	__preservesPartitioning__ indicates whether the input function preserves the partitioner, which should be false unless this is a pair RDD and the input function doesn't modify the keys."
	
_sample_**
	*SAMPLE(WITHREPLACEMENT,FRACTION, SEED)* - Return a random sample subset RDD of the input RDD
	
_Hammer Time (Can’t Touch This)_**

_union_**
	*UNION(A DIFFERENT RDD)* - Return the union of two RDDs
	
_intersection_**
	*INTERSECTION(A DIFFERENT RDD)* - Similar to union but return the intersection of two RDDs
	
_distinct_**
	*DISTINCT([NUMTASKS])* - Return a new RDD with distinct elements within a source RDD
_The Keys (To Success? The Florida Keys? To the Castle?)_**
	The group of transformation functions (groupByKey, reduceByKey, aggregateByKey, sortByKey, join) all act on key,value RDDs.  So, this section will be known as "The Keys".
	The following key functions are available though org.apache.spark.rdd.PairRDDFunctions which are operations available only on RDDs of key-value pairs.  "These operations are automatically 	available on any RDD of the right type (e.g. RDD[(Int, Int)] through implicit conversions when you import org.apache.spark.SparkContext._."
	
_groupByKey_**
	*GROUPBYKEY([NUMTASKS])* - When called on a dataset of (K, V) pairs, returns a dataset of (K, Iterable<V>) pairs.
	
_reduceByKey_**
	*REDUCEBYKEY(FUNC, [NUMTASKS])* - Operates on (K,V) pairs, but the func must be of type (V,V) => V
	
_aggregateByKey_**
	*AGGREGATEBYKEY(ZEROVALUE)(SEQOP, COMBOP, [NUMTASKS])* - 
	
_sortByKey_**
	*SORTBYKEY([ASCENDING], [NUMTASKS])* - sorts the (K,V) pair by K
	
_join_**
	*JOIN(OTHERDATASET, [NUMTASKS])* - It's joining of two datasets.  Other joins similar to relational database are available as well such as leftOuterJoin and rightOuterJoin.


### 2. How do you transform a RDD?
Reference: http://www.edupristine.com/blog/apache-spark-rdd-transformations-actions

Answer:
__Resilient Distributed Dataset:__
RDD is the main logical data unit in Spark. An RDD is distributed collection of objects. Distributed means, each RDD is divided into multiple partitions. Each of these partitions can reside in memory or stored on disk of different machines in a cluster. RDDs are immutable (Read Only) data structure. You can’t change original RDD, but you can always transform it into different RDD with all changes you want.

Quoting from Learning Spark book, "In Spark all work is expressed as creating new RDDs, transforming existing RDDs, or calling operations on RDDs to compute a result."

__RDDs can be created by 2 ways:__
1. Parallelizing existing collection.
2. Loading external dataset from HDFS (or any other HDFS supported file types).

__Transformations:__
Transformations create new RDD from existing RDD like map, reduceByKey and filter. Transformations are executed on demand. That means they are computed lazily.

__Lineage Graph:__
RDDs maintain a graph of 1 RDD getting transformed into another called lineage graph, which helps Spark to recompute any intermediate RDD in case of failures. This way spark achieves fault tolerance. 

__Actions:__
Actions return final results of RDD computations. Actions triggers execution using lineage graph to load the data into original RDD, carry out all intermediate transformations and return final results to Driver program or write it out to file system.
First, take, reduce, collect, count are some of the actions in spark.

__Lazy evaluation:__
Even if we define RDD, data does not get loaded immediately, neither any of the transformation actually get instantly computed, till you call an action like collect or count or save output to file system.
So the data is not loaded until it is necessary saving memory blocking in advance. Spark uses lazy evaluation to reduce the number of passes it has to take over data by chaining operations together.


### 3. What is sc.parallelize()?
Answer:
When calling parallelize, the elements of the collection are copied to form a distributed dataset that can be operated on in parallel.


## Avesta

### 2. What is RDD?
Reference: https://www.tutorialspoint.com/apache_spark/apache_spark_rdd.htm

Answer:
_Resilient Distributed Datasets (RDD)_** is a fundamental data structure of Spark. It is an immutable distributed collection of objects. Each dataset in RDD is divided into logical partitions, which may be computed on different nodes of the cluster. RDDs can contain any type of Python, Java, or Scala objects, including user-defined classes.

A RDD is a read-only, partitioned collection of records. RDDs can be created through deterministic operations on either data on stable storage or other RDDs. RDD is a fault-tolerant collection of elements that can be operated on in parallel.

_There are two ways to create RDDs:_**
 - parallelizing an existing collection in your driver program, or
 - referencing a dataset in an external storage system, such as a shared file system, HDFS, HBase, or any data source offering a Hadoop Input Format.


### 3. What is DataFrame?
Reference: http://www.edupristine.com/blog/using-spark-sql-engine

Answer:
SparkSQL is a distributed and fault tolerant query engine.  It allows users to run interactive queries on structured and semi-structured data. Structured data is nothing but tabular data which you can break down in rows and columns.

SparkSQL provides programming abstraction called DataFrames and a rich library of functions to load and process data including string manipulation, date arithmetic, common math operations etc.

A DataFrame is a distributed collection of data organized into named columns. It is equivalent to a table in a relational database or a data frame in R/Python.

_DataFrames can be constructed from a wide array of sources such as:_**
 - structured data files,
 - tables in Hive,
 - external databases, or
 - Existing RDDs.

DataFrame API provides operations to filter, group, or compute aggregates, and can be used with Spark SQL.  Once created, dataframes can be manipulated using the various domain-specific-language (DSL) functions.

__SQLContext__
A SQLConext wraps the SparkContext, and adds functions for working with structured data.


### 4. What is DataSet?


## UST Global

### 1. Connection Pool in Spark.  Is the Pool in Worker side or Driver side?  Hint: Broadcast variable
Reference: https://stackoverflow.com/questions/44992934/is-it-the-spark-driver-or-executor-creates-the-database-connection

Answer:
Executors will have their own connection.
Partitions of the table will be retrieved in parallel based on the parameters passed to this function. Don't create too many partitions in parallel on a large cluster; otherwise Spark might crash your external database systems.


### 2. Spark MLib Algorithms


## Saggezza

### Distributed Logs processing with Spark

### Usage of Columnar Database over RDBMS
