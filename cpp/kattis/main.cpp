#include <iostream>
#include <string.h>

int main(void) {
    std::string email_in  = "";
    std::string email_out = "";
    getline(std::cin,email_in);
    for (size_t i = 0; i < email_in.length(); i++) {
        if (email_in.at(i) == ' ') {
            continue;
        } else {
            email_out += email_in.at(i);
        }
    }   
    std::cout << email_out << std::endl;
}