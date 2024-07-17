public class operatorsAndBinaryNumberSystem {
    public static void main (String[] args){
        /* 
        OPERATORS->
        Symbols that tell compiler to perform some opertion

        ~~Arithmetic Operators ->
        Binary (2 operands)                Unary (1 operand)
        +(addition)                        ++
        -(subtraction)                     --
        *(multiplication)
        /(division)
        %(modulo -> gives remainder)

        PreIncrement                                PostIncrement  
            ++a                                          a++
        1. change value                             1. use value
        2. use value                                2. change value

        int a = 10;                                 int a = 10;
        int b = 0;                                  int b = 0;

        b = ++a;                                    b = a++;
        System.out.println(a); // 11                System.out.println(a); // 11
        System.out.println(b); // 11                System.out.println(b); // 10

        PreDecrement                                PostDecrement
            --a                                         a--
        1. change value                             1. value assign
        2. value assign                             2. value change

        int a = 10;                                 int a = 10;
        int b = 0;                                  int b = 0;

        b = --a;                                    b = a--;
        System.out.println(a); // 9                 System.out.println(a); // 9
        System.out.println(b); // 9                 System.out.println(b); // 10

        ~~Relational Operators ->
        == -> equal to 
        != -> not equal to 
        > -> greater than
        < -> less than
        >= greater than equal to 
        <= less than equal to 

        ~~ Logical Operators ->
        1. && (Logical AND)
        2. || (Logical OR)
        3. ! (Logical NOT)

        ~~ Binary Number System (base2)
        -> convert binary to decimal
        -> convert decimal to binary

        0 -> 000
        1 -> 001
        2 -> 010
        3 -> 011
        4 -> 100
        5 -> 101
        6 -> 110
        7 -> 111
        8 -> 1000
        9 -> 1001
        10-> 1010
        11-> 1011
        12-> 1100
        13-> 1101
        14-> 1110
        15-> 1111

        ~~Bitwise Operators ->
        &  (Binary AND)
          0101                          True -> 1
        & 0110                          False -> 0
          0100 ans.

        | (Binary OR)
          0101
        | 0110
          0111 ans.

        ^ (Binary XOR)
          0101                          similar values -> false
        ^ 0110                          different values -> true 
          0011 ans.

        ~ (Binary One's complement)

        A = 0101                      1->0,  0->1 
        ~A = 1010 
        
        << (Binary Left Shift)

        A << 1  => 0101 -> 0010
        B << 1  => 0110 -> 0011

        >> (Binary Right Shift)

        A >> 1  => 0101 -> 0010
        B >> 1  => 0110 -> 0011
        
        ~~ Assignment Operators -> 
        =
        +=
        -=
        *=
        /=
        %=

        
        */
    }
}
