import threading

lock = threading.Lock()
current_num = 1
num_upto = 100

def even():
    global current_num
    while current_num < num_upto:
        with lock:
            if (current_num & 1) == 0:
                print(f"Even thread: {current_num}")
                current_num+=1


def odd():
    global current_num
    while current_num < num_upto:
        with lock:
            if (current_num & 1) == 1:
                print(f"Odd thread: {current_num}")
                current_num += 1


if __name__ == "__main__":
    even_printing_thread = threading.Thread(target=even)
    even_printing_thread.start()
    odd_printing_thread = threading.Thread(target=odd)
    odd_printing_thread.start()
    even_printing_thread.join()
    odd_printing_thread.join()
    print("\nall num has been printed")

