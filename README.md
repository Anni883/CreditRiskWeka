# Predictive Credit Risk Assessment using WEKA

## Overview

This project applies data mining and machine learning techniques for credit risk assessment using the WEKA framework. The objective is to predict whether a loan applicant belongs to a good-credit or bad-credit category and identify hidden customer patterns through clustering and association rule mining.

## Objectives

* Build a predictive credit risk model.
* Compare multiple classification algorithms.
* Perform customer segmentation using clustering.
* Discover hidden relationships using association rule mining.
* Evaluate model performance using standard metrics.

## Dataset

* German Credit Dataset
* Instances: ~1000
* Attributes: 21

## Data Preprocessing

* Missing value handling
* Normalization
* Discretization
* SMOTE for class imbalance

## Algorithms Used

### Classification

* Random Forest
* Naive Bayes
* J48 Decision Tree
* SMO (Support Vector Machine)

### Clustering

* K-Means

### Association Rule Mining

* Apriori

## Results

| Algorithm     | Accuracy |
| ------------- | -------- |
| Random Forest | 75.9%    |
| SMO           | 75.2%    |
| Naive Bayes   | 75.0%    |
| J48           | 69.7%    |

### Clustering Insights

* Cluster 0: Short loans, skilled jobs, moderate commitments
* Cluster 1: Large loans with long employment history
* Cluster 2: Stable customers with real-estate ownership

### Association Rules

Strong association rules were discovered with confidence values up to 95%.

## Technologies

* Java
* WEKA
* Machine Learning
* Data Mining

