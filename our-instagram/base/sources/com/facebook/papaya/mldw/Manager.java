package com.facebook.papaya.mldw;

import X.AbstractC166987dD;
import X.C09170dP;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes9.dex */
public class Manager {
    public static final Map sHosts;

    public static native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static native SettableFuture nativeCleanup(int i);

    public static native Host nativeRegisterHost(int i, ScheduledExecutorService scheduledExecutorService, String str, ITransport iTransport, ImmutableList immutableList);

    public static native void nativeRemoveLogSink(String str);

    public static native void nativeUnregisterHost(int i);

    static {
        C09170dP.A0C("papaya-mldw");
        sHosts = AbstractC166987dD.A1G();
    }
}
