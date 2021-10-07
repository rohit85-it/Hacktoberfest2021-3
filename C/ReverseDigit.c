#include <stdio.h>
int reversDigits(int num)
{
	bool negativeFlag = false;
	if (num < 0)
	{
		negativeFlag = true;
		num = -num ;
	}

	int prev_rev_num = 0, rev_num = 0;
	while (num != 0)
	{
		int curr_digit = num%10;

		rev_num = (rev_num*10) + curr_digit;
		if ((rev_num - curr_digit)/10 != prev_rev_num)
		{
			printf("WARNING OVERFLOWED!!!\n");
			return 0;
		}

		prev_rev_num = rev_num;
		num = num/10;
	}

	return (negativeFlag == true)? -rev_num : rev_num;
}

int main(void)
{
	int num = 12345;
	printf("Reverse of no. is %d\n", reversDigits(num));

	num = 1000000045;
	printf("Reverse of no. is %d\n", reversDigits(num));

	return 0;
}
