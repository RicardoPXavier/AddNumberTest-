package edu.utfpr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add {

    public List<Integer> add(List<Integer> left, List<Integer> right) {
        if (left == null || right == null) {
            throw new IllegalArgumentException("Input lists cannot be null");
        }

        for (Integer num : left) {
            if (num == null || num < 0 || num > 9) {
                throw new IllegalArgumentException("Input lists can only contain digits between 0 and 9");
            }
        }

        for (Integer num : right) {
            if (num == null || num < 0 || num > 9) {
                throw new IllegalArgumentException("Input lists can only contain digits between 0 and 9");
            }
        }

        List<Integer> reversedLeft = new ArrayList<>(left);
        List<Integer> reversedRight = new ArrayList<>(right);
        Collections.reverse(reversedLeft);
        Collections.reverse(reversedRight);

        int maxLength = Math.max(reversedLeft.size(), reversedRight.size());
        List<Integer> result = new ArrayList<>(maxLength + 1);

        int carry = 0;
        for (int i = 0; i < maxLength; i++) {
            int leftDigit = (i < reversedLeft.size()) ? reversedLeft.get(i) : 0;
            int rightDigit = (i < reversedRight.size()) ? reversedRight.get(i) : 0;

            int sum = leftDigit + rightDigit + carry;
            carry = sum / 10;
            result.add(sum % 10);
        }

        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }
}
