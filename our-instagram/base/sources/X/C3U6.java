package X;

import android.content.Context;
import com.google.android.gms.common.zzl;

/* renamed from: X.3U6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3U6 {
    public static C3U6 A01;
    public final Context A00;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0021, code lost:
    
        if ((r0.flags & 129) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r6 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(android.content.pm.PackageInfo r6, boolean r7) {
        /*
            r3 = 1
            r5 = 0
            if (r7 == 0) goto L63
            if (r6 == 0) goto L3a
            java.lang.String r1 = r6.packageName
            java.lang.String r0 = "com.android.vending"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24
        L18:
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo
            if (r0 == 0) goto L23
            int r0 = r0.flags
            r0 = r0 & 129(0x81, float:1.81E-43)
            r7 = 1
            if (r0 != 0) goto L24
        L23:
            r7 = 0
        L24:
            android.content.pm.Signature[] r1 = r6.signatures
            if (r1 == 0) goto L3a
            if (r7 == 0) goto L5a
            com.google.android.gms.common.zzj[] r4 = X.C3UH.A00
        L2c:
            int r0 = r1.length
            if (r0 == r3) goto L3b
            r0 = 564(0x234, float:7.9E-43)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            java.lang.String r0 = "Package has more than one signature."
            android.util.Log.w(r1, r0)
        L3a:
            return r5
        L3b:
            r2 = 0
            r0 = r1[r5]
            byte[] r0 = r0.toByteArray()
            com.google.android.gms.common.zzk r1 = new com.google.android.gms.common.zzk
            r1.<init>(r0)
        L47:
            int r0 = r4.length
            if (r2 >= r0) goto L3a
            r0 = r4[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L57
            r0 = r4[r2]
            if (r0 == 0) goto L3a
            return r3
        L57:
            int r2 = r2 + 1
            goto L47
        L5a:
            com.google.android.gms.common.zzj[] r0 = X.C3UH.A00
            r0 = r0[r5]
            com.google.android.gms.common.zzj[] r4 = new com.google.android.gms.common.zzj[]{r0}
            goto L2c
        L63:
            if (r6 == 0) goto L3a
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3U6.A01(android.content.pm.PackageInfo, boolean):boolean");
    }

    public C3U6(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static C3U6 A00(Context context) {
        C3U5.A02(context);
        synchronized (C3U6.class) {
            if (A01 == null) {
                zzl zzlVar = C3U7.A01;
                synchronized (C3U7.class) {
                    if (C3U7.A00 == null) {
                        if (context != null) {
                            C3U7.A00 = context.getApplicationContext();
                        }
                    } else {
                        android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                A01 = new C3U6(context);
            }
        }
        return A01;
    }
}
