/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

int* plusOne(int* digits, int digitsSize, int* returnSize) {

    for (int i = digitsSize - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i] += 1;

            int* result = malloc(sizeof(int) * digitsSize);
            for (int j = 0; j < digitsSize; j++) {
                result[j] = digits[j];
            }

            *returnSize = digitsSize;
            return result;
        }

        digits[i] = 0;
    }

    int* arr = malloc(sizeof(int) * (digitsSize + 1));
    arr[0] = 1;
    for (int i = 1; i <= digitsSize; i++) {
        arr[i] = 0;
    }

    *returnSize = digitsSize + 1;
    return arr;
}
