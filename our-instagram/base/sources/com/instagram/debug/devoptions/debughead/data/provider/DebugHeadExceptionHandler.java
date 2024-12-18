package com.instagram.debug.devoptions.debughead.data.provider;

import X.AbstractC167017dG;
import X.C0K8;
import X.C17280tP;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class DebugHeadExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static final Companion Companion = new Object();
    public static final Class TAG = DebugHeadExceptionHandler.class;
    public static DebugHeadExceptionHandler handler;

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Thread$UncaughtExceptionHandler, com.instagram.debug.devoptions.debughead.data.provider.DebugHeadExceptionHandler, java.lang.Object] */
    public final void init() {
        if (handler == null) {
            ?? obj = new Object();
            handler = obj;
            Thread.setDefaultUncaughtExceptionHandler(obj);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        AbstractC167017dG.A1N(thread, th);
        StringWriter stringWriter = new StringWriter();
        try {
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                th.printStackTrace(printWriter);
                printWriter.close();
            } finally {
            }
        } catch (RuntimeException e) {
            C0K8.A05(TAG, "error with DebugExceptionHandler PrintWriter", e);
        }
        C17280tP A00 = C17280tP.A4E.A00();
        A00.A0S.Egi(A00, stringWriter.toString(), C17280tP.A4G[87]);
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            defaultUncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
