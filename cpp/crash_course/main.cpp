#include <iostream> 

int main(void) {

    enum class Operation {
        Add,
        Subtract, 
        Multiply,
        Divide
    };
    Operation user_operation;
    
    struct Calculator {
        int calculate(int a, int b) {
                std::cout << "A + B = " << a+b << std::endl;
                std::cout << "A - B = " << a-b << std::endl;
                std::cout << "A * B = " << a*b << std::endl;
                std::cout << "A * B = " << a/b << std::endl;
        }
        Calculator(Operation) {
            switch(Operation::user_operation): {
                case Operation::Add {
                    break;
                }
            }
        };
    };
}