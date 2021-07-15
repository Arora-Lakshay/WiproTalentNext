/*
 *
 * Date : July 6, 2021
 * Submitted By : Lakshay
 *
 */

// PS1: Is M multiple of N ?
public class Solution1 {
	public int isMultiple(int input1, int input2) {
		if(input1 != 0 && input2 != 0) {
			return input1 % input2 == 0 ? 2 : 1;
		}
		return 3;
	}
}

// PS2: nth Fibonacci
public class Solution2 {
	public long nthFibonacci(int input1) {
		if (input1 == 1) {
			return 0;
		}
		if (input1 == 2) {
			return 1;
		}
		return nthFibonacci(input1 - 1) + nthFibonacci(input1 - 2);
	}
}

// PS3: No. of Primes in a range
public class Solution3 {
	public int countPrimesInRange(int input1, int input2) {
		int primes = 0;
		for(int i = input1; i <= input2; i++) {
			boolean is_prime = true;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					is_prime = false;
				}
			}
			if(is_prime) {
				primes++;
			}
		}
		return primes;
	}
}

// PS4: Is Palindrome Number ?
public class Solution4 {
	public int isPalinNum(int input1) {
		int num = input1;
		int num_reversed = 0;
		while(num != 0) {
			int last_digit = num % 10;
			num_reversed = num_reversed * 10 + last_digit;
			num /= 10;
		}
		return num_reversed == input1 ? 2 : 1;
	}
}

// PS5: Weight of Hill Pattern
public class Solution5 {
	public int totalHillWeight(int input1, int input2, int input3) {
		int total_weight = 0;
		int cur_level_weight = input2;
		for(int i = 1; i <= input1; i++) {
			total_weight += cur_level_weight * i;
			cur_level_weight += input3;
		}
		return total_weight;
	}
}

// PS6: Most Frequent Digit
public class Solution6 {
	public int mostFrequentDigit(int input1, int input2, int input3, int input4) {
		int[] freq = new int[10];
		
		int[] nums = { input1, input2, input3, input4 };
		int max_freq = 0;
		int max_freq_index = -1;

		for(int i : nums) {
			while(i != 0) {
				int dig = i % 10;
				freq[dig] += 1;
				i /= 10;
			}
		}

		max_freq_index = 9;
		max_freq = freq[max_freq_index];
		for(int i = 8; i >= 0; i--) {
			if(max_freq < freq[i]) {
				max_freq = freq[i];
				max_freq_index = i;
			}
		}
		return max_freq_index;
	}
}

// PS7: Weight of String
public class Solution7 {
	public int weightOfString(String input1, int input2) {
		int total_weight = 0;
		boolean count_vowel = input2 == 1 ? true : false;
		for(int i = 0; i < input1.length(); i++) {
			char ch = input1.toLowerCase().charAt(i);
			int cur_char_weight = 0;
			if(ch >= 97 && ch <= 122) {
				if(!count_vowel && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
					cur_char_weight = 0;	
				} else {
					cur_char_weight = ch - 'a' + 1;
				}
			}
			total_weight += cur_char_weight;
		}
		return total_weight;
	}
}


// PS8: Non-Repeated Digits Count
public class Solution8 {
	public int nonRepeatedDigitsCount(int input1) {
		int[] freq = new int[10];
		int num = input1;
		int non_repeated_count = 0;

		while(num != 0) {
			int dig = num % 10;
			freq[dig] += 1;
			num /= 10;
		}
		for(int i : freq) {
			if(i == 1) {
				non_repeated_count++;
			}
		}
		return non_repeated_count;
	}
}

// PS9: Unique Digits Count
public class Solution9 {
	public int uniqueDigitsCount(int input1) {
		int[] set = new int[10];
		int num = input1;
		int unique_digits = 0;

		while(num != 0) {
			int dig = num % 10;
			if(set[dig] == 0) {
				set[dig] = 1;
			}
			num /= 10;
		}

		for(int i : set) {
			if(i == 1) {
				unique_digits++;
			}
		}
		return unique_digits;
	}
}

// PS10: Is Palindrome Possible
public class Solution10 {
	public int isPalinNumPossible(int input1) {
		int[] freq = new int[10];
		int num = input1;
		int odd_freq_count = 0;

		while(num != 0) {
			int dig = num % 10;
			freq[dig] += 1;
			num /= 10;
		}

		for(int i : freq) {
			if(i % 2 == 1) {
				odd_freq_count++;
			}
		}

		return odd_freq_count > 1 ? 1 : 2;
	}
}
