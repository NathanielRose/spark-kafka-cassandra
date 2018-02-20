// Databricks notebook source
dbutils.fs.mount(
  source = "wasbs://rakutentest@databricksblock.blob.core.windows.net",
  mountPoint = "/mnt/rakutentest3",
  extraConfigs = Map("fs.azure.account.key.databricksblock.blob.core.windows.net" -> "WPw7WuBSfajXVzlDz0SN3o8Cd4ZqXTH8cwnhsjzG2PimnEoJl78JLH2Bx5Jd7Jc3Mm38ATth7z9YUsuc1MAtw=="))


 

// COMMAND ----------

// MAGIC %python
// MAGIC 1+1
// MAGIC 
// MAGIC print("Testing from chrome")