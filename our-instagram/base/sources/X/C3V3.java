package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.3V3, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3V3 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[LOOP:1: B:27:0x008f->B:29:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Context r6, X.C3UX r7) {
        /*
            java.lang.Integer r1 = r7.A02
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 == r0) goto Lc
            java.lang.Integer r1 = r7.A02
            java.lang.Integer r0 = X.C05F.A0j
            if (r1 != r0) goto Laf
        Lc:
            android.content.pm.PackageInfo r0 = r7.A01
            if (r0 == 0) goto Laf
            android.content.pm.PackageInfo r0 = r7.A01
            android.content.pm.Signature[] r2 = r0.signatures
            if (r2 == 0) goto L4f
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L4f
            r5 = 0
            r0 = r2[r5]
            byte[] r4 = r0.toByteArray()
            java.lang.String r3 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r3)     // Catch: java.security.NoSuchAlgorithmException -> L28 java.security.NoSuchAlgorithmException -> L51
            goto L40
        L28:
            java.lang.String r0 = "org.apache.harmony.security.fortress.Services"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L3c java.security.NoSuchAlgorithmException -> L51
            java.lang.String r1 = "setNeedRefresh"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L3c java.security.NoSuchAlgorithmException -> L51
            java.lang.reflect.Method r2 = r2.getMethod(r1, r0)     // Catch: java.lang.Exception -> L3c java.security.NoSuchAlgorithmException -> L51
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L3c java.security.NoSuchAlgorithmException -> L51
            r2.invoke(r1, r0)     // Catch: java.lang.Exception -> L3c java.security.NoSuchAlgorithmException -> L51
        L3c:
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r3)     // Catch: java.security.NoSuchAlgorithmException -> L51
        L40:
            int r0 = r4.length     // Catch: java.security.NoSuchAlgorithmException -> L51
            r1.update(r4, r5, r0)     // Catch: java.security.NoSuchAlgorithmException -> L51
            byte[] r1 = r1.digest()     // Catch: java.security.NoSuchAlgorithmException -> L51
            r0 = 11
            java.lang.String r5 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.security.NoSuchAlgorithmException -> L51
            goto L52
        L4f:
            r5 = 0
            goto L52
        L51:
            r5 = 0
        L52:
            java.lang.Object r1 = X.C3UY.A00
            X.3Uq r1 = (X.C74123Uq) r1
            X.3UV r0 = X.C3UV.A00(r6)
            boolean r0 = r0.A02
            r0 = r0 ^ 1
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Set r1 = r1.A07
            if (r0 != 0) goto L8b
            X.0cg r3 = X.C0B8.A00
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r1.next()
            X.0B5 r0 = (X.C0B5) r0
            java.util.Set r0 = r3.A00(r0)
            r2.addAll(r0)
            goto L76
        L8a:
            r1 = r2
        L8b:
            java.util.Iterator r1 = r1.iterator()
        L8f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r1.next()
            X.0B5 r0 = (X.C0B5) r0
            java.lang.String r0 = r0.A00
            r4.add(r0)
            goto L8f
        La1:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r4)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto Lb0
            java.lang.Integer r0 = X.C05F.A15
        Lad:
            r7.A02 = r0
        Laf:
            return
        Lb0:
            java.lang.Integer r0 = X.C05F.A0u
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3V3.A00(android.content.Context, X.3UX):void");
    }

    public static boolean A01(Context context, C3UW c3uw, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals(context.getPackageName())) {
            return true;
        }
        C3UX A01 = c3uw.A01(context, str, 64);
        A00(context, A01);
        if (A01.A02 != C05F.A15) {
            return false;
        }
        return true;
    }
}
