#program Programa;
start variable integer_4 Argvalue, Resvalue, Cycvalue;
    input(Argvalue)
    Resvalue <- 1
    for Cycvalue <- 0 to 32767 do
        if (Argvalue != 0) ; else goto Endcycle;
        Resvalue <- Resvalue * Argvalue
        Argvalue <- Argvalue - 1
    ;
    Endcycle:
    output(Resvalue)
stop