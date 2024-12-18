package com.facebook.simplejni;

import X.C09170dP;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public class CoreFunctions {
    public static native void runWithClassLoader(long j, long j2);

    static {
        C09170dP.A0C("simplejni");
    }

    public static String getErrorDescription(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
