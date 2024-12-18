package com.facebook.traffic.nts.providers.startup;

import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.C14360o3;

/* loaded from: classes5.dex */
public final class StartupSignalsProviderStartupType {
    public static final int Cold = 0;
    public static final StartupSignalsProviderStartupType INSTANCE = new Object();
    public static final int Warm = 1;

    public final int fromName(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals("Cold")) {
            return 0;
        }
        if (str.equals("Warm")) {
            return 1;
        }
        throw AbstractC167007dF.A0c("Invalid value: ", str);
    }

    public final String getName(int i) {
        if (i != 0) {
            if (i == 1) {
                return "Warm";
            }
            throw AbstractC25230BEn.A0n("Invalid value: ", i);
        }
        return "Cold";
    }
}
