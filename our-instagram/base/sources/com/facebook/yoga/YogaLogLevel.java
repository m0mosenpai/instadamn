package com.facebook.yoga;

import X.AbstractC111324zv;
import X.AbstractC25230BEn;

/* loaded from: classes8.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    public final int mIntValue;

    public static YogaLogLevel fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return FATAL;
                            }
                            throw AbstractC25230BEn.A0n(AbstractC111324zv.A00(1843), i);
                        }
                        return VERBOSE;
                    }
                    return DEBUG;
                }
                return INFO;
            }
            return WARN;
        }
        return ERROR;
    }

    YogaLogLevel(int i) {
        this.mIntValue = i;
    }
}
