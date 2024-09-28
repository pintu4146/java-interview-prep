from utils.revisit_dict_utils import revisit_dict

from functools import reduce
from operator import getitem

revisit_dict_obj = revisit_dict()


def dynamic_Nested_large_dictionary_handling(complex_dict, dynamic_paths):
    """
    Optimized function to handle large nested dictionaries by reducing redundant calls,
    handling invalid paths, and improving lookup performance.
    """
    for path in dynamic_paths:
        try:
            # Pre-split path and use reduce for chained lookup
            path_keys = path.split('.')
            result = reduce(getitem, path_keys, complex_dict)
            print(f"Value at '{path}': {result}")
        except KeyError:
            print(f"Key path '{path}' not found.")
        except TypeError:
            print(f"Invalid structure in the path '{path}'.")


def dynamic_Nested_dictionary_handling(complex_dict, dynamic_paths):
    for path in dynamic_paths:
        temp_dict_or_value = complex_dict
        path_keys = path.split('.')
        for key in path_keys:
            temp_dict_or_value = temp_dict_or_value.get(key)
            if temp_dict_or_value is None:
                print(f"Key path '{path}' not found.")
                break
        print(temp_dict_or_value)


if __name__ == '__main__':
    complex_dict = revisit_dict_obj.complex_nested_dict
    dynamic_path = ["company.CEO.salary", 'company.departments.engineering.teams.backend.projects.system_architecture',
                    "company.departments.engineering.teams.backend.projects.system_architecture.status"]
    #dynamic_Nested_dictionary_handling(complex_dict, dynamic_path)
    dynamic_Nested_large_dictionary_handling(complex_dict, dynamic_path)
'''
1. Dynamic Nested Dictionary Handling
Given a dynamically nested dictionary, write a Python function that can retrieve any value from the dictionary using a string-based path.

Example input:

python
Copy code
nested_dict = {
    "level1": {
        "level2": {
            "level3": {
                "value": 42
            }
        }
    }
}

path = "level1.level2.level3.value"
Expected output: 42

Requirements:

Handle paths of arbitrary length.
Raise an error if the path is invalid.
Optimize for performance if the dictionary is very large.'''
