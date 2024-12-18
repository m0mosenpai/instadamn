package com.facebook.papaya.log;

import X.C09170dP;

/* loaded from: classes9.dex */
public class Log {
    public static native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static native void nativeRemoveLogSink(String str);

    static {
        C09170dP.A0C("papaya-log");
    }
}
