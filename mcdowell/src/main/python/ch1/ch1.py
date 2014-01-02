def unique(string):
    counter = {}
    for c in string:
        if c in counter:
            counter[c] += 1
        else:
            counter[c] = 1
    print(counter)
    for k in counter:
        if counter[k] > 1:
            return False
    else:
        return True

def reverse(string):
    result = []
    for i in range(len(string)):
        result.append(string[-(i+1)])
    return "".join(result)

