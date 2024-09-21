# Using threading module
import threading


# Implementing with function
def func():
    print("func is running")

def my_function():
    print("Thread is running using threading module.")


thread = threading.Thread(target=my_function)
thread2 = threading.Thread(target=func)
thread.start()
thread2.start()
