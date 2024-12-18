package X;

import android.content.Context;
import android.os.Build;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: X.3UV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UV {
    public static C3UV A04;
    public static final Date A05 = new Date(Build.TIME);
    public static final Pattern A06 = Pattern.compile("^([0-9]+)L$");
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final Date A03;

    public static synchronized C3UV A00(Context context) {
        C3UV c3uv;
        synchronized (C3UV.class) {
            c3uv = A04;
            if (c3uv == null) {
                c3uv = new C3UV(context);
                A04 = c3uv;
            }
        }
        return c3uv;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(4:3|(1:5)|6|(1:8))(1:37)|9|(2:17|(6:21|22|23|24|25|26))|36|22|23|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r1.getCause() == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3UV(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r2 = r5.getPackageName()
            X.3UW r1 = X.C3UW.A02
            r0 = 128(0x80, float:1.8E-43)
            X.3UX r3 = r1.A01(r5, r2, r0)
            android.content.pm.PackageInfo r0 = r3.A01
            java.lang.String r2 = "1"
            java.lang.String r1 = "unknown"
            if (r0 == 0) goto L74
            android.content.pm.PackageInfo r0 = r3.A01
            java.lang.String r0 = r0.versionName
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L25
            android.content.pm.PackageInfo r0 = r3.A01
            java.lang.String r1 = r0.versionName
        L25:
            r4.A01 = r1
            android.content.pm.PackageInfo r0 = r3.A01
            int r0 = r0.versionCode
            if (r0 <= 0) goto L35
            int r0 = com.facebook.common.build.BuildConstants.A01()
            java.lang.String r2 = java.lang.String.valueOf(r0)
        L35:
            r4.A00 = r2
            android.content.pm.PackageInfo r0 = r3.A01
            if (r0 == 0) goto L71
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            if (r0 == 0) goto L71
            android.os.Bundle r1 = r0.metaData
            if (r1 == 0) goto L71
            java.lang.String r0 = "com.facebook.build_time"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L71
            java.lang.String r1 = r0.toString()
            java.util.regex.Pattern r0 = X.C3UV.A06
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L71
            r0 = 1
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L71
            long r1 = java.lang.Long.parseLong(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
        L6b:
            r0.toString()
            r4.A03 = r0
            goto L77
        L71:
            java.util.Date r0 = X.C3UV.A05
            goto L6b
        L74:
            r4.A01 = r1
            goto L35
        L77:
            boolean r0 = X.AbstractC08450c9.A02(r5)     // Catch: java.lang.SecurityException -> L7c
            goto L90
        L7c:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto L93
            java.lang.Throwable r0 = r1.getCause()
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L93
            r0 = 0
        L90:
            r4.A02 = r0
            return
        L93:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3UV.<init>(android.content.Context):void");
    }
}
