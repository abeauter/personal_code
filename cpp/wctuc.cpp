/*
 *  This program will attempt convert a Windows format text file to a Unix text file.
 *  Meaning this will scan the text in the file and replace the newline and line feed
 *  with simply a newline. I do not anticipate anyone would use this - as there surely
 *  is a program out there that will simply scrape that stuff but....
 *
 *  Version 0.1.0
 *
*/
#include <assert.h>
#include <fstream>
#include <iostream> 
#include <string.h>

const std::string NO_FILENAME_ERROR = "READ DOC COMMENTS";

int main(int argc, char* argv[]) {
    assert(argc != 1); 
    std::string windows_filename = argv[1];
    std::cout << windows_filename;
 
    std::fstream windows_fstream;
    windows_fstream.open(windows_filename);
    assert(windows_fstream.is_open());
    while (!infile.eof()) {
        
    }
    
}
