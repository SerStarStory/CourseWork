#PROGRAM pROGRAMA;
VARIABLE INTEGER16_t aAAVALUE, bBBVALUE, xXXVALUE;
START
    SCAN(aAAVALUE)
    SCAN(bBBVALUE)
    xXXVALUE <- 10 * (aAAVALUE - bBBVALUE) + (aAAVALUE + bBBVALUE) / 10
    PRINT(xXXVALUE)
    SCAN(aAAVALUE)
STOP

