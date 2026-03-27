import pymongo

conn = pymongo.MongoClient("mongodb://localhost:27017/")
db = conn["mca"]
collection = db["studentmarks"]

for doc in collection.find():
    total = sum(doc["mark"])
    print(doc["name"], "Total Marks:", total)