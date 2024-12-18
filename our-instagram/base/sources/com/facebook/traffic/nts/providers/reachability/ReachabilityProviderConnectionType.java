package com.facebook.traffic.nts.providers.reachability;

import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.AbstractC25235BEs;

/* loaded from: classes5.dex */
public final class ReachabilityProviderConnectionType {
    public static final int Cell = 2;
    public static final ReachabilityProviderConnectionType INSTANCE = new Object();
    public static final int Max = 4;
    public static final int NoConnection = 1;
    public static final int Unknown = 0;
    public static final int Wifi = 3;

    public final String getName(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "Max";
                        }
                        throw AbstractC25230BEn.A0n("Invalid value: ", i);
                    }
                    return "Wifi";
                }
                return "Cell";
            }
            return "NoConnection";
        }
        return "Unknown";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public final int fromName(String str) {
        switch (AbstractC25235BEs.A07(str)) {
            case 77124:
                if (str.equals("Max")) {
                    return 4;
                }
                throw AbstractC167007dF.A0c("Invalid value: ", str);
            case 2096514:
                if (str.equals("Cell")) {
                    return 2;
                }
                throw AbstractC167007dF.A0c("Invalid value: ", str);
            case 2695989:
                if (str.equals("Wifi")) {
                    return 3;
                }
                throw AbstractC167007dF.A0c("Invalid value: ", str);
            case 803225503:
                if (str.equals("NoConnection")) {
                    return 1;
                }
                throw AbstractC167007dF.A0c("Invalid value: ", str);
            case 1379812394:
                if (str.equals("Unknown")) {
                    return 0;
                }
                throw AbstractC167007dF.A0c("Invalid value: ", str);
            default:
                throw AbstractC167007dF.A0c("Invalid value: ", str);
        }
    }
}
