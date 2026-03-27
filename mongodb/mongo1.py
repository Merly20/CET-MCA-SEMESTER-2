import pymongo

conn = pymongo.MongoClient("mongodb://localhost:27017/")
db = conn["student"]
print(conn.list_database_names())
collection = db["marks"]

 # insert data
collection.insert_many([{"roll": 103, "name": "sweety"},{"roll": 104, "name": "kannan"}])

# find data
for doc in collection.find():
    print(doc)