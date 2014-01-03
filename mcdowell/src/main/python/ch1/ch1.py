def unique(string):
    counter = {}
    for c in string:
        if c in counter:
            return False
        else:
            counter[c] = 1
    else:
        return True

def reverse(string):
    result = []
    for i in range(len(string)):
        result.append(string[-(i+1)])
    return "".join(result)

def is_permutation(str1, str2):
    if len(str1) != len(str2):
        return False
    counter = {}
    for i in range(len(str1)):
        if str1[i] in counter:
            counter[str1[i]] += 1
        else:
            counter[str1[i]] = 1
        if str2[i] in counter:
            counter[str2[i]] -= 1
        else:
            counter[str2[i]] = -1
    for k in counter:
        if counter[k] != 0:
            return False
    else:
        return True
