#program Programa;
start variable integer_4 Aaavalue;
    input(Aaavalue)
    repeat
        Aaavalue <- Aaavalue - 1
        output(Aaavalue)
    until (Aaavalue >= 1)
stop