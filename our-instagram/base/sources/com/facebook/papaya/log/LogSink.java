package com.facebook.papaya.log;

import X.C09170dP;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class LogSink {
    public abstract void event(long j, long j2, long j3, int i, Map map, String str);

    public abstract void log(long j, long j2, long j3, int i, String str, int i2, String str2);

    static {
        C09170dP.A0C("papaya-log");
    }
}
