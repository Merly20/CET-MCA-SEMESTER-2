import pymongo

conn = pymongo.MongoClient("mongodb://localhost:27017/")
db = conn["mca"]
collection = db["students"]
# collection.insert_many([{"roll": 1, "name": "sweety","mark":100},{"roll": 2, "name": "kannan","mark":100},{"roll": 3, "name": "suu" ,"mark":100},{"roll": 4, "name": "pyaru","mark":100},{"roll": 5, "name": "parthiv","mark":100}])
# print(collection.find_one({"roll":1},{"name":1,"_id":0}))
for doc in collection.find({},{"name":1,"_id":0}).sort({"name":-1}):
   print(doc)
