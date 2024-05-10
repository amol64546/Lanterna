import random
import string
import json

def generate_random_data(num_entries):
    data = []
    for i in range(num_entries):
        entry = {
            "partysimplified": '1'
        }
        data.append(entry)
    return data

def write_json(data, filename):
    with open(filename, 'w') as file:
        json.dump(data, file, indent=4)

# Generate random data
num_entries = 10
random_data = generate_random_data(num_entries)

# Write JSON to file
write_json(random_data, "random_datasdf.json")

print("JSON file generated successfully.")
