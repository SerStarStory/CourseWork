#program Programa;
start variable integer_4 Inpvalue, Dividera, Remainde, Cycleaca, Cyclebca, Cyclecca;
    input(Inpvalue)
    Inpvalue <- Inpvalue + 1
    for Cycleaca <- 0 to 32767 do
        Dividera <- Inpvalue - 1
        for Cyclebca <- 0 to 32767 do
            if (Dividera >= 2); else goto Endcyclb;
            Remainde <- Inpvalue
            for Cyclecca <- 0 to 32767 do
                if (Remainde >= Dividera); else goto Endcyclc;
                Remainde <- Remainde - Dividera
            ;
            Endcyclc:
            if (Remainde == 0) goto Endcyclb;
            Dividera <- Dividera - 1
        ;
        Endcyclb:
        if (Devidera == 1) goto Endcycla;
        Inpvalue <- Inpvalue + 1
    ;
    Endcycla:
    output(Inpvalue)
    input(Inpvalue)
stop