# Huffman Coding 

This project implements Huffman coding, a popular algorithm used for lossless data compression. Huffman coding assigns variable-length codes to input characters, with shorter codes assigned to more frequent characters, optimizing the overall encoding size.

## Features

- **Encoding**: Encode text files using Huffman coding.
- **Decoding**: Decode previously encoded files to retrieve the original text.
- **Efficient Data Structures**: Utilizes a dynamic heap for efficient construction of the Huffman tree.
- **File I/O**: Read input from text files and write encoded output to a separate file.

## Usage

1. **Compilation**:
   - Compile the Java files using a Java compiler:
     ```bash
     javac HuffmanCode.java DynamicHeap.java Encoder.java Decoder.java Main.java Node.java
     ```

2. **Execution**:
   - Execute the compiled `Main` class to encode the input text file and write the encoded output to a specified file:
     ```bash
     java Main input.txt output.txt
     ```
   - Replace `input.txt` with the path to your input text file and `encoded_output.txt` with the desired name for the encoded output file.

3. **Decoding**:
   - To decode the encoded output and retrieve the original text:
     ```bash
     java Main output.txt
     ```
   - This will decode the content of `encoded_output.txt` and print the decoded text to the console.

## Files

- `HuffmanCode.java`: Main class implementing the Huffman coding algorithm.
- `DynamicHeap.java`: Class implementing a dynamic heap data structure for efficient management of nodes during Huffman tree construction.
- `Encoder.java`: Class responsible for encoding the input text using the Huffman tree.
- `Decoder.java`: Class responsible for decoding the encoded text back to its original form.
- `Main.java`: Entry point of the program, handling input/output and orchestration of encoding and decoding processes.
- `Node.java`: Class representing a node in the Huffman tree.

## Example
Input Text File : ``
A quick brown fox jumps over a lazy dog.``

Output Text File : ``
11111111111011111111111111111111111111111110110111111111111111111011111111111111111111111101111111111111111111111111011111111111111111111111111111111111111111111110111010111111111111011111111101111111111111111111111111111111101011111111110111111111111111111111111111111111111111111111111110110111111111111111101111111111111101111111101111111111111111111111111111011111111111111111111101111111111111110111011111111111111111111111111101111111111111111111111111111111111111111001111111111111111111111111101111111111111111111111011111111111111111111111111111111111111111111111010111111011111110111111111111111110``

## Use Case

Huffman coding finds applications in various areas where efficient data compression is essential. Some common use cases include:

### File Compression

Huffman coding is often used in file compression algorithms like ZIP, gzip, and others. By encoding frequently occurring characters with shorter codes and less frequent characters with longer codes, Huffman coding can significantly reduce the size of text and binary files without losing any information. This makes file transfers faster and reduces storage requirements.

### Network Communication

In network communication protocols, bandwidth is often limited, and minimizing data transfer is crucial. Huffman coding helps reduce the size of transmitted data, leading to faster communication and reduced network congestion. It is commonly used in protocols like HTTP compression (e.g., gzip encoding for web pages) to speed up the loading of web content over the internet.

### Data Storage

In scenarios where storage space is limited or expensive, such as embedded systems or cloud storage services, efficient data compression becomes essential. Huffman coding can be used to compress data before storing it, allowing more data to be stored in the available space without sacrificing data integrity.

### Multimedia Compression

Huffman coding is a fundamental component of many multimedia compression algorithms, including those used for audio (e.g., MP3), images (e.g., JPEG), and videos (e.g., MPEG). By reducing the size of multimedia files, Huffman coding enables streaming services, digital media players, and other applications to deliver high-quality content efficiently over various platforms.

### Data Encryption

Although Huffman coding itself is not encryption, it can be combined with encryption algorithms to improve security and efficiency. In certain encryption schemes, such as hybrid encryption, data compression is applied before encryption to reduce the size of plaintext, leading to faster encryption and decryption processes.


