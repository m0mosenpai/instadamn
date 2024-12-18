package com.facebook.traffic.nts.providers.background;

import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.AbstractC25235BEs;

/* loaded from: classes5.dex */
public final class BackgroundFnExecutionResult {
    public static final int Failed = 2;
    public static final BackgroundFnExecutionResult INSTANCE = new Object();
    public static final int NewData = 0;
    public static final int NoData = 1;

    public final String getName(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "Failed";
                }
                throw AbstractC25230BEn.A0n("Invalid value: ", i);
            }
            return "NoData";
        }
        return "NewData";
    }

    public final int fromName(String str) {
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != -1957259989) {
            if (A07 != -785590966) {
                if (A07 == 2096857181 && str.equals("Failed")) {
                    return 2;
                }
            } else if (str.equals("NewData")) {
                return 0;
            }
        } else if (str.equals("NoData")) {
            return 1;
        }
        throw AbstractC167007dF.A0c("Invalid value: ", str);
    }
}
