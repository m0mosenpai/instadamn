package com.instagram.preferences.device;

import X.AbstractC09440dt;
import X.C0LY;
import X.C0M3;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC100484fC;

/* loaded from: classes.dex */
public final class AppRestartLoggerPrefs {
    public static final AppRestartLoggerPrefs A00 = new Object();
    public static final InterfaceC09390do A01;
    public static final InterfaceC09390do A02;

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(3:18|19|(1:21))|14|15|16))|27|6|7|(0)(0)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if ((r2.getCause() instanceof java.io.IOException) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        X.C0K8.A0F("AppRestartLoggerPrefs", "Error writing to DataStore", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r6, X.InterfaceC16660sJ r7) {
        /*
            r5 = this;
            r3 = 0
            boolean r0 = X.C0Qe.A01(r6, r3)
            if (r0 == 0) goto L21
            r4 = r6
            X.0Qe r4 = (X.C0Qe) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L5a
            goto L27
        L21:
            X.0Qe r4 = new X.0Qe
            r4.<init>(r5, r6, r3)
            goto L15
        L27:
            X.AbstractC09560e7.A00(r1)     // Catch: java.io.IOException -> L47
            goto L57
        L2b:
            X.AbstractC09560e7.A00(r1)
            X.4fC r0 = A00()
            X.4oL r1 = r0.ARC()
            X.0xu r0 = new X.0xu
            r0.<init>(r1)
            r7.invoke(r0)
            r4.A00 = r2     // Catch: java.io.IOException -> L47
            java.lang.Object r0 = r1.ABt(r4)     // Catch: java.io.IOException -> L47
            if (r0 != r3) goto L57
            return r3
        L47:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto L61
            java.lang.String r1 = "AppRestartLoggerPrefs"
            java.lang.String r0 = "Error writing to DataStore"
            X.C0K8.A0F(r1, r0, r2)
        L57:
            X.0eB r3 = X.C0eB.A00
            return r3
        L5a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
        L61:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.preferences.device.AppRestartLoggerPrefs.A02(X.1Ds, X.0sJ):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.instagram.preferences.device.AppRestartLoggerPrefs] */
    static {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        A02 = AbstractC09440dt.A00(enumC09460dv, C0LY.A00);
        A01 = AbstractC09440dt.A00(enumC09460dv, C0M3.A00);
    }

    public static final InterfaceC100484fC A00() {
        return (InterfaceC100484fC) A02.getValue();
    }
}
