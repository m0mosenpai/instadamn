package com.facebook.profilo.provider.stacktrace;

import X.C09170dP;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ArtCompatibility {
    public static final AtomicReference sIsCompatible;

    public static native boolean nativeCheck(int i);

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e1, code lost:
    
        if (r2.equals("7.1") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f0, code lost:
    
        if (r2.equals("7.0") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ff, code lost:
    
        if (r2.equals("6.0") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x010c, code lost:
    
        if (r2.equals("5.1") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x011b, code lost:
    
        if (r2.equals("5.0") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012a, code lost:
    
        if (r2.equals("9") != false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0155 A[Catch: IOException -> 0x016f, TryCatch #3 {IOException -> 0x016f, blocks: (B:9:0x0016, B:12:0x002d, B:17:0x0147, B:18:0x014a, B:20:0x0155, B:101:0x016e, B:100:0x016b, B:27:0x003e, B:28:0x0044, B:31:0x0132, B:37:0x0143, B:42:0x0049, B:45:0x012c, B:46:0x0053, B:48:0x005b, B:49:0x0063, B:51:0x006b, B:52:0x0073, B:54:0x007b, B:55:0x0083, B:57:0x008b, B:58:0x0093, B:61:0x00e3, B:62:0x009c, B:65:0x00f2, B:66:0x00a5, B:69:0x0101, B:70:0x00ae, B:73:0x010e, B:74:0x00b7, B:77:0x00c0, B:80:0x011d, B:81:0x00c9, B:84:0x00d2, B:87:0x00db, B:89:0x00ea, B:91:0x00f9, B:93:0x0106, B:95:0x0115, B:97:0x0124, B:25:0x0161, B:40:0x0166, B:14:0x0032, B:36:0x0140), top: B:8:0x0016, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isCompatible(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }

    static {
        C09170dP.A0C("profilo_stacktrace");
        sIsCompatible = new AtomicReference(null);
    }
}
