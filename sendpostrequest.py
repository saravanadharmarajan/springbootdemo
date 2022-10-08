import requests
import json

url = 'http://localhost:8080/api/services/updatecitizen'
headers = {"Content-Type": "application/json; charset=utf-8"}
payload = {"aadharno":12345,"name":"Testing8","dob":"01-01-1990","email":"abc@test.com","id":12345}

x = requests.post(url,headers=headers,json=payload)

print(x.text)