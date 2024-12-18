package com.facebook.tigon;

/* loaded from: classes5.dex */
public interface TigonErrorReporter {
    void softReport(String str, String str2, Throwable th);

    void softReport(String str, Throwable th);
}
