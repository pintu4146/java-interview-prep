class Person:
    def __init__(self, age, name):
        self.age = age
        self.name = name

    def __repr__(self):
        return f"Person(age={self.age}, name='{self.name}')"


class SortByAge:
    personList = [Person(i, f'pin{i}') for i in range(10, 26)]
    sorted_by_age = sorted(personList, key= lambda person: person.age, reverse=True)
    print(sorted_by_age)
