package com.facebook.traffic.nts.providers.fgbg;

import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.AbstractC25235BEs;

/* loaded from: classes5.dex */
public final class AppFgBgState {
    public static final int Background = 2;
    public static final int Foreground = 1;
    public static final AppFgBgState INSTANCE = new Object();
    public static final int Unknown = 0;

    public final String getName(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "Background";
                }
                throw AbstractC25230BEn.A0n("Invalid value: ", i);
            }
            return "Foreground";
        }
        return "Unknown";
    }

    public final int fromName(String str) {
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != -317045405) {
            if (A07 != 661270862) {
                if (A07 == 1379812394 && str.equals("Unknown")) {
                    return 0;
                }
            } else if (str.equals("Background")) {
                return 2;
            }
        } else if (str.equals("Foreground")) {
            return 1;
        }
        throw AbstractC167007dF.A0c("Invalid value: ", str);
    }
}
