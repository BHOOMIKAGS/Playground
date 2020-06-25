/* C++ Program - Compare Two String */
		
#include<iostream>
#include<string.h>
int main()
{
	char str1[100], str2[100];
	std::cin>>str1;
	std::cin>>str2;
	if(strcmp(str1, str2)==0)
	{
		std::cout<<"It is correct";
	}
	else
	{
		std::cout<<"It is wrong";
    }
}