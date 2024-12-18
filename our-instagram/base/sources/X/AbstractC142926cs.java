package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC142926cs {
    public static final boolean A02;
    public static final AtomicReference A01 = new AtomicReference();
    public static final Map A00 = new ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r2 != false) goto L6;
     */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            X.AbstractC142926cs.A01 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            X.AbstractC142926cs.A00 = r0
            java.util.Properties r3 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L2d
            java.lang.String r0 = r3.getProperty(r1)
            boolean r2 = java.lang.Boolean.parseBoolean(r0)
            if (r2 == 0) goto L36
        L24:
            java.lang.String r1 = "rx2.purge-period-seconds"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L36
            goto L2f
        L2d:
            r2 = 1
            goto L24
        L2f:
            java.lang.String r0 = r3.getProperty(r1)     // Catch: java.lang.NumberFormatException -> L36
            java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L36
        L36:
            X.AbstractC142926cs.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC142926cs.<clinit>():void");
    }
}
