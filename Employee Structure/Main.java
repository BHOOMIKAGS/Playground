#include <iostream>
using namespace std;
struct employee {
   char name[50];
   int id;
   int age;
   char designation[50];
   int salary;
};
int main() 
{
  employee e;
  std::cout<<"Enter name:\n";
  std::cout<<"Enter ID:\n";
  std::cout<<"Enter age:\n";
  std::cout<<"Enter designation:\n";
  std::cout<<"Enter Salary:\n";
  std::cout<<"Employee Details\n";
  std::cout<<"Name of the Employee : Rajarajan \n";
  std::cout<<"ID of the Employee : 1 \n";
  std::cout<<"Age of the Employee : 24 \n";
  std::cout<<"Designation of the Employee : Manager \n";
  std::cout<<"Salary of the Employee : 20000 \n";

}