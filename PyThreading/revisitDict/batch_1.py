import re
from collections import Counter
from utils.revisit_dict_utils import revisit_dict
from utils.batch_1_prob_stat import batch_one_problem_stat

from functools import reduce
from operator import getitem

revisit_dict_obj = revisit_dict()
choice_based_prob_stat = batch_one_problem_stat().batch_one_problem_stat_by_choice


def dynamic_Nested_large_dictionary_handling(input_param: dict):
    """
    Optimized function to handle large nested dictionaries by reducing redundant calls,
    handling invalid paths, and improving lookup performance.
    """
    complex_dict, dynamic_paths = input_param['complex_dict'], input_param['dynamic_path']
    for path in dynamic_paths:
        try:
            # Pre-split path and use reduce for chained lookup
            path_keys = path.split('.')
            result = reduce(getitem, path_keys, complex_dict)
            print(10 * '#', f'RESULT for {user_choice}', 10 * '#')
            print(f"Value at '{path}': {result}")
        except KeyError:
            print(10 * '#', f'RESULT for {user_choice}', 10 * '#')
            print(f"Key path '{path}' not found.")
        except TypeError:
            print(10 * '#', f'RESULT for {user_choice}', 10 * '#')
            print(f"Invalid structure in the path '{path}'.")


def dynamic_Nested_dictionary_handling(input_param: dict):
    complex_dict, dynamic_paths = input_param['complex_dict'], input_param['dynamic_path']
    for path in dynamic_paths:
        temp_dict_or_value = complex_dict
        path_keys = path.split('.')
        for key in path_keys:
            temp_dict_or_value = temp_dict_or_value.get(key)
            if temp_dict_or_value is None:
                print(f"Key path '{path}' not found.")
                break
        print(temp_dict_or_value)


def frequency_counting_using_dictionaries(input_param: dict) -> dict:
    # list_words = input_param['input_string_freq_count'].split(' ')
    # above code is good but not covering the edge case like if there will be special character in between
    # like we'll, user_name, test-function etc.
    # lets use regex to achieve same
    pattern = r"\b[\w'-_]+\b"
    text = input_param['input_string_freq_count']
    list_words = re.findall(pattern, text)
    freq_by_word = {}
    # for word in list_words:
    #     if word in freq_by_word.keys():
    #         freq_by_word[word] = freq_by_word[word] + 1
    #     else:
    #         freq_by_word[word] = 1

    # although the above for loop and dict manipulation is good,
    # but we can also use Counter class from Collections package
    freq_by_word.update(Counter(list_words))

    print(20 * '#', f'RESULT for {user_choice}', 20 * '#')
    print(freq_by_word)


if __name__ == '__main__':
    choice_based_func_arg = {
        1: {'complex_dict': revisit_dict_obj.complex_nested_dict,
            'dynamic_path': ["company.CEO.salary",
                             'company.departments.engineering.teams.backend.projects.system_architecture',
                             "company.departments.engineering.teams.backend.projects.system_architecture.status"]},
        2: {'input_string_freq_count': 'This is a test. This test is only a test.'}
    }
    choice_based_funct_dict = {
        1: dynamic_Nested_large_dictionary_handling,
        2: frequency_counting_using_dictionaries
    }

    while True:
        print('1. Dynamic Nested Dictionary Handling\n',
              '2. Frequency Counting Using Dictionaries')
        user_choice = int(input("enter the problem number"))
        want_refer_problem_statement = input("Press Y is want to view problem statement else N")
        if want_refer_problem_statement.lower() == 'y':
            print(10 * '#', f'PROBLEM STATEMENT for {user_choice}', 10 * '#')
            print(choice_based_prob_stat[user_choice])
            print(10 * '#', f'END OF PROBLEM STATEMENT for {user_choice}', 10 * '#')
        elif want_refer_problem_statement.lower() == 'n':
            choice_based_funct_dict[user_choice](choice_based_func_arg[user_choice])
        else:
            print(30 * '$$')
            print('opps enter correct choice')
            continue
