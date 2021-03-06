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

def replace_spaces(array, end):
    rshift = len(array) - end - 1
    for i in range(end, -1, -1):
        if array[i] == " ":
            array[i+rshift-2:i+rshift+1] = ["%", "2", "0"]
            rshift -= 2
        else:
            array[i+rshift] = array[i]
    return "".join(array)

def compress(string):
    if len(string) == 0:
        return ""
    lastchar = string[0]
    count = 0
    result = []
    for c in string:
        if c != lastchar:
            result.extend([lastchar, str(count)])
            lastchar = c
            count = 1
        else:
            count += 1
    result.extend([lastchar, str(count)])
    if len(string) < len(result):
        return string
    else:
        return "".join(result)
