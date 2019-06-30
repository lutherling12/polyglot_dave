//\u000a/*
#include <stdio.h>
#include <unistd.h>

int main(int argc, char* argv[])
{
	int count;
	printf("Hello Lightnin!\n\n");
	sleep(2);

	if(argc > 1)
	{
		printf("There were %d arguments on the command line.\n\n", argc);
	}

	for (count = 0; count <= 10; count++)
	{
		printf("Counting up: %d\n", count);
		sleep(1);
	}
	printf("\n");
	sleep(2);

	count = 10;
	while(count >= 0)
	{
		printf("Counting down: %d\n", count);
		count--;
		sleep(1);
	}
	printf("\nBYE!\n");
	sleep(2);

	return 0;
}
//*/

/*\u002a/
class Counting
{
	public static void main(String args[]){
		System.out.println("Hello Lightnin!\n");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		if(args.length > 1) {
			System.out.printf(
				"There were %d arguments on the command line.\n\n",
				args.length
			);
		}

		for(int i = 0; i <= 10; i++) {
			System.out.printf("Counting up: %d\n", i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.printf("\n");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		int count = 10;
		while(count >= 0) {
			System.out.printf("Counting down: %d\n", count);
			count--;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.printf("\nBYE!\n");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
		}
	}
}
/*\u002a/
// */
